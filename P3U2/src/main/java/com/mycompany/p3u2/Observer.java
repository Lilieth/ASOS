/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p3u2;

public class Observer {
    private Subject subject;
    
    public void setSubject(Subject subject){
        this.subject = subject;        
    }
    
    public Observer(Subject subject){
        this.subject = subject;        
    }
    
    public Observer(){        
    }
    
    public void update(){
        System.out.println("New Subject state: " + subject.getState() + ".");
    }
}
