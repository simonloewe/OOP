/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw02a01;

/**
 *
 * @author Lion
 */
public class Main {
    public static void main(String[] args){
        Temperatur temp1 = new Temperatur();
        
        temp1.getValues();
        
        temp1.changeTWithCel(20);
        temp1.getValues();
        
        temp1.changeTWithFar(-10);
        temp1.getValues();
    }
}
