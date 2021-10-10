/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.springhelloworld;

import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

/**
 *
 * @author edu
 */
@Configuration
public class Main {
    // musi sa volat tak isto ako konkretna instancia dole
    @Bean(name="helloBean")
    public HelloComponent helloFactory(){
        return new HelloComponent();
    }
 
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        HelloComponent hc = context.getBean("helloBean", HelloComponent.class);
        System.out.println("----------------------------------");
        hc.sayhello();
        
        System.out.println("----------------------------------");
        // vypise vsetky komponenty ktore ma aplikacia
        String[] beanNames = context.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String beanName : beanNames){
            System.out.println(beanName);
        }
    }    
}
