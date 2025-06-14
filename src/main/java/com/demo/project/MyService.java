package com.demo.project;


import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyService {
    private final String key1;
    private final String value1;
    private final String key2;
    private final String value2;
    private final String key3;
    private final String value3;


    public MyService(
            @Value("${dtos.first.key}") String key1,
            @Value("${dtos.first.value}") String value1,
            @Value("${dtos.second.key}") String key2,
            @Value("${dtos.second.value}") String value2,
            @Value("${dtos.third.key}") String key3,
            @Value("${dtos.third.value}") String value3
    ){
        this.key1=key1;
        this.value1=value1;
        this.key2=key2;
        this.value2=value2;
        this.key3=key3;
        this.value3=value3;
    }

    public List<Dto> getDtos() {
        return List.of(
                new Dto(key1, value1),
                new Dto(key2, value2),
                new Dto(key3, value3)
        );
    }


}
