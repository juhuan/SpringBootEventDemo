package com.juhuan.springbooteventdemo.springbootevent.nonbean;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class ApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        log.info(">>>>> NoneBean       receive ApplicationStartingEvent");
        // 这个阶段日志框架还没初始化，只能用sout打印
        System.out.println(">>>>> NoneBean       receive ApplicationStartingEvent");
    }
}