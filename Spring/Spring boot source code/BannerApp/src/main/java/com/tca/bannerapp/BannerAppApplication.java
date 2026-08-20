package com.tca.bannerapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class BannerAppApplication {

    public static void main(String[] args) {


        SpringApplication.run(BannerAppApplication.class, args);

        for(String s:args){
            System.out.println(s);
        }
    }

}
