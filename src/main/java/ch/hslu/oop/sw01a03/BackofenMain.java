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
public class BackofenMain {
    
    public static void main(String[] args){
    BackofenDoor door = new BackofenDoor();
    BackofenSwitches schalter = new BackofenSwitches();
    
    door.open();
    door.close();
    
    schalter.setTemp(200);
    schalter.turnOn();
    schalter.turnOff();
    }
}
