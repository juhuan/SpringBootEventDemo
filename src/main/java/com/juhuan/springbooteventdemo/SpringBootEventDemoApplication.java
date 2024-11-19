package com.juhuan.springbooteventdemo;

import com.juhuan.springbooteventdemo.springbootevent.nonbean.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEventDemoApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringBootEventDemoApplication.class, args);
        SpringApplication application = new SpringApplication(SpringBootEventDemoApplication.class);
        application.addListeners(new ApplicationStartingEventListener());
        application.addListeners(new ApplicationEnvironmentPreparedEventListener());
        application.addListeners(new ApplicationContextInitializedEventListener());
        application.addListeners(new ApplicationPreparedEventListener());
        application.addListeners(new ContextRefreshedEventListener());
        application.addListeners(new ApplicationStartedEventListener());
        application.addListeners(new AvailabilityChangeEventListener());
        application.addListeners(new ApplicationReadyEventListener());
        application.addListeners(new ApplicationFailedEventListener());
        application.run(args);
    }

}
