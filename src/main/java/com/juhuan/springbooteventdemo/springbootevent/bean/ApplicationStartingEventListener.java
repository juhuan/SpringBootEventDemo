package com.juhuan.springbooteventdemo.springbootevent.bean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        log.info(">>>>> Bean            receive ApplicationStartingEvent");
        System.out.println(">>>>> Bean            receive ApplicationStartingEvent");
    }
}