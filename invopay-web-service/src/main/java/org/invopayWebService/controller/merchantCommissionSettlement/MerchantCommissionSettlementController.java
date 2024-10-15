package org.invopayWebService.controller.merchantCommissionSettlement;

import com.commons.ResponceHandler;
import org.invopayWebService.dto.merchantCommissionSettlement.MerchantCommissionSettlementDTO;
import org.invopayWebService.service.merchantCommissionSettlement.MerchantCommissionSettlementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

@RestController
@CrossOrigin("*")
public class MerchantCommissionSettlementController {
    @Autowired
    MerchantCommissionSettlementService  merchantCommissionSettlementService;

    @GetMapping("/getAllMerchantCommissionSettlementService")
    public List<MerchantCommissionSettlementDTO>  getAllMerCommSettlement(){
        List<MerchantCommissionSettlementDTO> merchantCommissionSettlementDtoData = merchantCommissionSettlementService.getAllMerCommSettlement();
        return merchantCommissionSettlementDtoData;
    }

    @PostMapping("/addMerchantCommission_Settlement")
    public ResponseEntity<Object> postMerchantSettlemet(@RequestBody MerchantCommissionSettlementDTO merchantCommissionSettlement)
    {
        System.out.println(merchantCommissionSettlement.getSupplierName()+" "+merchantCommissionSettlement.getTotalAmount()+"  "+merchantCommissionSettlement.getReceivedDate()+" "+merchantCommissionSettlement.getPaymentTypeName()+" "+merchantCommissionSettlement.getRemarks());
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,merchantCommissionSettlementService.postMerchantSettlemet(merchantCommissionSettlement));
    }
    @GetMapping("/getMerchantById/{id}")
    public ResponseEntity<Object> getMerchantById(@PathVariable int id){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,merchantCommissionSettlementService.findMerchantById(id));
    }
}
