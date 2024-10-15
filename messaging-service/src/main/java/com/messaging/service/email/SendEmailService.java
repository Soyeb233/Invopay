package com.messaging.service.email;

import com.messaging.dto.MessageDTO;
import com.messaging.models.template.MessageTemplate;
import freemarker.template.Configuration;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.io.StringWriter;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class SendEmailService {


    @Value("${address}") String address;
    @Value("${usern}") String usern;
    @Value("${smtphost}") String smtphost;
    @Value("${user}") String user;
    @Value("${emailpassword}") String emailpassword;
    final Configuration configuration;

    public SendEmailService(Configuration configuration) {
        this.configuration = configuration;
    }
    public boolean sendEmail(MessageDTO messageDTO, MessageTemplate template) {
        boolean sendEmailResponce = false;
        try {
            Properties props = System.getProperties();
            props.put("mail.transport.protocol", "smtp");
            props.put("mail.smtp.port", 2587);
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.auth", "true");
            Session session = Session.getDefaultInstance(props);
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(address, usern));
            msg.setRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(messageDTO.getClientEmail()));
            MimeMessageHelper helper = new MimeMessageHelper(msg);
            helper.setSubject("Welcome To Invopay");
            helper.setTo(messageDTO.getClientEmail());
            String emailContent = getEmailContent(messageDTO,template);
            helper.setText(emailContent, true);
            Transport transport = session.getTransport();
            transport.connect(smtphost, user, emailpassword);
            transport.sendMessage(msg, msg.getAllRecipients());
            sendEmailResponce = true;
        } catch (Exception ex) {
            Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, ex.getMessage(), ex);
        }
        return true;
    }

    private String getEmailContent(MessageDTO messageDTO, MessageTemplate template) throws IOException, TemplateException {
        StringWriter stringWriter = new StringWriter();
        Map<String, Object> model = new HashMap<>();
        messageDTO.setDate(LocalDate.now().toString());
        model.put("msg", messageDTO);
        model.put("templateData",template);
        configuration.getTemplate(template.getTemplate()).process(model, stringWriter);
        return stringWriter.getBuffer().toString();
    }

}
