package com.lyf.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FileUploadController {

    @RequestMapping("/fileUpload")
    public Map<String,Object> fileUpload(MultipartFile filename) throws IOException {
         System.out.println(filename.getOriginalFilename());
        filename.transferTo(new File("E:/" + filename.getOriginalFilename()));
        Map <String, Object> map = new HashMap <>();
        map.put("msg", "ok");
        return map;
    }
}
