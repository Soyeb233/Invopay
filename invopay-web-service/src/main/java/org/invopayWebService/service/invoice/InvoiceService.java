package org.invopayWebService.service.invoice;

import com.lowagie.text.*;
import com.lowagie.text.pdf.PdfWriter;
import org.invopayWebService.dto.client.ClientInvoiceDTO;
import org.invopayWebService.dto.invoice.*;
import org.invopayWebService.dto.message.MessageDTO;
import org.invopayWebService.dto.message.Type;
import org.invopayWebService.entity.Client;
import org.invopayWebService.entity.Invoice;

import org.invopayWebService.entity.Supplier;
import org.invopayWebService.repository.client.ClientRepository;
import org.invopayWebService.repository.invoice.InvoiceRepository;
import org.invopayWebService.repository.supplier.SupplierRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private SupplierRepository supplierRepository;

    @Autowired
    private RestTemplate restTemplate;
    private String emailBaseUrl = "http://localhost:8084/send_email_and_sms";

    private Logger logger=LoggerFactory.getLogger(InvoiceService.class);
    public InvoiceClientAndSupplierDTO getInvoiceDataByInvoiceId(int invoiceId) {
        Client client = clientRepository.getClientDataByInvoiceId(invoiceId);
        Supplier supplier = supplierRepository.getSupplierDataByInvoiceId(invoiceId);
        InvoiceClientAndSupplierDTO invoiceClientAndSupplierDTO = new InvoiceClientAndSupplierDTO();
        invoiceClientAndSupplierDTO.setClient_id(client.getClient_id());
        invoiceClientAndSupplierDTO.setClient_fname(client.getClient_fname());
        invoiceClientAndSupplierDTO.setClient_lname(client.getClient_lname());
        invoiceClientAndSupplierDTO.setClient_email(client.getClient_email());
        invoiceClientAndSupplierDTO.setClientMobileNo(client.getClient_mobile());
        invoiceClientAndSupplierDTO.setSupplierId(Integer.valueOf(supplier.getSupplierId()));
        invoiceClientAndSupplierDTO.setSupplierName(supplier.getSupplierName());
        return invoiceClientAndSupplierDTO;
    }

    public double getInvoiceAmountByInvoiceid(int invoiceId){
        return invoiceRepository.findById(invoiceId).get().getGrandTotal();
    }


    public List<InvoiceGeneratorDTO> getAllInvoices(){
        List<InvoiceGeneratorDTO> invoiceGeneratorDTO=invoiceRepository.getAllInvoices();
        for(InvoiceGeneratorDTO invoiceDto:invoiceGeneratorDTO){
            invoiceDto.setClient_name(invoiceDto.getClient_fname()+" "+invoiceDto.getClient_lname());

        }
        return invoiceGeneratorDTO;
    }

    public List<YearInvoiceCountDTO> getYearInvoice(){
        List<YearInvoiceCountDTO> yearInvoiceCount=new ArrayList<>();

        List<Invoice> invoice=invoiceRepository.findAll();
        ArrayList<Integer> yearListCount=new ArrayList<>();
        for(int i =0;i<12;i++){
            yearListCount.add(0);
        }

        invoice.stream().map(e-> yearListCount.set((e.getInvoiceDate().getMonth()  ),yearListCount.get(e.getInvoiceDate().getMonth())+1   )).collect(Collectors.toList());

        for(Integer invoiceCount:yearListCount){
            YearInvoiceCountDTO yearInvoiceCount1=new YearInvoiceCountDTO();
            yearInvoiceCount1.setData(invoiceCount);
            //yearInvoiceCount1.setMonth("January");
            // yearInvoiceCount1.setDate();

            yearInvoiceCount.add(yearInvoiceCount1);

        }


        return yearInvoiceCount;

    }

    public List<MonthInvoiceCountDTO> getMonthInvoiceCount() {
        List<MonthInvoiceCountDTO> monthInvoiceCount=new ArrayList<>();
        //   List<Invoice> invoices=invoiceRepository.findAll();
//        for(Invoice invoice:invoices){
//            Invoice invoiceData=invoice;
//            Date d=invoiceData.getInvoiceDate();
//            System.out.println("Day :"+d.getDay()+" MOnth :"+d.getMonth());
//        }

        List<Invoice> invoices=invoiceRepository.getDetailsByMonth(10);
        TreeMap<Integer,Integer> hashMap=new TreeMap<>();
        int index=0;;
        for(Invoice i:invoices){
            Date d=i.getInvoiceDate();
            System.out.println("Day :"+d.getDay() +"  "+index++);

            if(hashMap.containsKey(d.getDay()))
            {
                Integer j = hashMap.get(d.getDay());
                System.out.println(j);
                hashMap.put(d.getDay(),j+1);
            }
            else if(!hashMap.containsKey(d.getDay()))
            {
                hashMap.put(d.getDay(),1);
            }

        }

        System.out.println(hashMap);
        for( Map.Entry<Integer, Integer> entry : hashMap.entrySet() ){
//            System.out.println( entry.getKey() + " = " + entry.getValue() );
            MonthInvoiceCountDTO monthInvoiceCount1=new MonthInvoiceCountDTO();
            List<MonthInvoiceCountDTO> list=new ArrayList<>();
            monthInvoiceCount1.setDay(entry.getKey());
            monthInvoiceCount1.setData(entry.getValue());

            monthInvoiceCount.add(monthInvoiceCount1);



        }
        System.out.println("Set Values");
        Set<Integer> set= hashMap.keySet();
        for(int i=1;i<=31;i++){
            if(!set.contains(i)){
                MonthInvoiceCountDTO monthInvoiceCount1=new MonthInvoiceCountDTO();
                monthInvoiceCount1.setDay(i);
                monthInvoiceCount1.setData(0);

                monthInvoiceCount.add(monthInvoiceCount1);

            }
        }
        System.out.println(set);
        Collections.sort(monthInvoiceCount,new NaturalComparator());
        System.out.println(monthInvoiceCount);
        return  monthInvoiceCount;
    }

    public List<WeekInvoiceCountDTO> getWeekInvoiceCount() {
        LocalDate localdate1 = LocalDate.of(2022, Month.OCTOBER, 5);
        LocalDate localdate2=localdate1.plusWeeks(1);

        Date date1 = Date.from(localdate1.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date date2 = Date.from(localdate2.atStartOfDay(ZoneId.systemDefault()).toInstant());

        List<WeekInvoiceCountDTO> weekInvoiceCountDTO=new ArrayList<>();
        List<Integer> weekInvoiceCount=new ArrayList<>();
        List<Invoice> invoices=invoiceRepository.findAllByInvoiceDateBetween(date1,date2);

        for(int i=0;i<7;i++){
            weekInvoiceCount.add(0);
        }
        invoices.stream().map(e-> weekInvoiceCount.set((e.getInvoiceDate().getDay() ),weekInvoiceCount.get(e.getInvoiceDate().getDay())+1   )).collect(Collectors.toList());

        for(Integer invoiceCount:weekInvoiceCount){
            WeekInvoiceCountDTO waekInvoiceCount1=new WeekInvoiceCountDTO();
            waekInvoiceCount1.setData(invoiceCount);
            //yearInvoiceCount1.setMonth("January");
            // yearInvoiceCount1.setDate();
            weekInvoiceCountDTO.add(waekInvoiceCount1);

        }

        return weekInvoiceCountDTO;

    }


    public List<DueListDTO> getTotalDate() {
        List<DueListDTO> dueListDTO=  invoiceRepository.findAllRecentInvoice();
        for(DueListDTO dueList:dueListDTO){

            dueList.setClientName(dueList.getClient_fname()+" "+dueList.getClient_lname());

        }
        return dueListDTO;
    }

    public List<DueListDTO> getDueListTomorrowInvoice() {

        LocalDate localdate1 = LocalDate.of(2022, Month.OCTOBER, 5);
//         LocalDate localdate2 = LocalDate.of(2022,Month.AUGUST, 2);
        LocalDate tomorrow = localdate1.plusDays(1);

        // Date date1 = Date.from(localdate1.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date tomorrowDate = Date.from(tomorrow.atStartOfDay(ZoneId.systemDefault()).toInstant());

        List<DueListDTO> dueListDTO=  invoiceRepository.findByDate(tomorrowDate);
        return dueListDTO;
    }

    public List<DueListDTO> getLastSevendDaysDueList(){
        LocalDate localdate1 = LocalDate.of(2022, Month.OCTOBER ,1);
        LocalDate localdate2 = LocalDate.of(2022, Month.OCTOBER, 6);
        Date date1 = Date.from(localdate1.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date date2 = Date.from(localdate2.atStartOfDay(ZoneId.systemDefault()).toInstant());

        List<DueListDTO> dueListDTO=invoiceRepository.findLastSevenDays(date1,date2);

        for(DueListDTO invoiceDue:dueListDTO){
            invoiceDue.setClientName(invoiceDue.getClient_fname()+" "+invoiceDue.getClient_lname());

        }

        return dueListDTO;
    }


    public List<DueListDTO> getTodayInvoiceDueList() {
//        LocalDate localDate=LocalDate.now();
        LocalDate localdate1 = LocalDate.of(2022, Month.OCTOBER, 6);
        Date date= Date.from(localdate1.atStartOfDay(ZoneId.systemDefault()).toInstant());

        List<DueListDTO> dueListDTO=invoiceRepository.findByDate(date);
        return dueListDTO;
    }

    public List<DueListDTO> getNextSevenDays() {
//        LocalDate localDate1=LocalDate.now();
//        LocalDate localDate2=LocalDate.now();

        LocalDate localdate1 = LocalDate.of(2022, Month.OCTOBER ,1);
        LocalDate localdate2 = LocalDate.of(2022, Month.OCTOBER, 6);

        Date date1 = Date.from(localdate1.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date date2 = Date.from(localdate2.atStartOfDay(ZoneId.systemDefault()).toInstant());

        // date2.setDate(date2.getDate()+7);

        List<DueListDTO> dueListDTOS=invoiceRepository.findNextSevenDays(date1,date2);
        return  dueListDTOS;

    }

    public List<DueListDTO> getNextMonthDueList() {
        LocalDate localdate1 = LocalDate.of(2022, Month.SEPTEMBER ,1);
        LocalDate localdate2 = LocalDate.of(2022, Month.OCTOBER, 8);
        Date date1 = Date.from(localdate1.atStartOfDay(ZoneId.systemDefault()).toInstant());
        Date date2 = Date.from(localdate2.atStartOfDay(ZoneId.systemDefault()).toInstant());
        List<DueListDTO> dueListDTOS= invoiceRepository.findNextMonth(date1,date2);
        return dueListDTOS;
    }

    public ByteArrayInputStream generateInvoiceById(int invoiceId) {
        InvoiceGeneratorDTO invoiceGeneratorDTOS=invoiceRepository.getInvoiceGenerator(invoiceId);
        invoiceGeneratorDTOS.setClient_name("Sanjay Maurya");

        logger.info("Create PDf Started");
        String title="TAX INVOICE ";
        String contents="Subscribe";

        ByteArrayOutputStream out=new ByteArrayOutputStream();
        Document document = new Document();

        try{
            PdfWriter writer=  PdfWriter.getInstance(document,out);

            HeaderFooter footer=new HeaderFooter(true,new Phrase("page"));
            footer.setAlignment(Element.ALIGN_CENTER);
            footer.setBorderWidthBottom(0);
            document.setFooter(footer);;

            document.open();

            Font titleFont= FontFactory.getFont(FontFactory.HELVETICA_BOLD,30);
            Paragraph titleParagraph=new Paragraph(title,titleFont);
            titleParagraph.setAlignment(Element.ALIGN_LEFT);
            document.add(titleParagraph);

            Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD,16);
            Chunk chunk = new Chunk("TO ",font);
            chunk.getCharacterSpacing();
            chunk.getCharacterSpacing();
            document.add(chunk);

            Chunk chunk1 = new Chunk(invoiceGeneratorDTOS.getClient_name(),font);
            document.add(chunk1);












//            Font paraFont=FontFactory.getFont(FontFactory.HELVETICA,18);
//
//            Paragraph paragraph=new Paragraph(contents);
//            paragraph.add(new Chunk("Wow"));
//            Chunk c= new Chunk( invoiceGeneratorDTOS.getInvoiceName());
//            paragraph.setAlignment(Element.ALIGN_JUSTIFIED);
//            writer.setSpaceCharRatio(PdfWriter.NO_SPACE_CHAR_RATIO);
//            paragraph.add(c);
//            Paragraph paragraph2=new Paragraph();
//            Chunk c2=new Chunk( invoiceGeneratorDTOS.getSupplierName());
//            paragraph2.setAlignment(Element.ALIGN_JUSTIFIED);
//            writer.setSpaceCharRatio(PdfWriter.NO_SPACE_CHAR_RATIO);
//            paragraph2.add(c2 );
//            paragraph.add( new Chunk(invoiceGeneratorDTOS.getClient_name()));
//            paragraph.add( new Chunk( (invoiceGeneratorDTOS.getGrandTotal()).toString()));
//
//            paragraph.add( new Chunk((invoiceGeneratorDTOS.getInvoiceDate()).toString()));
//            paragraph.add(new Chunk( (invoiceGeneratorDTOS.getInvoiceDueDate()).toString()));
//
//
//            document.add(paragraph);
//
//



            document.close();

            return  new ByteArrayInputStream(out.toByteArray());

        }catch(DocumentException e){
            e.printStackTrace();;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        return null;
    }
    public List<ClientInvoiceDTO> getClientInvoicesById(int id) {
        InvoiceGeneratorDTO invoiceGeneratorDTO=invoiceRepository.findInvoiceById(id);
        List<ClientInvoiceDTO> clientInvoiceDTOS=clientRepository.getClientInvoiceByInvoiceAndCliendId(invoiceGeneratorDTO.getClient_id(), id);
        System.out.println(clientInvoiceDTOS);
        for(ClientInvoiceDTO clientInvoiceDTO :clientInvoiceDTOS){
            clientInvoiceDTO.setClient_name(clientInvoiceDTO.getClient_fname()+" "+clientInvoiceDTO.getClient_lname());
        }
        System.out.println(invoiceGeneratorDTO.getClient_id());
        return clientInvoiceDTOS;
    }

    public boolean   sentEmail(int invoiceId) {

        System.out.println(invoiceId);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        Invoice invoice = invoiceRepository.findById(invoiceId).get();
        Client client = clientRepository.getClientDataByInvoiceId(invoiceId);
        MessageDTO messageDTO = new MessageDTO();

        messageDTO.setUserName(client.getClient_name());
        messageDTO.setClientEmail("mukesh.yadav@cloudanalogy.com");
        messageDTO.setClientNo("998");
        messageDTO.setAmount(invoice.getGrandTotal().toString());
        messageDTO.setDescription("test firing in the hole");
        messageDTO.setInvoiceNo(invoice.getInvoiceNo());
        messageDTO.setDueDate(invoice.getInvoiceDueDate().toString());
        messageDTO.setDate(java.time.LocalDate.now().toString());
        messageDTO.setType(Type.CUSTOMER_PAYMENT);
        messageDTO.setReceiptLink("Temp link : - http://localhost:3000/invopay/commonInvoice");
        HttpEntity<MessageDTO> entity = new HttpEntity<>(messageDTO, headers);
        String str= restTemplate.postForObject(emailBaseUrl,entity,String.class);
        System.out.println("Str:"+str);
        return true;
    }

    public boolean changeDeleteStatus(List<Integer> data) {
        for (Integer item : data) {
            Optional<Invoice> invoiceItem = invoiceRepository.findById(item);

            if (invoiceItem.isPresent()) {

                invoiceRepository.deleteStaus(item,1);
            } else {
               return false;
            }
        }
        return true;
    }
}
class NaturalComparator<T> implements Comparator<T> {
    public int compare(T a, T b) {
        MonthInvoiceCountDTO m=(MonthInvoiceCountDTO) a;
        MonthInvoiceCountDTO m2=(MonthInvoiceCountDTO) b;
        return m.getDay().compareTo(m2.getDay());

    }
}
