package com.messaging.feignClint;

import com.messaging.dto.messageRsponce.MessageResponce;
import com.messaging.swagger.MessageCover;
import feign.Headers;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "FeignClentSMSCall", url = "${smsBaseUrl}")
public interface FeignClentSMSCall {

    @PostMapping(value="${url}")
    @Headers("Content-Type: application/json")
    MessageResponce sendMessage(@RequestHeader(value = "Authorization") String authorizationHeader, @RequestBody MessageCover message);
}
