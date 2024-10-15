package com.messaging.controller;

import com.messaging.commons.ResponceHandler;
import com.messaging.dto.MessageDTO;
import com.messaging.service.producer.MessageProducesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.JMSException;

@RestController
public class MesageController {

    @Autowired
    private MessageProducesService messageService;

    @PostMapping("/send_email_and_sms")
    public ResponseEntity<Object> webHooksPyamentStatus(@RequestBody MessageDTO messageDTO) throws JMSException {
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,messageService.sendMessage(messageDTO));
    }

}
