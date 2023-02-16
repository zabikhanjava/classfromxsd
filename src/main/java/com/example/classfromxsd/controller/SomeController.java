package com.example.classfromxsd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

  @GetMapping("/some")
  public String hello() {
    System.out.println("dsd");
    return "helolo";
  }
}
