package org.invopayWebService.service.pdfGenerate;

import com.commons.invopayWebServices.DTO.AccountsCodeDTO;
import com.commons.invopayWebServices.DTO.AccountsTransactionTypeDTO;
import com.itextpdf.io.font.FontConstants;
import com.itextpdf.kernel.color.Color;
import com.itextpdf.kernel.color.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.kernel.pdf.action.PdfAction;
import com.itextpdf.kernel.pdf.annot.PdfLinkAnnotation;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.kernel.pdf.canvas.draw.SolidLine;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.layout.element.*;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.VerticalAlignment;
import org.invopayWebService.dto.invoice.InvoiceGeneratorDTO;
import org.invopayWebService.entity.AccountsTransaction;
import org.invopayWebService.entity.AccountsTransactionType;
import org.invopayWebService.repository.AccountsCodeRepository;
import org.invopayWebService.repository.AccountsTransactionTypeRepository;
import org.invopayWebService.repository.accounts.AccountsTransactionRepository;
import org.invopayWebService.repository.invoice.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.Optional;

@Service
public class PdfGenerateServiceImp implements PdfGenerateService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Autowired
    private AccountsTransactionRepository accountsTransactionRepository;
    @Autowired
    private AccountsCodeRepository accountsCodeRepository;
    @Autowired
    private AccountsTransactionTypeRepository accountsTransactionTypeRepository;

    public ByteArrayInputStream generateInvoicePdfById(int invoiceId) {

        Optional<InvoiceGeneratorDTO> invoiceGeneratorDtoOptional=invoiceRepository.getInvoicePdfGenerator(invoiceId);

        InvoiceGeneratorDTO invoiceGeneratorDTO = null;


        if(invoiceGeneratorDtoOptional.isPresent()) {

            invoiceGeneratorDTO = invoiceGeneratorDtoOptional.get();


            invoiceGeneratorDTO.setClient_name(invoiceGeneratorDTO.getClient_fname()+" "+invoiceGeneratorDTO.getClient_lname());

            invoiceGeneratorDTO.setDiscountTotal(12.0f);
            invoiceGeneratorDTO.setAppFee(1.01f);
            invoiceGeneratorDTO.setPaymentTypeName("GPAY");
            invoiceGeneratorDTO.setClient_address_line3("Gurugram");
            invoiceGeneratorDTO.setProductName("BIKE");
            invoiceGeneratorDTO.setDescription("This is mandatory to pay the invoice");
            invoiceGeneratorDTO.setPrice(101f);
            invoiceGeneratorDTO.setCountryName("India");
            invoiceGeneratorDTO.setInvoiceDueDate(invoiceGeneratorDTO.getInvoiceDate());



            ByteArrayOutputStream pdfRecieptInvoice = new ByteArrayOutputStream();

            try {

                DeviceRgb paraCTextColor = new DeviceRgb(29, 29, 30);

                Border solidBorder = new SolidBorder(1.5f);
                solidBorder.setColor(new DeviceRgb(205, 205, 205));


                SolidLine grayLine = new SolidLine(1.5f);
                grayLine.setColor(new DeviceRgb(205, 205, 205));
                LineSeparator grayLineSeparator = new LineSeparator(grayLine);
                grayLineSeparator.setWidthPercent(100);
                grayLineSeparator.setMarginTop(3);

                SolidLine blueLine = new SolidLine(1.2f);
                blueLine.setColor(Color.BLUE);
                LineSeparator blueLineSeparator = new LineSeparator(blueLine);
                blueLineSeparator.setWidthPercent(100);
                blueLineSeparator.setMarginTop(3);

                final float customMargin = 3.0f;

                final float leftMargin = 3.0f;
                final float rightMargin = 3.0f;


                PdfWriter pdfWriter = new PdfWriter(pdfRecieptInvoice);
                PdfDocument pdfDocument = new PdfDocument(pdfWriter);

                pdfDocument.setDefaultPageSize(PageSize.A4);
                PdfPage pdfPage = pdfDocument.addNewPage();

                Document document = new Document(pdfDocument);
                document.setTopMargin(10f);
                document.setBorderBottom(solidBorder);


                Text text = new Text(invoiceGeneratorDTO.getInvoiceName()).setFontColor(Color.BLUE).setFontSize(15);

                Paragraph paragraph = new Paragraph(text).setMarginLeft(leftMargin);

                document.add(paragraph);

                document.add(blueLineSeparator);

                Style headingStyle = new Style();
                PdfFont monospace = PdfFontFactory.createFont(FontConstants.TIMES_ROMAN);
                headingStyle.setFont(monospace).setFontColor(Color.BLACK).setBold();


                Text text2 = new Text("TAX INVOICE")
                        .setBold().setFontSize(18.0f)
                        .addStyle(headingStyle)
                        .setBold()
                        .setFontColor(Color.BLACK);

                Paragraph paragraph2 = new Paragraph(text2)
                        .setMarginTop(15.0f)
                        .setMarginBottom(15.0f)
                        .setMarginLeft(leftMargin);


                document.add(paragraph2);


                document.add(grayLineSeparator);


                float columnWidth[] = {30f, 70f, 30f, 70f};

                Table table = new Table(columnWidth);

                table.addCell(new Cell().add("To")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(customMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));

                table.addCell(new Cell().add(invoiceGeneratorDTO.getClient_fname() + " " + invoiceGeneratorDTO.getClient_lname() + "," + invoiceGeneratorDTO.getClient_city() + " ," + invoiceGeneratorDTO.getClient_state() + ", " + invoiceGeneratorDTO.getClient_pincode() + "India")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginLeft(60f)
                        .setMarginBottom(customMargin)
                        .setFontSize(10f)
                        .setBorder(Border.NO_BORDER));


                table.addCell(new Cell().add(" From ")
                        .setTextAlignment(TextAlignment.CENTER)
                        .setBold()
                        .setFontColor(Color.BLACK)
                        .addStyle(headingStyle)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(5f)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));

                table.addCell(new Cell().add(invoiceGeneratorDTO.getSupplierName() + " " + invoiceGeneratorDTO.getSupplierFname() + " " + invoiceGeneratorDTO.getSupplierLname() + " " + invoiceGeneratorDTO.getSupplierAddressLine1() + " " + invoiceGeneratorDTO.getSupplierAddressLine2() + " " + invoiceGeneratorDTO.getSupplierCity() + " " + invoiceGeneratorDTO.getSupplierState() + " ," + invoiceGeneratorDTO.getClient_pincode() + " ," + invoiceGeneratorDTO.getCountryName() )
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(60f)
                        .setFontSize(10f)
                        .setBorder(Border.NO_BORDER));

                document.add(table);

                document.add(grayLineSeparator);

                float colWidth2[] = {100f, 100f};
                Table tableInvoiceNumber = new Table(colWidth2);

                tableInvoiceNumber.addCell(new Cell().add(" Invoice No")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(leftMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));

                tableInvoiceNumber.addCell(new Cell().add(invoiceGeneratorDTO.getInvoiceName())
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(10f)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));

                document.add(tableInvoiceNumber);

                grayLineSeparator.setWidthPercent(50);

                document.add(grayLineSeparator);


                Table tableDate = new Table(colWidth2);

                tableDate.addCell(new Cell().add(" Date")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(leftMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));

                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
                String invoiceDate = formatter.format(invoiceGeneratorDTO.getInvoiceDate());

                tableDate.addCell(new Cell().add(invoiceDate)
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(10f)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));

                document.add(tableDate);

                grayLineSeparator.setWidthPercent(50);

                document.add(grayLineSeparator);

                Table dueInvoiceTable = new Table(colWidth2);

                dueInvoiceTable.addCell(new Cell().add("Invoice due ")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(leftMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));

                // Creating a PdfLinkAnnotation object
                Rectangle rect = new Rectangle(0, 0);
                PdfLinkAnnotation annotation = new PdfLinkAnnotation(rect);

                // Setting action of the annotation
                PdfAction action = PdfAction.createURI("https://www.google.com/");
                annotation.setAction(action);

                // Creating a link
                Link link = new Link
                        ("Pay Online", annotation);

                Paragraph paraLink = new Paragraph(link.setUnderline()).setFontColor(Color.BLUE);


                dueInvoiceTable.addCell(new Cell().add(paraLink)
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(10f)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));

                document.add(dueInvoiceTable);


                grayLineSeparator.setWidthPercent(100);
                document.add(grayLineSeparator);

                float itemInfoColWidth[] = {140, 140, 140, 140, 140};
                Table productTable = new Table(itemInfoColWidth);

                productTable.addCell(new Cell().add("Product Name")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(leftMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));
                productTable.addCell(new Cell().add("Description")
                        .setTextAlignment(TextAlignment.CENTER)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));
                productTable.addCell(new Cell().add("Price")
                        .setTextAlignment(TextAlignment.RIGHT)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));
                productTable.addCell(new Cell().add("Quantity")
                        .setTextAlignment(TextAlignment.RIGHT)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));
                productTable.addCell(new Cell().add("Total")
                        .setTextAlignment(TextAlignment.RIGHT)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));

                document.add(productTable);

                document.add(grayLineSeparator);

                Table productTableValue = new Table(itemInfoColWidth);

                productTableValue.addCell(new Cell().add(invoiceGeneratorDTO.getProductName())
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(11f)
                        .setMarginLeft(leftMargin)
                        .setBorder(Border.NO_BORDER));
                productTableValue.addCell(new Cell().add(invoiceGeneratorDTO.getDescription())
                        .setTextAlignment(TextAlignment.CENTER)

                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));
                productTableValue.addCell(new Cell().add(invoiceGeneratorDTO.getPrice().toString())
                        .setTextAlignment(TextAlignment.RIGHT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));
                productTableValue.addCell(new Cell().add(invoiceGeneratorDTO.getProductQty().toString())
                        .setTextAlignment(TextAlignment.RIGHT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));
                productTableValue.addCell(new Cell().add(invoiceGeneratorDTO.getSubTotal().toString())
                        .setTextAlignment(TextAlignment.RIGHT)

                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));

                document.add(productTableValue);
                document.add(grayLineSeparator);


                Table subTotalTable = new Table(2);
                subTotalTable.setHorizontalAlignment(HorizontalAlignment.RIGHT);
                subTotalTable.setWidth(200);

                subTotalTable.addCell(new Cell().add("Sub Total")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(leftMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER)
                        .setBorderBottom(solidBorder));
                subTotalTable.addCell(new Cell().add(invoiceGeneratorDTO.getSubTotal().toString())
                        .setTextAlignment(TextAlignment.RIGHT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER)
                        .setBorderBottom(solidBorder)

                );


                document.add(subTotalTable);


                Table gstTotalTable = new Table(2);

                gstTotalTable.setHorizontalAlignment(HorizontalAlignment.RIGHT);
                gstTotalTable.setWidth(200);

                gstTotalTable.addCell(new Cell().add("GST Total")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(leftMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER)
                        .setBorderBottom(solidBorder));
                gstTotalTable.addCell(new Cell().add(invoiceGeneratorDTO.getGstTotal().toString())
                        .setTextAlignment(TextAlignment.RIGHT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(leftMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER)
                        .setBorderBottom(solidBorder)

                );


                document.add(gstTotalTable);

                Table finalTotalTable = new Table(2);

                finalTotalTable.setHorizontalAlignment(HorizontalAlignment.RIGHT);
                finalTotalTable.setWidth(200);

                finalTotalTable.addCell(new Cell().add("Total")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(leftMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER)
                        .setBorderBottom(solidBorder));
                finalTotalTable.addCell(new Cell().add("AUD " + invoiceGeneratorDTO.getGrandTotal())
                        .setTextAlignment(TextAlignment.RIGHT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER)
                        .setBorderBottom(solidBorder)

                );


                document.add(finalTotalTable);

                Table balanceTable = new Table(1);
                balanceTable.setHorizontalAlignment(HorizontalAlignment.RIGHT);
                balanceTable.setWidth(200);
                balanceTable.addCell(new Cell().add("Balance")
                        .setFontColor(Color.WHITE)
                        .addStyle(headingStyle)
                        .setTextAlignment(TextAlignment.CENTER)
                        .setBorder(new SolidBorder(new DeviceRgb(61, 160, 123), 2))
                        .setBackgroundColor(new DeviceRgb(61, 160, 123)));
                balanceTable.addCell(new Cell().add("AUD " + invoiceGeneratorDTO.getBalanceTotal())
                        .setTextAlignment(TextAlignment.CENTER)
                        .setBorder(new SolidBorder(new DeviceRgb(61, 160, 123), 2)));

                document.add(balanceTable);

                float emailTableColWidth[] = {50f, 80f};
                Table emailTable = new Table(emailTableColWidth);

                emailTable.setHorizontalAlignment(HorizontalAlignment.LEFT);
                emailTable.setMarginLeft(50);


                emailTable.addCell(new Cell().add("Email:")
                        .setTextAlignment(TextAlignment.RIGHT)
                        .setBold()
                        .addStyle(headingStyle)
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(13f)
                        .setBorder(Border.NO_BORDER));

                emailTable.addCell(new Cell().add("surbhiVishonoi@gmail.com")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(11f)
                        .setBorder(Border.NO_BORDER));

                document.add(emailTable);

                PdfCanvas canvas = new PdfCanvas(pdfPage);

                canvas.setStrokeColor(Color.BLUE);
                canvas.setLineWidth(1.2f);

                // Initial point of the line
                canvas.moveTo(38, 35);

                // Drawing the line
                canvas.lineTo(560, 35);

                // Closing the path stroke
                canvas.closePathStroke();

                int numberOfPages = pdfDocument.getNumberOfPages();
                for (int i = 1; i <= numberOfPages; i++) {

                    // Write aligned text to the specified by parameters point
                    document.showTextAligned(new Paragraph(String.format("%s/%s", i, numberOfPages)).setFontColor(Color.BLUE),
                            550, 15, i, TextAlignment.RIGHT, VerticalAlignment.BOTTOM, 0).setFontColor(Color.BLUE);
                }


                document.close();

                return new ByteArrayInputStream(pdfRecieptInvoice.toByteArray());

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

        return null;
    }





    public ByteArrayInputStream generatePaymentReceiptPdfById(int invoiceId){


        Optional<InvoiceGeneratorDTO> invoiceGeneratorDTO=invoiceRepository.getInvoicePdfGenerator(invoiceId);

        InvoiceGeneratorDTO invoiceGeneratorDTOS ;

        if(invoiceGeneratorDTO.isPresent()) {

            invoiceGeneratorDTOS = invoiceGeneratorDTO.get();

             invoiceGeneratorDTOS.setClient_name("Sarthak");

            ByteArrayOutputStream paymentReceiptOutStream = new ByteArrayOutputStream();

            try {

                DeviceRgb paraCTextColor = new DeviceRgb(29, 29, 30);


                SolidLine borderLine = new SolidLine(1.2f);
                borderLine.setColor(new DeviceRgb(0, 65, 127));
                LineSeparator borderLineSeparator = new LineSeparator(borderLine);
                borderLineSeparator.setWidthPercent(100);
                borderLineSeparator.setMarginTop(3);

                Style headingStyle = new Style();
                PdfFont monospace = PdfFontFactory.createFont(FontConstants.HELVETICA);
                headingStyle.setFont(monospace).setFontColor(Color.BLACK).setBold();

                final float customMargin = 3.0f;


                final float leftMargin = 3.0f;
                final float rightMargin = 3.0f;

                final byte[] USERPASS = "user".getBytes();
                 final byte[] OWNERPASS = "owner".getBytes();

                WriterProperties writerProperties = new WriterProperties();
                writerProperties.setStandardEncryption(USERPASS, OWNERPASS, EncryptionConstants.ALLOW_PRINTING, EncryptionConstants.ENCRYPTION_AES_128);

                PdfWriter pdfWriter = new PdfWriter(paymentReceiptOutStream,writerProperties);



                PdfDocument pdfDocument = new PdfDocument(pdfWriter);

                pdfDocument.setDefaultPageSize(PageSize.A4);
                PdfPage pdfPage = pdfDocument.addNewPage();

                Document documentPaymentReceipt = new Document(pdfDocument);

                documentPaymentReceipt.setTopMargin(10f);

                Table headerTable = new Table(2);

                headerTable.addCell(new Cell().add("IN-03022023-0043")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .setFont(PdfFontFactory.createFont(FontConstants.HELVETICA))
                        .setFontColor(Color.BLUE)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(customMargin)
                        .setFontSize(10f)
                        .setBorder(Border.NO_BORDER));

                headerTable.addCell(new Cell().add(" 03-02-2023\n support@einvoice.com")
                        .setTextAlignment(TextAlignment.RIGHT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginLeft(60f)
                        .setMarginBottom(customMargin)
                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));

                documentPaymentReceipt.add(headerTable);


                documentPaymentReceipt.add(borderLineSeparator);


                Text headingText = new Text("Payment Receipt")
                        .setBold().setFontSize(18.0f)
                        .setBold()
                        .setFontColor(Color.BLACK);

                Paragraph paragraph2 = new Paragraph(headingText)
                        .setTextAlignment(TextAlignment.CENTER)
                        .setMarginTop(15.0f)
                        .setMarginBottom(15.0f)
                        .setMarginLeft(leftMargin);


                documentPaymentReceipt.add(paragraph2);


                float columnWidth[] = {30f, 100f, 30f, 100f};

                Table table = new Table(columnWidth);


                table.addCell(new Cell().add("To")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(customMargin)
                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));

                table.addCell(new Cell().add(invoiceGeneratorDTOS.getSupplierName() + " Private Limited,\nA-17, GF,near Birlasoft, Sector 63,\nNoida,\nUttar Pradesh,560038\nIndia")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(40f)
                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));

                table.addCell(new Cell().add(" From ")
                        .setTextAlignment(TextAlignment.CENTER)
                        .setBold()
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setMarginLeft(10f)

                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));

                table.addCell(new Cell().add(invoiceGeneratorDTOS.getClient_name() + ",Okay,\nNoida,\nUttar Pradesh,2010\nIndia")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginLeft(40f)
                        .setMarginBottom(customMargin)
                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));

                documentPaymentReceipt.add(table);

                float itemInfoColWidth[] = {140, 140};

                Table paymentDetailsTable = new Table(itemInfoColWidth);
                paymentDetailsTable.setMarginTop(15f);


                paymentDetailsTable.addCell(new Cell().add("Inovice number")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));

                paymentDetailsTable.addCell(new Cell().add(": 22-23/52/0397")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));


                paymentDetailsTable.addCell(new Cell().add("Payment mode")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));

                paymentDetailsTable.addCell(new Cell().add(": card")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));

                paymentDetailsTable.addCell(new Cell().add("Currency")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));

                paymentDetailsTable.addCell(new Cell().add(": AUD")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));


                paymentDetailsTable.addCell(new Cell().add("Amount")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setBold()
                        .setFontColor(Color.BLACK)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));


                paymentDetailsTable.addCell(new Cell().add(": 171")
                        .setTextAlignment(TextAlignment.LEFT)
                        .setFontColor(paraCTextColor)
                        .setMarginTop(customMargin)
                        .setMarginBottom(customMargin)
                        .setFontSize(12f)
                        .setBorder(Border.NO_BORDER));


                documentPaymentReceipt.add(paymentDetailsTable);


                // Creating a PdfCanvas object
                PdfCanvas canvas = new PdfCanvas(pdfPage);

                canvas.setStrokeColor(new DeviceRgb(0, 65, 127));
                canvas.setLineWidth(1.2f);

                // Initial point of the line
                canvas.moveTo(38, 35);

                // Drawing the line
                canvas.lineTo(560, 35);

                // Closing the path stroke
                canvas.closePathStroke();


                int numberOfPages = pdfDocument.getNumberOfPages();
                for (int i = 1; i <= numberOfPages; i++) {

                    // Write aligned text to the specified by parameters point
                    documentPaymentReceipt.showTextAligned(new Paragraph(String.format("%s/%s", i, numberOfPages)).setFontColor(Color.BLUE),
                            550, 15, i, TextAlignment.RIGHT, VerticalAlignment.BOTTOM, 0).setFontColor(Color.BLUE);
                }


                documentPaymentReceipt.close();

                return new ByteArrayInputStream(paymentReceiptOutStream.toByteArray());

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }else{


        }


        return null;


    }


    public AccountsTransaction genereateRecieptOfTransactions(String voucherName){
        AccountsTransaction accountsTransaction=null;

        Optional<AccountsTransaction> transaction=accountsTransactionRepository.findByVoucherName(voucherName);
        if(transaction.isPresent()){
            accountsTransaction=transaction.get();
            System.out.println(accountsTransaction);
            AccountsCodeDTO accountsCodeDTO = accountsCodeRepository.getAccountsCodeByAccountsTransactionId(accountsTransaction.getAccountsTransactionId());
            AccountsTransactionTypeDTO accountsTransactionType = accountsTransactionTypeRepository.getAccountsTransactionTypeByAccountsTransactionId(accountsTransaction.getAccountsTransactionId());
            System.out.println(accountsTransactionType);
        }
        else {
            throw  new RuntimeException();
        }

        return accountsTransaction;
    }


}
