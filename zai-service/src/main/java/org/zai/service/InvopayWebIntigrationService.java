package org.zai.service;

import com.commons.zaiDTOS.client.ClientDTO;
import com.commons.zaiDTOS.client.UserDTO;
import com.google.common.net.HttpHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.HashMap;

@Service
public class InvopayWebIntigrationService {
       @Autowired private WebClient webClient;

    public String getClientCOuntryIsoCountryCode(long ref_country_id) {
        HashMap<String , Object> map =(HashMap<String , Object>) webClient.get().uri("http://localhost:8083/invopay/getCountry/"+ref_country_id)
                .retrieve().bodyToMono(Object.class)
                .block();
        return map.get("data").toString();
    }

    public ClientDTO getUserById(int userId) {
        ClientDTO clientDTO = webClient.get().uri("http://localhost:8083/invopay/getClient/"+userId)
                .retrieve().bodyToMono(ClientDTO.class)
                .block();
        return  clientDTO;
    }
}
