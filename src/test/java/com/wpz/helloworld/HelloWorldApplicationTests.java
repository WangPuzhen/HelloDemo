package com.wpz.helloworld;

import com.wpz.helloworld.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWorldApplicationTests {
    @Autowired
    Person person;

    @Test
    void contextLoads() {
    }

    @Test
    void test(){
        // test git
        System.out.println(person);
    }

}
