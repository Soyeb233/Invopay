package org.zai.constants;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.zai.dto.payment.responce.InitiatePayToPyamentResponce;
import org.zai.dto.payment.responce.Payment;
import org.zai.dto.responce.agreement.ValiDatePayToAgreementDTO;
import org.zai.dto.payment.payToPayment.InitiatePayToPayment;
import org.zai.dto.responce.CreateAgreementResponce;

@FeignClient(name="CallZAIUsingFeignClient",url=ZAIUrls.commonAgreementUrl)
public interface CallZAIAgreementsUsingFeignClient {

    @PostMapping(ZAIUrls.validatePayToAgreement)
    public CreateAgreementResponce validatePayToAgreement(@RequestHeader(value = "Authorization") String authorizationHeader, @RequestBody ValiDatePayToAgreementDTO valiDatePayToAgreementDTO);

    @PostMapping(ZAIUrls.createPayToAgreement)
    public CreateAgreementResponce createPayToAgreement(@RequestHeader(value = "Authorization") String authorizationHeader, @PathVariable String agreement_uuid);

    @GetMapping(ZAIUrls.getPayToAgreementDetails)
    public ValiDatePayToAgreementDTO getPayToAgreementDetails(@RequestHeader(value = "Authorization") String authorizationHeader, @PathVariable String agreement_uuid);

    @PostMapping(ZAIUrls.payToAgreementStatus)
    public InitiatePayToPyamentResponce initiatePayToPyament(@RequestHeader(value = "Authorization") String authorizationHeader,@PathVariable String agreement_uuid,@RequestBody InitiatePayToPayment initiatePayToPayment);

    @GetMapping(ZAIUrls.getPayToPaymentInitiationRequestDetails)
    public Payment getPayToPyamentResponce(@RequestHeader(value = "Authorization") String authorizationHeader, @PathVariable String payment_request_uuid);
}
