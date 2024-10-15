package org.invopayWebService.controller.loginUserLogs;

import org.invopayWebService.dto.loginUserLogs.LoginUserLogsDTO;
import org.invopayWebService.service.loginUserLogs.LoginUserLogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class LoginUserLogsController {
    @Autowired
    private LoginUserLogsService loginUserLogsService;

//    @GetMapping("/getAllLoginUserLogs")
//    public ResponseEntity<List<LoginUserLogsDTO>> getLoginUserLogs(){
//
//        List<LoginUserLogsDTO> loginUserLogsData = loginUserLogs.getAllLoginUserLogs();
//
//        return new ResponseEntity<>(loginUserLogsData, HttpStatus.ok) ;
//    }

        @GetMapping("/getAllLoginUserLogs")
    public List<LoginUserLogsDTO> getLoginUserLogs(){

      List<LoginUserLogsDTO> loginUserLogsDto = loginUserLogsService.getAllLoginUserLogs();

        return loginUserLogsDto;
    }
}
