package com.juhuan.springbooteventdemo.springbootevent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationFailedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SpringBootEventComponent {

    @EventListener
    public void handleAEvent(ApplicationStartingEvent event) {
        log.info(">>>>> @EventListener receive ApplicationStartingEvent");
    }

    @EventListener
    public void handleAEvent(ApplicationEnvironmentPreparedEvent event) {
        log.info(">>>>> @EventListener receive ApplicationEnvironmentPreparedEvent");
    }

    @EventListener
    public void handleAEvent(ApplicationContextInitializedEvent event) {
        log.info(">>>>> @EventListener receive ApplicationContextInitializedEvent");
    }

    @EventListener
    public void handleAEvent(ApplicationPreparedEvent event) {
        log.info(">>>>> @EventListener receive ApplicationPreparedEvent");
    }

    @EventListener
    public void handleAEvent(ContextRefreshedEvent event) {
        log.info(">>>>> @EventListener receive ContextRefreshedEvent");
    }

    @EventListener
    public void handleAEvent(ApplicationStartedEvent event) {
        log.info(">>>>> @EventListener receive ApplicationStartedEvent");
    }

    @EventListener
    public void handleAEvent(AvailabilityChangeEvent event) {
        log.info(">>>>> @EventListener receive AvailabilityChangeEvent");
    }

    @EventListener
    public void handleAEvent(ApplicationReadyEvent event) {
        log.info(">>>>> @EventListener receive ApplicationReadyEvent");
    }

    @EventListener
    public void handleAEvent(ApplicationFailedEvent event) {
        log.info(">>>>> @EventListener receive ApplicationFailedEvent");
    }
}
