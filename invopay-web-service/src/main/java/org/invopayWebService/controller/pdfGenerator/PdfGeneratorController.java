package org.invopayWebService.controller.pdfGenerator;


import com.commons.ResponceHandler;
import org.apache.catalina.webresources.FileResource;
import org.invopayWebService.service.pdfGenerate.PdfGenerateServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.util.Collections;

@RestController
@CrossOrigin("*")
public class PdfGeneratorController {

    @Autowired
    private PdfGenerateServiceImp pdfGenerateServiceImp;


    @GetMapping("/generateInvoicePdfById/{invoiceId}")
    public ResponseEntity<Object> generateInvoicePdfById(@PathVariable int invoiceId){
        System.out.println(invoiceId);
        ByteArrayInputStream pdf= pdfGenerateServiceImp.generateInvoicePdfById(invoiceId);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition","inline;file=lcwd.pdf");

        ResponseEntity<Object> responseEntity = ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(pdf));
        return responseEntity;
    }

    @GetMapping("/generatePaymentReceiptPdfById/{invoiceId}")
    public ResponseEntity<Object> generatePaymentReceiptPdfById(@PathVariable int invoiceId){


        System.out.println(invoiceId);
        ByteArrayInputStream pdf= pdfGenerateServiceImp.generatePaymentReceiptPdfById(invoiceId);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition","inline;file=lcwd.pdf");

         ResponseEntity<Object> responseEntity = ResponseEntity.ok()
                .headers(headers)
                .contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(pdf));
        return responseEntity;
    }


    @GetMapping("/getTransactionByVoucherName/{voucherName}")
   public ResponseEntity<Object> findByVocherNo(@PathVariable String voucherName){
        System.out.println(voucherName);
      return ResponceHandler.generateResponce(HttpStatus.OK , true ,pdfGenerateServiceImp.genereateRecieptOfTransactions(voucherName));
   }



}
