package com.adt.template.providerTest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Main2 {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        /**
         * <import resource="classpath*:spring/spring-config-dao.xml" />
         <import resource="classpath*:spring/spring-config-dataSource.xml" />
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
                                                                                                   "classpath*:spring/spring-config-dao.xml",
                                                                                                   "classpath*:spring/spring-config-dataSource.xml",
                                                                                                   "classpath:spring-dubbo.xml" });
        context.start();
        System.out.println("Provider service register successful.");
        try {
            System.in.read();// keep running
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
