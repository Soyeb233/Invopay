package org.invopayWebService.controller.userGroup;

import com.commons.ResponceHandler;
import org.invopayWebService.service.userGroup.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/invopay/userGroup")
public class UserGroupController {

    @Autowired
    private UserGroupService userGroupService;

    @GetMapping("/getAllUserGroup")
    public ResponseEntity<Object> getAllUserGroup(){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,userGroupService.getAllUserGroup());
    }
    @PutMapping("/deleteUserGroup")
    public ResponseEntity<Object> deleteUser(@RequestBody int id){
        System.out.println(id);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,userGroupService.changeDeleteStatus(id));
    }
}
