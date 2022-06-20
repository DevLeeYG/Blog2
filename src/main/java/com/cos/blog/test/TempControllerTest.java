package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//파일을 리턴할꺼야
public class TempControllerTest {

    @GetMapping("/temp/home")
    public String tempHome(){

        return "/home.html";
    }

    @GetMapping("/temp/jsp")
    public String tempJst(){
        return "test";
    }

}
