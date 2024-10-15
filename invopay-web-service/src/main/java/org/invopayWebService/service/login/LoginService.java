package org.invopayWebService.service.login;

import org.invopayWebService.dto.login.LoginDTO;
import org.invopayWebService.dto.message.MessageDTO;
import org.invopayWebService.dto.message.Type;
import org.invopayWebService.entity.User;
import org.invopayWebService.repository.client.ClientRepository;
import org.invopayWebService.repository.invoice.InvoiceRepository;
import org.invopayWebService.repository.login.LoginRepository;
import org.invopayWebService.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;
    @Autowired
    private InvoiceRepository invoiceRepository;
    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;
    private String emailBaseUrl = "http://localhost:8084/send_email_and_sms";
    public LoginDTO validateUser(LoginDTO loginDTO){
       LoginDTO loginDTO1=loginRepository.validateUser(loginDTO.getUserName(),loginDTO.getPassword());
       return  loginDTO1;

    }

    public boolean sendForgotPasswordOnEmail(String username) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

        Optional<User> user=userRepository.findByUserName(username);
        Optional<User> userEmail=userRepository.findByEmail(username);
        if(user.isPresent()) {


            User userDetail=userEmail.get();
            MessageDTO messageDTO = MessageDTO.builder().userId(userDetail.getUserId()).userName(userDetail.getUserName()).clientEmail("soyeb.m@cloudanalogy.com").date(LocalDate.now().toString())
                    .type(Type.FORGET_PASSWORD).forgetPasswordLink("http://localhost:3000/invopay/dashboard").build();
            HttpEntity<MessageDTO> entity = new HttpEntity<>(messageDTO, headers);
            String str = restTemplate.postForObject(emailBaseUrl, entity, String.class);
            return true;

        }
        else if(userEmail.isPresent()) {
            User userEDetail=userEmail.get();
            MessageDTO messageDTO = MessageDTO.builder().userId(userEDetail.getUserId()).userName(userEDetail.getUserName()).clientEmail(userEDetail.getEmail()).date(LocalDate.now().toString())
                    .type(Type.FORGET_PASSWORD).forgetPasswordLink("http://localhost:3000/invopay/dashboard").build();
            HttpEntity<MessageDTO> entity = new HttpEntity<>(messageDTO, headers);
            String str = restTemplate.postForObject(emailBaseUrl, entity, String.class);
            return true;
        }
        else {
            return false;
        }


    }
}
