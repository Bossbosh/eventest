package com.zhy.event;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;

import java.util.ArrayList;
import java.util.List;

public class MyEvent extends ApplicationEvent {

    private String message;

    public MyEvent(Object source,String message) {
        super(source);
        this.message = message;

    }

    public String getMessage(){
        return message;
    }

    public static void main(String[] args) {
//        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(Object.class);
//        springApplicationBuilder.web(WebApplicationType.NONE).run(args);

        List<String> list = new ArrayList();

        new SpringApplicationBuilder(Object.class)
                .listeners(event -> {
                    System.out.println("事件对象："
                            + event.getClass().getSimpleName()
                            + " ,事件源：" + event.getSource().getClass().getSimpleName());
                })
                .web(WebApplicationType.NONE)
                .run(args)
                .close();
    }
}
