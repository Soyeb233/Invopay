package org.invopayWebService.controller.userActivity;

import org.invopayWebService.dto.userActivity.UserActivityDTO;
import org.invopayWebService.service.userActivity.UserActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class UserActivityController {

    @Autowired
    UserActivityService userActivityService;

    @GetMapping("/getAllUserActivity")
    public List<UserActivityDTO> getAllUserActivity(){
        List<UserActivityDTO> userActivityDTOData = userActivityService.getAllUserActivity();
        return userActivityDTOData;
    }

}
