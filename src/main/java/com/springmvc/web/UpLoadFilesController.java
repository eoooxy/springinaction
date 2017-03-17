package com.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * Author XueYuan
 * Data  2017/03/17
 * Time  8:43
 */

@Controller
public class UpLoadFilesController {

    @RequestMapping(value = "/upload.do", method = RequestMethod.POST)
    public String upLoadFiles(MultipartFile file) {

        File tempFile = new File("d://multipart.jpg");
        try {
            file.transferTo(tempFile);
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
            return "error";
        }

    }
}
