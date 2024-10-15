package com.messaging.service.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface MessageConsumerService {
    public void onMessage(String message) throws JsonProcessingException;

}
