/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p3u2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext(new String[]{"constructorBasedDependencyInjection.xml"});
        Subject subject = context.getBean("mySubject", Subject.class);
        subject.setState("Kakavko from Main");
    }
}
