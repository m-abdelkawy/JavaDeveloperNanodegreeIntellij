package com.example.springbootfileupload.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UploadController {
    Map<String, Object> result = new HashMap<>();

    ///receive message
    @RequestMapping("/upload")
    public Map<String, Object> upload(@RequestParam("attach") MultipartFile file) throws IOException {
        //file info
        System.out.println("File Name= "+ file.getOriginalFilename());
        System.out.println("File Type= "+ file.getContentType());
        //save on disk
        String filePath = "D:\\00. Code Trials\\Git\\JavaDeveloperNanodegreeIntellij\\spring-boot-file-upload\\src\\main\\resources\\uploadedFiles\\";
        file.transferTo(new File(filePath + file.getOriginalFilename()));
        result.put("Success", true);
        return result;
    }
}
