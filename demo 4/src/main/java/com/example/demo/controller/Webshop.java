package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class Webshop {


@GetMapping("")
    public String viewHomePage() {
    return "index";
}
@GetMapping("/book1")
    public String ProductDescreption() {
    return "book1";

}
}



