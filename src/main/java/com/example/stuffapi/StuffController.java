package com.example.stuffapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StuffController {
    @GetMapping("/stuff")
    List<String> getStuff () {
      List<String> stuff = List.of("kitten", "pinecone", "plunger");
      return stuff;
    }
}

