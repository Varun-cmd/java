package org.example.web_annotations.controller;

import org.example.web_annotations.beans.book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.print.Book;

@Controller
public class bookController {

    @RequestMapping("/hello")

    @ResponseBody
    public String hello(){
        return "hello from book controller ";
    }



    @RequestMapping("/books")

    @ResponseBody

    public book getBook(){
        return new book(2088,"Fun with java","Detailed info on java");
    }

}
