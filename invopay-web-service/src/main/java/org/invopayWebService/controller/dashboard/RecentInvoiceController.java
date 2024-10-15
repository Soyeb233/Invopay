package org.invopayWebService.controller.dashboard;

import org.invopayWebService.dto.dashboard.RecentInvoiceDTO;
import org.invopayWebService.service.dashboard.RecentInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin("*")
public class RecentInvoiceController {

    @Autowired
    RecentInvoiceService recentInvoiceService;

    @GetMapping("/getRecentInvoice")
    public List<RecentInvoiceDTO> getAllRecentInvoice(){
        List<RecentInvoiceDTO> recentInvoiceDTOList = recentInvoiceService.getAllRecentInvoice();
        return recentInvoiceDTOList.stream().limit(10).collect(Collectors.toList());
//        return recentInvoiceDTOList;
    }
}
