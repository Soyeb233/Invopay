package org.invopayWebService.service.dashboard;

import org.invopayWebService.dto.dashboard.RecentInvoiceDTO;
import org.invopayWebService.repository.dashboard.RecentInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecentInvoiceService {
    @Autowired
    RecentInvoiceRepository recentInvoiceRepository;

//    to get all the objects of the DTO
    public List<RecentInvoiceDTO> getAllRecentInvoice(){
        List<RecentInvoiceDTO> recentInvoiceDTO = recentInvoiceRepository.getAllMerCommSettlement();
//        System.out.println("this is service : ");
//        System.out.print(recentInvoiceDTO);
        return recentInvoiceDTO;
    };

}
