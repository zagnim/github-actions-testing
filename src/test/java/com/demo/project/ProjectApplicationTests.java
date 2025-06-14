package com.demo.project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class ProjectApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void  sumOfTwoPlusTwoShouldEqualFour() {
        int sum = 2 + 2;
        assertEquals(4, sum);
    }

}