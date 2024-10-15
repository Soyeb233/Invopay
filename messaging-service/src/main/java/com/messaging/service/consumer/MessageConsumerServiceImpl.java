package com.messaging.service.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.messaging.dto.Message;
import com.messaging.dto.MessageDTO;
import com.messaging.models.template.MessageTemplate;
import com.messaging.repository.TemplateRepository;
import com.messaging.service.email.SendEmailService;
import com.messaging.service.sms.SendSmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MessageConsumerServiceImpl implements MessageConsumerService {
    @Autowired private SendEmailService sendEmailService;

    @Autowired private SendSmsService sendSmsService;

    @Autowired private TemplateRepository templateRepository;

    @JmsListener(destination = "email")
    public void onMessage(String message) throws JsonProcessingException {
        MessageDTO messageDTO =null;
        ObjectMapper objectMapper = new ObjectMapper();
        messageDTO = objectMapper.readValue(message, MessageDTO.class);
        messageDTO.setDate(LocalDate.now().toString());
        List<MessageTemplate> templates = templateRepository.findTemplateDataByTemplateName(messageDTO.getType().toString());
        MessageTemplate smsTemplate = templates.stream().filter(e->e.getTemplateType().equals("EMAIL")).findFirst().get();
        Message msg = new Message();
        msg.setBody(smsTemplate.getTemplateDescription1());
        msg.setTo(messageDTO.getClientNo());
        msg.setFrom("");
        boolean sendSMSResponce = sendSmsService.sendSMS(msg);
        boolean sendEmailResponce = sendEmailService.sendEmail(messageDTO, templates.stream().filter(e->e.getTemplateType().equals("EMAIL")).findFirst().get());
    }


}
