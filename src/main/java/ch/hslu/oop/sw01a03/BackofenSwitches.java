/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw01a03;

/**
 *
 * @author Lion
 */
public class BackofenSwitches {
    public int temp;
    public boolean eingeschaltet;
    public boolean ausgeschaltet;
    
    public void setTemp(int temp){
        this.temp = temp; 
        System.out.println("Temp:" + temp);
    }
    
    public void turnOn(){
        eingeschaltet = true;
        ausgeschaltet = false;
        System.out.println("Turned On");
    }
    
    public void turnOff(){
        eingeschaltet = false;
        ausgeschaltet = true;
        System.out.println("Turned Off");
    }
}
