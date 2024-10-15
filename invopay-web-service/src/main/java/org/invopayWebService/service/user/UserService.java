package org.invopayWebService.service.user;


import com.commons.ObjectMapperUtil;
import org.invopayWebService.dto.user.UserDTO;
import org.invopayWebService.entity.Supplier;
import org.invopayWebService.entity.User;
import org.invopayWebService.repository.user.UserRepository;
import org.invopayWebService.util.PasswordEncryptor;
import org.invopayWebService.util.RandomPasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    RandomPasswordGenerator randomPasswordGenerator;

    public User registration(com.commons.zaiDTOS.client.UserDTO userDTO){
        User user = ObjectMapperUtil.copyPropertiesByMapper(userDTO , User.class);
        userRepository.save(user);
        return user;
    }

    public User findUserById(int id){
        return userRepository.findById(id).get();
    }

    public List<UserDTO> findAllUser(){
        List<UserDTO> userDto = userRepository.findAllUser();
        return userDto;
    }

    public boolean changeDeleteStatus(Integer id) {
            Optional<User> supplierItem = userRepository.findById(id);
            if (supplierItem.isPresent()) {
                userRepository.deleteStaus(id,1);
            } else {
                return false;
            }
        return true;
    }

    public String updatePassword(Integer id){
        Optional<User> user=userRepository.findById(id);
        if(user.isPresent()) {
            String newGeneratedPassword = randomPasswordGenerator.randomPassword();
            String encryptedRandomPassword = PasswordEncryptor.getMd5(newGeneratedPassword);
            System.out.println("new generated password : "+newGeneratedPassword);
            System.out.println("encrypted random generated password : "+encryptedRandomPassword);
            userRepository.updatePassword(newGeneratedPassword,encryptedRandomPassword, id);
        }
        else{
            throw new RuntimeException("Password updated faild.....");
        }
        return "Password updated succesfully....";
    }

    public User findLatestRecord(){

        return userRepository.findFirstByOrderByUserIdDesc();
    }

    public Object getUserId(Integer id) {
        System.out.println(id);
        return userRepository.getUserId(id);
    }

    public String updateUser(User userData, int id) {
        Optional<User> userDetails=userRepository.findById(id);
        if(userDetails.isPresent()){
            User user=userDetails.get();
            user.setFullName(userData.getFullName());
            user.setNickName(userData.getNickName());
            user.setEmail(userData.getEmail());
            user.setOriginalPassword(userData.getOriginalPassword());
            user.setRefUserGroupId(userData.getRefUserGroupId());
            user.setDeleteStatus(userData.getDeleteStatus());;

            userRepository.save(user);

        } else {
            throw  new ArithmeticException("Records not Updated...");
        }
        return "record updated succesfully..";
    }

    public User addNewUser(User user) {
        System.out.println(user);
       return  userRepository.save(user);
    }
}
