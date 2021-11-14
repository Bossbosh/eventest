package com.zhy.event;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EventTest {

    @Autowired
    private MyEventPublisher myEventPublisher;

    @Test
    public void testEvent(){
        myEventPublisher.publish("news.....");
    }


}
