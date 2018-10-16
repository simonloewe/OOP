/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw01a02;

/**
 *
 * @author Lion
 */
public class Student {
    
    public String name;
    public int id;
    
    public void setName(String name){
        this.name = name; 
    }
    
    public void setId(int id){
        this.id = id; 
    }
    
    public void outCredentials(){
        System.out.println("Name: " + name + " ID: " + id);
    }
}
