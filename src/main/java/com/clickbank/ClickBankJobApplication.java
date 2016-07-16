package com.clickbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class ClickBankJobApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(ClickBankJobApplication.class, args);
//         ##Testing purposes##
//        System.out.println("Lets see the beans! : ");
//
//        String[] beanNames = ctx.getBeanDefinitionNames();
//        Arrays.sort(beanNames);
//        for(String beanName : beanNames){
//            System.out.println(beanName);
//        }
	}
}
