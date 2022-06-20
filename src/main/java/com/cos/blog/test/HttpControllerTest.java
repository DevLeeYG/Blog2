package com.cos.blog.test;

import lombok.Data;
import org.springframework.web.bind.annotation.*;
@Data
@RestController
public class HttpControllerTest {

    private static final String TAG = "httpControllerTest: ";

    @GetMapping("/http/lombok")
    public String lombokTest(){
        Member member = new Member(1,"ssar","1234","email");
        System.out.println(TAG+"getter"+ member.getId());
        member.setId(5000);
        System.out.println(TAG+"SETTER"+ member.getId());
        return "lombok test 완료";
    }

    @GetMapping("/http/get")
    public String getTest(Member member){
        return "get"+ member.getId()+","+member.getUsername();
    }
    @PostMapping("/http/post")
    public String postTest(@RequestBody Member member){
        return "post:"+ member.getId()+","+member.getUsername()+","+member.getPassword()+","+member.getEmail();
    }

}
