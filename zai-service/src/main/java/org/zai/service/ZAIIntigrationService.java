package org.zai.service;

import com.commons.ObjectMapperUtil;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.google.common.net.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.zai.constants.CallZAIAgreementsUsingFeignClient;
import org.zai.constants.ZAIUrls;
import org.zai.dto.payment.responce.InitiatePayToPyamentResponce;
import org.zai.dto.payment.responce.Payment;
import org.zai.dto.responce.agreement.ClientResponceDTO;
import org.zai.dto.responce.agreement.ValiDatePayToAgreementDTO;
import org.zai.dto.ZAIHeader;
import org.zai.dto.ZAITokenResponce;
import com.commons.zaiDTOS.client.ZAIClientDTO;
import org.zai.dto.responce.ammendPayToAgreement.AmendPayToAgreementDetails;
import org.zai.dto.responce.ammendPayToAgreement.GetResponcePayment;
import org.zai.dto.payment.payToPayment.InitiatePayToPayment;
import org.zai.dto.responce.CreateAgreementResponce;
import org.zai.models.ClientResponce;
import org.zai.repository.ZaiClientRepository;
import reactor.core.publisher.Mono;
import java.util.HashMap;
import java.util.Map;

@Service
public class ZAIIntigrationService {

    @Autowired private WebClient webClient;
    @Autowired private RedisTemplate redisTemplate;
    @Autowired private CallZAIAgreementsUsingFeignClient callZAIUsingFeignClient;
    @Autowired private ZaiClientRepository zaiClientRepo;
    @Value("${grant_type}") private String grant_type;
    @Value("${zai_client_id}") private String client_id;
    @Value("${zai_client_secret}") private String client_secret;
    @Value("${zai_scope}") private String scope;
    @Value ("${createClient}") private String createUserUrl;

    public ZAITokenResponce generateToken(){
        ZAITokenResponce zaiTokenResponce = webClient.post().uri(ZAIUrls.tokenUri)
                .body(Mono.just(new ZAIHeader(grant_type,client_id,client_secret,scope)), ZAIHeader.class)
                .retrieve().bodyToMono(ZAITokenResponce.class)
                .block();
       // redisTemplate.opsForHash().put("zaiTokenResponce", "token" ,zaiTokenResponce );
//        redisTemplate.expire("token",3600, TimeUnit.SECONDS);
        return  zaiTokenResponce;
    }

    public void createClientAtZai(ZAIClientDTO client) {
        String zaiToken = generateToken().getAccess_token();
        HashMap<String , Object> cl=(HashMap<String , Object>)webClient.post().uri(createUserUrl).body(Mono.just(client), ZAIClientDTO.class)
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + zaiToken)
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .retrieve().bodyToMono(Object.class)
                .block();
        ClientResponce clientResponce1 = ClientResponce.builder().id(client.getId()).first_name(client.getFirst_name()).last_name(client.getLast_name()).email(client.getEmail()).build();
        zaiClientRepo.save(clientResponce1);
    }

    public ClientResponceDTO getUserById(long s) throws JsonProcessingException {
        HashMap<String , Object>  clientResponceMap=(HashMap<String , Object>)webClient.get().uri(ZAIUrls.createClient + "/"+s)
                .header(HttpHeaders.AUTHORIZATION, "Bearer " +generateToken().getAccess_token() )
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .exchangeToMono(clientResponse -> clientResponse.bodyToMono(Object.class)).block();
        return ObjectMapperUtil.copyPropertiesByMapper(clientResponceMap.get("users"), ClientResponceDTO.class);
    }

    public CreateAgreementResponce createPayToAgreement(String agrrmant_uuid) {
        return callZAIUsingFeignClient.createPayToAgreement("Bearer " + generateToken().getAccess_token() ,agrrmant_uuid );
    }

    public CreateAgreementResponce validatePayToAgreement(ValiDatePayToAgreementDTO valiDatePayToAgreementDTO) {
        return callZAIUsingFeignClient.validatePayToAgreement("Bearer " + generateToken().getAccess_token() , valiDatePayToAgreementDTO);
    }

    public ValiDatePayToAgreementDTO getAgreementDetails(String agrrmant_uuid) {
        return callZAIUsingFeignClient.getPayToAgreementDetails("Bearer " + generateToken().getAccess_token() ,agrrmant_uuid );
    }

    public InitiatePayToPyamentResponce initiatePayToPayment(String agrrmant_uuid, InitiatePayToPayment initiatePayToPayments) {
        return callZAIUsingFeignClient.initiatePayToPyament("Bearer " + generateToken().getAccess_token(),agrrmant_uuid,initiatePayToPayments);
    }
    public Payment getPayToPyamentInitiationDetails(String payment_request_uuid) {
//        return  webClient.get().uri( getPayToPaymentInitiationRequestDetails + payment_request_uuid )
//                .header(HttpHeaders.AUTHORIZATION, "Bearer " +  generateToken().getAccess_token())
//                .header(HttpHeaders.CONTENT_TYPE, "application/json")
//                .retrieve().bodyToMono(GetResponcePayment.class)
//                .block();

        return callZAIUsingFeignClient.getPayToPyamentResponce("Bearer " + generateToken().getAccess_token(),payment_request_uuid);

    }
    public Map<String, Object> getAgreementStatus(String agrrmant_uuid) {
        return (HashMap<String , Object>) webClient.patch().uri(ZAIUrls.payToAgreementStatus +agrrmant_uuid +"/status" )
                .header(HttpHeaders.AUTHORIZATION, "Bearer " +  generateToken().getAccess_token())
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .retrieve().bodyToMono(Object.class)
                .block();
    }
    public Map<String, Object> ammendAgreementDetails(String agrrmant_uuid, AmendPayToAgreementDetails amendPayToAgreementDetails) {
        return (HashMap<String , Object>) webClient.patch().uri(ZAIUrls.amendPayToAgreementDetails +agrrmant_uuid+"/amend" )
                .body(Mono.just(amendPayToAgreementDetails),AmendPayToAgreementDetails.class)
                .header(HttpHeaders.AUTHORIZATION, "Bearer " +  generateToken().getAccess_token())
                .header(HttpHeaders.CONTENT_TYPE, "application/json")
                .retrieve().bodyToMono(Object.class)
                .block();
    }

}
