package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HelloController {
    
    @GetMapping("/hello")
    public Message hello(@RequestParam(value = "name") String name) {
        String message = "こんにちは、" + name + "さん！";
        // Messageクラスのインスタンスを作成し、messageをセットする
        Message msg = new Message(message);
        return msg;
    }

}
