/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.p1u2;

// povodna verzia, bezi do nekonecna, treba zmena -> DataSourceMock
// aby mohli naraz existovat vytorime interface -> DataSourceInterface
public class DataSource implements DataSourceInterface{
    public String getData(){
        return "halp I dont wanna do this!";
    }   
}