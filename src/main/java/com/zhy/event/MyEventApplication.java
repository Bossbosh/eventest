package com.zhy.event;


import com.efunds.log.config.CustomConfigurationFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

//@SpringBootApplication(scanBasePackages = "com.zhy.event",exclude = {
//        DataSourceAutoConfiguration.class,
//        DataSourceTransactionManagerAutoConfiguration.class,
//        HibernateJpaAutoConfiguration.class})
@SpringBootApplication
public class MyEventApplication {

    public static void main(String[] args) {
         System.setProperty("log4j.configurationFactory", CustomConfigurationFactory.class.getName());
         SpringApplication springApplication = new SpringApplication(MyEventApplication.class);
         springApplication.run(args);
    }
}
