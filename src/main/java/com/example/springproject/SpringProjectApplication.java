package com.example.springproject;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringProjectApplication {

    public static void main(String[] args) {

        //SpringApplication.run(SpringProjectApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        Student student = (Student) context.getBean("student1");
        Student student1 = (Student) context.getBean("student2");
        System.out.println(student);


    }

}
