/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p3u2;

public class Subject {
    private Observer observer;
    
    public void setObserver(Observer observer){
        this.observer = observer;
    }
    
    public Subject(Observer observer){
        this.observer = observer;
    }
    
    public Subject(){  
    }
    
    private String state;

    public String getState(){
        return state;
    }    
    
    public void setState(String state){
        this.state = state;
        if(observer != null){
            observer.update();
        }
    }
}
