package io.taylor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {
//    @Value("${taylor.fullName}")
//    private String name;
//
//    @Value("${taylor.age}")
//    private int age;

    @Autowired
    TaylorProperties taylorProperties;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===============");
        System.out.println(taylorProperties.getName());
        System.out.println(taylorProperties.getAge());
        System.out.println("===============");

    }
}
