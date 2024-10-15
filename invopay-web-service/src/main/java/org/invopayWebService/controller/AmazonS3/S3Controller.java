package org.invopayWebService.controller.AmazonS3;

import org.invopayWebService.service.amazonS3Service.S3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class S3Controller {
    @Autowired
    private S3Service s3Service;

    @PostMapping("/upload")
    public String upload(@RequestParam("file" ) MultipartFile file){
        return s3Service.saveFile(file);
    }

    @GetMapping("/download/{fileName}")
    public byte[] download(@PathVariable("fileName" )String fileName){
        return s3Service.downloadFile(fileName);
    }

   @DeleteMapping("/delete/{fileName}")
   public String deleteFile(@PathVariable("fileName")String fileName){
        return s3Service.deleteFile(fileName);
   }

   @GetMapping("/getAllFiles")
    public List<String> getAllFile(){
        return s3Service.listAllFiles();
   }

}
