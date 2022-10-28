package com.example.waterdatabase.com;

import com.example.waterdatabase.pojo.Ob;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.couchbase.CouchbaseProperties;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${name.haha}")
    private String name;

    @Autowired
    private Ob ob;
    @Autowired
    private Environment env;
    @RequestMapping("/hello")
    public String hello()
    {
        System.out.println(env.getProperty("name.haha"));
        System.out.println(ob);
        return "hello"+name;
        //return "hellp";
    }
}
