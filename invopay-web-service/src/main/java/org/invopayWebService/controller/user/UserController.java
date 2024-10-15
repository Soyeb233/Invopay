package org.invopayWebService.controller.user;

import com.commons.ResponceHandler;
import org.invopayWebService.dto.user.UserDTO;
import org.invopayWebService.entity.User;
import org.invopayWebService.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/invopay")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userServices;

    @PostMapping("/register")
    public ResponseEntity<Object> createClient(@RequestBody com.commons.zaiDTOS.client.UserDTO userDTO){
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,"this is vishal");
    }

    @GetMapping("/getUser/{id}")
    public ResponseEntity<Object> createClient(@PathVariable int id){

        return ResponceHandler.generateResponce(HttpStatus.OK , true ,userServices.findUserById(id));
    }

    @GetMapping("/getAllUser")
    public ResponseEntity<Object> getAllUser(){

        return ResponceHandler.generateResponce(HttpStatus.OK , true , userServices.findAllUser());
    }

    @PostMapping("/addNewUser")
    public ResponseEntity<Object> addNewUser(@RequestBody User user){
        return ResponceHandler.generateResponce(HttpStatus.OK , true , userServices.addNewUser(user));
    }

    @GetMapping("/findByUserId/{id}")
    public User getUserById(@PathVariable int id){
        return userServices.findUserById(id);
    }

    @PostMapping("/editUsers")
    public ResponseEntity<Object> editUsers(@RequestBody User user){
         System.out.println(user);
        return ResponceHandler.generateResponce(HttpStatus.OK , true ,"this is vishal");
    }

    @PutMapping("/deleteUser")
    public ResponseEntity<Object> deleteUser(@RequestBody Integer id){
        System.out.println(id);
        return ResponceHandler.generateResponce(HttpStatus.OK, true,userServices.changeDeleteStatus(id));
    }

    @PutMapping("/updateUserPassword")
    public ResponseEntity<Object> updatePassword(@RequestBody Integer id){
        System.out.println("update pass id : "+id);
        return  ResponceHandler.generateResponce(HttpStatus.OK, true,userServices.updatePassword(id));
    }
    @GetMapping("/getLatestRecord")
    public ResponseEntity<Object> findLatestRecord(){
        return  ResponceHandler.generateResponce(HttpStatus.OK, true,userServices.findLatestRecord());
    }

    @GetMapping("/getUserIdBySupplierId/{id}")
    public ResponseEntity<Object> getUserId(@PathVariable Integer id){
        return  ResponceHandler.generateResponce(HttpStatus.OK, true,userServices.getUserId(id));
    }

    @PutMapping("/updateUser/{id}")
    public ResponseEntity<Object> updateUser(@RequestBody User user,@PathVariable  int id){
        return  ResponceHandler.generateResponce(HttpStatus.OK, true,userServices.updateUser(user,id));
    }
}
