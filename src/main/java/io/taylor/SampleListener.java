package io.taylor;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;


//public class SampleListener implements ApplicationListener<ApplicationStartingEvent> {
//    @Override
//    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
//        System.out.println("=======================");
//        System.out.println("Application is starting");
//        System.out.println("=======================");
//    }
//}

//@Component
//public class SampleListener implements ApplicationListener<ApplicationStartedEvent> {
//    @Override
//    public void onApplicationEvent(ApplicationStartedEvent applicationStartesEvent) {
//        System.out.println("=======================");
//        System.out.println("Application is started");
//        System.out.println("=======================");
//    }
//}

//@Component
//public class SampleListener {
//
//    public SampleListener(ApplicationArguments arguments) {
//        System.out.println("foo: " + arguments.containsOption("foo"));
//        System.out.println("bar: " + arguments.containsOption("bar"));
//    }
//}

//@Component
//public class SampleListener implements ApplicationRunner {
//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("foo: " + args.containsOption("foo"));
//        System.out.println("bar: " + args.containsOption("bar"));
//    }
//}

// JVM 옵션 무시
//@Component
//public class SampleListener implements CommandLineRunner {
//
//    @Override
//    public void run(String... args) throws Exception {
//        Arrays.stream(args).forEach(System.out::println);
//    }
//}