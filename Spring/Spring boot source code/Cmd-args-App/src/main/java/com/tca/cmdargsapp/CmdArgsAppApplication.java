package com.tca.cmdargsapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CmdArgsAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmdArgsAppApplication.class, args);

//        System.out.println(Arrays.toString(args));
    }
}