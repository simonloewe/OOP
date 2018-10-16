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
public class Main {
    
    public static void main(String[] args){
        Student student1 = new Student();
        student1.setName("Hans Peter");
        student1.setId(001);
        student1.outCredentials();
    }
    
}
