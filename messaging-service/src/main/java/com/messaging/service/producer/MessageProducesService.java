package com.messaging.service.producer;

import com.messaging.dto.MessageDTO;

import javax.jms.JMSException;

public interface MessageProducesService {
    public boolean sendMessage(MessageDTO message) throws JMSException;

}
