package org.invopayWebService.controller.dashboard;

import com.commons.ResponceHandler;
import io.swagger.annotations.OAuth2Definition;
import org.invopayWebService.dto.invoice.DueListDTO;
import org.invopayWebService.service.invoice.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/invopay")
@CrossOrigin("*")
public class DueListController {

    @Autowired
    private InvoiceService invoiceService;


    @GetMapping("getYearInvoiceCount")
    public ResponseEntity<Object> getYearInvoiceCount(){

        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getYearInvoice());
    }

    @GetMapping("getMonthInvoiceCount")
    public ResponseEntity<Object> getMonthInvoiceCount(){

        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getMonthInvoiceCount());
    }
    @GetMapping("getWeekInvoiceCount")
    public ResponseEntity<Object> getTotalInvoiceCount(){

        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getWeekInvoiceCount());
    }
    @GetMapping("/dueList")
    public ResponseEntity<Object> getTotalDate() {
        List<DueListDTO> due=invoiceService.getTotalDate();

        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getTotalDate());
    }
    @GetMapping("/getTodayInvoiceDueList")
    public ResponseEntity<Object> getTodayInvoiceDueList(){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getTodayInvoiceDueList());
    }

    @GetMapping("/getTomorrowInvoiceDueList")
    public ResponseEntity<Object> getTomorrowInvoiceDueList(){

        List<DueListDTO> dueListTomorrowDTO=invoiceService.getDueListTomorrowInvoice();
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getDueListTomorrowInvoice());
    }
    @GetMapping("/getLastSevendDays")
    public ResponseEntity<Object> lastSevenDayDueList(){
        List<DueListDTO> dueListTomorrowDTO=invoiceService.getLastSevendDaysDueList();
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getLastSevendDaysDueList());

    }

    @GetMapping("/getNextSevenDays")
    public ResponseEntity<Object> nextSevenDayDueList(){
        List<DueListDTO> dueListDTO=invoiceService.getNextSevenDays();
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getNextSevenDays());
    }
    @GetMapping("/getNextMonth")
    public ResponseEntity<Object> nextMonthDueList(){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,invoiceService.getNextMonthDueList());
    }
}
