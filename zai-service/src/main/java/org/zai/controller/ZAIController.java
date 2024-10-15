package org.zai.controller;

import com.commons.ResponceHandler;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.zai.dto.responce.agreement.ValiDatePayToAgreementDTO;
import org.zai.dto.responce.ammendPayToAgreement.AmendPayToAgreementDetails;
import org.zai.dto.payment.payToPayment.InitiatePayToPayment;
import org.zai.dto.responce.CreateAgreementResponce;
import org.zai.models.ClientResponce;
import org.zai.service.ZAIIntigrationService;
import org.zai.service.ZAIService;

import java.util.Optional;

@RestController
@RequestMapping("zai")
public class ZAIController {

    @Autowired private ZAIIntigrationService zaiIntigrationService;
    @Autowired private ZAIService zaiService;


    // first time when user click button to pay using payto at that time he need to hit the api if user
    // already created on zai then api return the user else it will create user at zai and then return user
    // after creating user we need to hit agreement validation api
    @PostMapping("/create_client/{userId}")
    public ResponseEntity<Object> createClient(@PathVariable int userId){
        Optional<ClientResponce> clientResponce = zaiService.getClientId("buyer-"+ userId);
        if(clientResponce.isPresent()){
            return ResponceHandler.generateResponce(HttpStatus.OK , true , clientResponce.get());
        }else {
            return ResponceHandler.generateResponce(HttpStatus.OK, true, zaiService.createClient(userId));
        }
    }

    @GetMapping("/get-client/{id}")
    public ResponseEntity<Object> getClient(@PathVariable long id) throws JsonProcessingException {
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,zaiService.getClient(id));
    }

    //when we hit agreement validation api in that case if agreement validate then we internally hit create agreement api
    // and save responce into db  customerId , responce or merchantId and then return responce to FE
    @PostMapping("/validate-payto-agreement/marchent/{marchentId}")
    public ResponseEntity<Object> validateAgreement(@PathVariable int marchentId,@RequestBody ValiDatePayToAgreementDTO valiDatePayToAgreementDTO) {
        CreateAgreementResponce createAgreementResponce = zaiService.getAgreementBy(String.valueOf(marchentId), valiDatePayToAgreementDTO.getUser_external_id().substring(6));
        if (createAgreementResponce != null) {
            return ResponceHandler.generateResponce(HttpStatus.OK, true, createAgreementResponce);
        } else {
            return ResponceHandler.generateResponce(HttpStatus.OK, true, zaiService.validatePayToAgreement(valiDatePayToAgreementDTO, marchentId));
        }
    }

    @PutMapping("/create-payto-agreement/{agreement_uuid}")
    public ResponseEntity<Object> createPayToAgreement(@PathVariable String agreement_uuid){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,zaiService.createPayToAgreement(agreement_uuid));
    }

    //get agreement details of previously created agreement
    @GetMapping("/agreementDetails/{agreement_uuid}")
    public ResponseEntity<Object> getAgreementDetails(@PathVariable String  agreement_uuid){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,zaiService.getAgreementDetails(agreement_uuid));
    }

    // after validating and creating agreement we initiate pyament
    @PostMapping("/initiatePayToPayments/{agreement_uuid}")
    public ResponseEntity<Object> initiatePayToPayments(@PathVariable String  agreement_uuid, @RequestBody InitiatePayToPayment initiatePayToPayments){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,zaiService.initiatePayToPayment(agreement_uuid,initiatePayToPayments));
    }
    //If we want to get payment details
    @PostMapping("/getPayToPaymentsDetails/{payment_request_uuid}")
    public ResponseEntity<Object> getPayToPaymentInitiationDetails(@PathVariable String  payment_request_uuid){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,zaiService.getPayToPyamentInitiationDetails(payment_request_uuid));
    }

    @GetMapping("/agreement-status/{agrrmant_UUID}")
    public ResponseEntity<Object> getAgreementStatus(@PathVariable String  agrrmant_UUID){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,zaiService.getAgreementStatus(agrrmant_UUID));
    }

    @PostMapping("/ammendAgreementDetails/{agrrmant_UUID}")
    public ResponseEntity<Object> getAgreementDetails(@PathVariable String  agrrmant_UUID, @RequestBody AmendPayToAgreementDetails amendPayToAgreementDetails){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,zaiService.ammendAgreementDetails(agrrmant_UUID,amendPayToAgreementDetails));
    }


}
