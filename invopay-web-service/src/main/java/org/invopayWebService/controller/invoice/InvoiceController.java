package org.invopayWebService.controller.invoice;

import com.commons.ResponceHandler;
import lombok.Getter;
import org.invopayWebService.dto.invoice.DueListDTO;
import org.invopayWebService.dto.invoice.DueListTomorrowDTO;
import org.invopayWebService.dto.invoice.InvoiceGeneratorDTO;
import org.invopayWebService.service.client.ClientService;
import org.invopayWebService.service.invoice.InvoiceService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/invopay")
@CrossOrigin("*")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;
    @Autowired
    private ClientService clientService;

    @GetMapping("/getClientAndMerchant/{invoiceId}")
    public ResponseEntity<Object> getClientAndMerchant(@PathVariable int invoiceId) {
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getInvoiceDataByInvoiceId(invoiceId));
    }

    @GetMapping("/getInvoiceAmountByInvoiceid/{invoiceId}")
    public ResponseEntity<Object> getInvoiceAmountByInvoiceid(@PathVariable int invoiceId) {
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getInvoiceAmountByInvoiceid(invoiceId));
    }
    @GetMapping("/getAllInvoices")
    public ResponseEntity<Object>getAllInvoices(){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getAllInvoices());
    }

    @GetMapping("/download")
    public ResponseEntity<Object> downloadFile() throws IOException
    {
        //String filename = "D:/work/tree.jpg";
        String filename="C:/Users/fg/Downloads/Invoice_List_30-01-2023_06_38_42.csv";
        File file = new File(filename);
        InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition",
                String.format("attachment; filename=\"%s\"", file.getName()));
        headers.add("Cache-Control", "no-cache, no-store, must-revalidate");
        headers.add("Pragma", "no-cache");
        headers.add("Expires", "0");

        ResponseEntity<Object> responseEntity = ResponseEntity.ok().headers(headers)
                .contentLength(file.length())
                .contentType(MediaType.parseMediaType("application/txt")).body(resource);
        System.out.println("I got Hitt Everytime");
        return responseEntity;
    }



    @GetMapping("/generateInvoiceById/{invoiceId}")
    public ResponseEntity<Object> generateInvoiceById(@PathVariable int invoiceId){
        System.out.println(invoiceId);
        ByteArrayInputStream pdf= invoiceService.generateInvoiceById(invoiceId);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition","inline;file=lcwd.pdf");

        ResponseEntity<Object> responseEntity = ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(pdf));
        return responseEntity;
    }


    @GetMapping("/getClientInvoice/{id}")
    public ResponseEntity<Object> getClientInvoice(@PathVariable int id){
        System.out.println(id);
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getClientInvoicesById(id));
    }

    @PostMapping("/sendEmail/{invoiceId}")
    public ResponseEntity<Object> emailStatus(@PathVariable int invoiceId) {
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.sentEmail(invoiceId));
    }

    @PutMapping("/deleteInvoice")
    public ResponseEntity<Object> deleteInvoice(@RequestBody List<Integer> id) {
        System.out.println(id);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,invoiceService.changeDeleteStatus(id));
    }


}
