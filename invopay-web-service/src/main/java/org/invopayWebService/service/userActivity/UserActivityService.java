package org.invopayWebService.service.userActivity;

import org.invopayWebService.dto.userActivity.UserActivityDTO;
import org.invopayWebService.repository.userActivity.UserActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserActivityService {
    @Autowired
    private UserActivityRepository userActivityRepository;

    public List<UserActivityDTO> getAllUserActivity(){
        List<UserActivityDTO> userActivityDTO = userActivityRepository.findAllUserActivity();
        return userActivityDTO;
    }

}
