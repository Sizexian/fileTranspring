package com.example.filetranspring.controller;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
public class FileUploadController {
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String uploadFile(@NonNull MultipartFile file) throws Exception {
        String originalFilename = file.getOriginalFilename();
        Files.createDirectories(Path.of(System.getProperty("user.dir") + "\\files\\"));
        file.transferTo(new File(System.getProperty("user.dir") + "\\files\\" + originalFilename));
        return "upload success!";
    }
}
