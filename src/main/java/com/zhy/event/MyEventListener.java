package com.zhy.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventListener {

    @EventListener
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println("this is receive"+myEvent.getMessage());
    }
}
