package com.zhy.event;


import com.efunds.log.config.CustomConfigurationFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyEventApplication {

    public static void main(String[] args) {
         System.setProperty("log4j.configurationFactory", CustomConfigurationFactory.class.getName());
         SpringApplication springApplication = new SpringApplication(MyEventApplication.class);
         springApplication.run(args);
    }
}
