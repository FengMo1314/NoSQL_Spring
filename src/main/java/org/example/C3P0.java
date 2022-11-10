package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class C3P0 {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("c3p0-config.xml");
        DataSource dataSource = (DataSource) ctx.getBean("dataSource");
        System.out.println(dataSource);
    }
}
