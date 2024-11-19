package com.juhuan.springbooteventdemo.myevent;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyEventPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    @PostConstruct
    public void publishCustomEvent() {
        MyEvent myEvent = new MyEvent(this, "xxx");
        log.info("Publish MyEvent:" + myEvent.getMessage());
        applicationEventPublisher.publishEvent(myEvent);
    }
}
