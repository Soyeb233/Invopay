package org.invopayWebService.controller.login;

import com.commons.ResponceHandler;
import org.invopayWebService.dto.login.LoginDTO;
import org.invopayWebService.service.login.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/validateUser")
    public ResponseEntity<Object> validateUsers(@RequestBody LoginDTO loginDTO){
        System.out.println(loginDTO.getUserName()+" "+loginDTO.getPassword());
       LoginDTO loginDTO1= loginService.validateUser(loginDTO);
       try {
           if ((loginDTO1.getUserName() == null) || (loginDTO1.getUserName().equals(null)) || (loginDTO1.getPassword() == null) || (loginDTO1.getPassword().equals(null))) {
               return ResponceHandler.generateResponce(HttpStatus.OK, false, "");
           }
       }
       catch(NullPointerException e){
           return ResponceHandler.generateResponce(HttpStatus.OK, false, "");
       }
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,loginDTO1);
    }

    @PostMapping("/sendForgotPasswordOnEmail/{userName}")
    public ResponseEntity<Object> sendForgotPasswordOnEmail(@PathVariable String userName) {
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,loginService.sendForgotPasswordOnEmail(userName));
    }
}
