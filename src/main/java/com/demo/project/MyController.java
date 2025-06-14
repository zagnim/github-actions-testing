package com.demo.project;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RestController
@RequestMapping(value = "/api")
public class MyController {


    private final MyService service;

    public MyController(MyService ms) {
        this.service = ms;
    }

    @GetMapping
    public ResponseEntity<List<Dto>> getResponses () {
        List<Dto> dtos = service.getDtos();
        return ResponseEntity.accepted().body(dtos);
    }
}
