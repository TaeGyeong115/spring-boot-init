package io.taylor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class SampleRunner implements ApplicationRunner {
    private Logger logger = LoggerFactory.getLogger(SampleRunner.class);

    @Autowired
    TaylorProperties taylorProperties;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("===============");
        System.out.println(taylorProperties.getName());
        System.out.println(taylorProperties.getAge());
        System.out.println("===============");

        logger.debug("===========================");
//        logger.debug(hello);
        logger.debug(taylorProperties.getName());
        logger.debug(taylorProperties.getFullName());
        logger.debug("===========================");

    }
}
