package org.invopayWebService.controller.dashboard;

import com.commons.ResponceHandler;
import org.invopayWebService.service.dashboard.summaryInvoiceDetails.SummaryInvoiceDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class SummaryInvoiceDetailsController {

    @Autowired
    SummaryInvoiceDetailsService summaryInvoiceDetailsService;

    @GetMapping("/getAllSummaryInvoiceDetails")
    public ResponseEntity<Object> getAllSummaryInvoiceDetails() {

        return ResponceHandler.generateResponce(HttpStatus.OK, true, summaryInvoiceDetailsService.getAllSummaryInvoiceDetails());
    }

}
