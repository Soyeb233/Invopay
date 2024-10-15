package org.invopayWebService.service.amazonS3Service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface FileService {
    String saveFile(MultipartFile file);

    byte[] downloadFile(String fileName);

    String deleteFile(String fileName);

    List<String> listAllFiles();
}
