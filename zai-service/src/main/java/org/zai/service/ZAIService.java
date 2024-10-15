package org.zai.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.commons.zaiDTOS.client.ClientDTO;
import com.commons.zaiDTOS.client.ZAIClientDTO;
import org.zai.constants.ZAIConstants;
import org.zai.dto.payment.responce.InitiatePayToPyamentResponce;
import org.zai.dto.payment.responce.Payment;
import org.zai.dto.responce.agreement.ClientResponceDTO;
import org.zai.dto.responce.agreement.ValiDatePayToAgreementDTO;
import org.zai.dto.responce.ammendPayToAgreement.AmendPayToAgreementDetails;
import org.zai.dto.responce.ammendPayToAgreement.GetResponcePayment;
import org.zai.dto.payment.payToPayment.InitiatePayToPayment;
import org.zai.dto.responce.CreateAgreementResponce;
import org.zai.models.ClientResponce;
import org.zai.repository.AgreementResponceRepository;
import org.zai.repository.CreateAgreementResponceRepository;
import org.zai.repository.ZaiClientRepository;

import java.util.Map;
import java.util.Optional;

@Service
public class ZAIService {

    @Autowired private ZaiClientRepository zaiClientRepo;
    @Autowired ZAIIntigrationService zaiIntigrationService;
    @Autowired
    AgreementResponceRepository agreementResponceRepo;
    @Autowired InvopayWebIntigrationService invopayWebIntigrationService;
    @Autowired ZAIValidationService zaiValidationService;
    @Autowired CreateAgreementResponceRepository createAgreementResponceRepository;

    public ClientDTO createClient(int userId) {
        ClientDTO clientDTO = invopayWebIntigrationService.getUserById(userId);
        if(zaiValidationService.validateClient(clientDTO)){
            ZAIClientDTO zaiClientDTO =ZAIClientDTO.builder().id("buyer-"+ userId).first_name(clientDTO.getClient_fname()).last_name(clientDTO.getClient_lname()).email(clientDTO.getClient_email()).country("AUS").build();
            zaiIntigrationService.createClientAtZai(zaiClientDTO);
        }
        return clientDTO;
    }

    public ClientResponceDTO getClient(long id) throws JsonProcessingException {
        return zaiIntigrationService.getUserById(id);
    }

    public CreateAgreementResponce validatePayToAgreement(ValiDatePayToAgreementDTO valiDatePayToAgreementDTO, int marchentId) {
        setFixedData(valiDatePayToAgreementDTO);
        CreateAgreementResponce createAgreementResponce=null;
        if(zaiValidationService.validateDataOfValidatePayToAgreement(valiDatePayToAgreementDTO)) {
            createAgreementResponce = zaiIntigrationService.validatePayToAgreement(valiDatePayToAgreementDTO);
        }
        if(createAgreementResponce.getAgreement_uuid()!=null){
            createAgreementResponce = createPayToAgreement(createAgreementResponce.getAgreement_uuid());
        }
        createAgreementResponce.setClientId(valiDatePayToAgreementDTO.getUser_external_id().substring(6));
        createAgreementResponce.setMarchentId(String.valueOf(marchentId));
        createAgreementResponceRepository.save(createAgreementResponce);
        return createAgreementResponce;
    }

    private void setFixedData(ValiDatePayToAgreementDTO valiDatePayToAgreementDTO) {
        valiDatePayToAgreementDTO.setPriority(ZAIConstants.priority);
        valiDatePayToAgreementDTO.getAgreement_info().setPurpose_code(ZAIConstants.purpose_code);
        valiDatePayToAgreementDTO.getAgreement_info().setAgreement_type(ZAIConstants.agreement_type);
//        valiDatePayToAgreementDTO.getAgreement_info().setAutomatic_renewal(false);
        valiDatePayToAgreementDTO.getAgreement_info().getDebtor_info().getDebtor_details().setDebtor_type(ZAIConstants.debtor_type);
        valiDatePayToAgreementDTO.getAgreement_info().getPayment_terms().setFrequency(ZAIConstants.frequency);
        valiDatePayToAgreementDTO.getAgreement_info().getPayment_terms().getPayment_amount_info().setType(ZAIConstants.pyament_amount_info_type);
    }

    public CreateAgreementResponce createPayToAgreement(String agrrmant_uuid) {
        return zaiIntigrationService.createPayToAgreement(agrrmant_uuid);
    }


    public Map<String , Object> getAgreementStatus(String agrrmant_uuid) {
        return zaiIntigrationService.getAgreementStatus(agrrmant_uuid);
    }

    public ValiDatePayToAgreementDTO getAgreementDetails(String agrrmant_uuid) {
        return zaiIntigrationService.getAgreementDetails(agrrmant_uuid);
    }

    public Map<String,Object> ammendAgreementDetails(String agrrmant_uuid, AmendPayToAgreementDetails amendPayToAgreementDetails) {
        return zaiIntigrationService.ammendAgreementDetails(agrrmant_uuid,amendPayToAgreementDetails);
    }

    public InitiatePayToPyamentResponce initiatePayToPayment(String agrrmant_uuid, InitiatePayToPayment initiatePayToPayments) {
        return zaiIntigrationService.initiatePayToPayment(agrrmant_uuid,initiatePayToPayments);
    }

    public Payment getPayToPyamentInitiationDetails(String payment_request_uuid) {
        return zaiIntigrationService.getPayToPyamentInitiationDetails(payment_request_uuid);
    }

    public Optional<ClientResponce> getClientId(String s) {
        return zaiClientRepo.findByzaiId(s);
    }

    public CreateAgreementResponce getAgreementBy(String valueOf, String substring) {
        return agreementResponceRepo.findByClientIdAndMarchentId(valueOf, substring);
    }
}
