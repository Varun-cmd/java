package org.example.restapi.Controller;


import org.example.restapi.course;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@ConfigurationProperties(prefix = "myapp.user")
public class courceController {
    public  String username;
    public String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @RequestMapping("/course")
    public List<course> getAllCourse(){
        return Arrays.asList(
                new course(1,"AWS","Udemy"),
                new course(2,"GCP","Udemy"),
                new course(3,"Azure","micro learn learn"),
                new course(4,"git","Github Learn")

        );
    }

}
