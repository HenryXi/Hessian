package com.henry.xi.hessian.client;

import com.henry.xi.hessian.MathService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by admin on 2016/1/27.
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-hessian-client.xml");
        MathService mathService = (MathService) context.getBean("hessianService");
        System.out.println(mathService.add(1, 2));
    }
}
