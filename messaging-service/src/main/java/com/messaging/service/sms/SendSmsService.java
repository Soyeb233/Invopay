package com.messaging.service.sms;

import com.messaging.dto.Message;
import com.messaging.dto.messageRsponce.MessageResponce;
import com.messaging.feignClint.FeignClentSMSCall;
import com.messaging.swagger.MessageCover;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class SendSmsService {

    @Autowired
    private FeignClentSMSCall feignClentSMSCall;

    public boolean sendSMS(Message msg){
        boolean sendSmsResponce = false;
        try{
            MessageCover messageCover = new MessageCover();
            ArrayList<Message> messages = new ArrayList<>();
            messages.add(msg);
            messageCover.setMessages(messages);
            String auth = "Basic "+"cGV0ZS5rb29uZXJAcHNraG9sZGluZ3MuY29tOjZDRkFERkU3LTE2MzYtMzRBNC03NkNGLTkzMDE1NkUxRDI1MQ==";
            MessageResponce messageResponce = feignClentSMSCall.sendMessage(auth,messageCover);
            System.out.println(messageResponce.toString());
            if(messageResponce.response_code.equals("SUCCESS")){
                sendSmsResponce= true;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
        return sendSmsResponce;
    }

}
