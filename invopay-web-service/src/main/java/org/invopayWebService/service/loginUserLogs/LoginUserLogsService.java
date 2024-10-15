package org.invopayWebService.service.loginUserLogs;

import org.invopayWebService.dto.loginUserLogs.LoginUserLogsDTO;
import org.invopayWebService.repository.loginUserLogs.LoginUserLogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginUserLogsService {

    @Autowired
   private LoginUserLogsRepository loginUserLogsRepository;

   public List<LoginUserLogsDTO> getAllLoginUserLogs (){

       List<LoginUserLogsDTO> loginUserLogsDto = loginUserLogsRepository.findAllLoginUserLogs();
       return loginUserLogsDto;
    }


}
