package com.messaging.service.producer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.messaging.dto.MessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import javax.jms.*;

@Service
public class MessageProducerServiceImpl implements MessageProducesService {

    @Autowired private JmsTemplate jmsTemplate;

    public boolean sendMessage(MessageDTO messageDTO) throws JMSException {
        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                String json =null;
                ObjectMapper mapper = new ObjectMapper();
                try {
                    json = mapper.writeValueAsString(messageDTO);
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
                ObjectMessage objectMessage = session.createObjectMessage(json);
                return objectMessage;
            }
        });
        return false;
    }

}
