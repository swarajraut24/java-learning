package com.tca.cmdargsapp;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;


@Component
 public class Myrunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<String> lst1 = args.getNonOptionArgs();

//        if(lst1.isEmpty()){
//            System.out.println("no non option argument sent");
//        }
//        else {
//            System.out.println("Non-option Args List:"+lst1);
//        }

        if (args.containsOption("theme-mode")) {
            List<String> lst2 = args.getOptionValues("theme-mode");
            if(lst2.contains("dark")){
                System.out.println("dark mode is activated");
            }
            else {
                System.out.println("light mode is activated");





















            }
        }


//        Set<String> set=args.getOptionNames();
//        System.out.println("keys:"+set);

    }
}