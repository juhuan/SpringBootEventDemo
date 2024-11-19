package com.juhuan.springbooteventdemo.springbootevent.nonbean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class AvailabilityChangeEventListener implements ApplicationListener<AvailabilityChangeEvent> {
    @Override
    public void onApplicationEvent(AvailabilityChangeEvent event) {
        log.info(">>>>> NoneBean       receive AvailabilityChangeEvent");
    }
}