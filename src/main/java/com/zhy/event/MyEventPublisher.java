package com.zhy.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publish(String message){
        MyEvent myEvent = new MyEvent(this,message);
        applicationEventPublisher.publishEvent(myEvent);
    }

}
