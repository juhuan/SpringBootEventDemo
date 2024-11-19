package com.juhuan.springbooteventdemo.springbootevent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SpringBootRunnerComponent {

    @Component
    public class MyCommandLineRunner implements CommandLineRunner {
        @Override
        public void run(String... args) throws Exception {
            log.info(">>>>> CommandLineRunner doing something");
        }
    }

    @Component
    public class MyApplicationRunner implements ApplicationRunner {
        @Override
        public void run(ApplicationArguments args) throws Exception {
            log.info(">>>>> ApplicationRunner doing something");
        }
    }
}
