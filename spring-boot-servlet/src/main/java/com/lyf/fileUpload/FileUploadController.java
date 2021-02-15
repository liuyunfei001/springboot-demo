package com.lyf.fileUpload;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * springboot 文件上传是方法实现
 */
@RestController  //表示当前类下所有的返回值会自动做json格式转换
public class FileUploadController {

    @RequestMapping("/fileUpload")
    public Map<String,Object> FileUpload(MultipartFile filename) throws  Exception {
        System.out.println(filename.getOriginalFilename());
        filename.transferTo(new File("E:/" + filename.getOriginalFilename()));
        Map <String, Object> map = new HashMap <>();
        map.put("msg", "ok");
        return map;
    }
}
