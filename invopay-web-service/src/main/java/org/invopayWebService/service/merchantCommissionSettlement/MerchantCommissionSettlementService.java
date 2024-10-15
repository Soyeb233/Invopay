package org.invopayWebService.service.merchantCommissionSettlement;

//import org.invopayWebService.dto.merchantCommissionSettlement.MerchantCommissionSettlementDTO;
import org.invopayWebService.dto.merchantCommissionSettlement.MerchantCommissionSettlementDTO;
import org.invopayWebService.repository.merchantCommissionSettlement.MerchantCommissionSettlementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantCommissionSettlementService {

    @Autowired
    MerchantCommissionSettlementRepository merchantCommissionSettlementRepository;

    public List<MerchantCommissionSettlementDTO> getAllMerCommSettlement(){
        List<MerchantCommissionSettlementDTO> merchantCommissionSettlementDto =  merchantCommissionSettlementRepository.findAllMerCommSettlement();
        return merchantCommissionSettlementDto;
    }

    public  MerchantCommissionSettlementDTO postMerchantSettlemet (MerchantCommissionSettlementDTO merchantCommissionSettlement) {
        System.out.println(merchantCommissionSettlement);
        return merchantCommissionSettlement;
    }
    public List<MerchantCommissionSettlementDTO> findMerchantById(int id){
        return merchantCommissionSettlementRepository.findMerchantById(id);
    }
}
