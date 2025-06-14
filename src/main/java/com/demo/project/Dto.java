package com.demo.project;


import lombok.Data;
import lombok.Builder;


@Data
@Builder
public class Dto {
    private final String key;
    private final String value;

    public Dto(String k, String v) {
        this.key = k;
        this.value = v;
    }
}
