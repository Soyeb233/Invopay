package org.invopayWebService.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;
@Configuration
public class RandomPasswordGenerator {
    String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String lower = "abcdefghijklmnopqrstuvwxyz";
    String num = "0123456789";
    String specialChars = ",./;[]-=<>?:{}\\|!@#$%^&*()_+";
    String combination = upper+lower+num+specialChars;
    int len=8;
    char[]password = new char[len];
    Random r = new Random();


   public String randomPassword(){
       for(int i=0; i<len; i++) {
           password[i]=combination.charAt(r.nextInt(combination.length()));
       }
        System.out.println("ran pass hit");
        return new String(password);

   }
}
