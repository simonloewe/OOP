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
public class BackofenDoor {
    public boolean offen;
    public boolean geschlossen;
    
    public void open(){
        offen = true;
        geschlossen = false;
        if(offen = true){
            geschlossen = false;
        }
        if(geschlossen = true){
            offen = false; 
        }
        System.out.println("Door Open");
    }
    
    public void close(){
        offen = false;
        geschlossen = true;
        if(offen = true){
            geschlossen = false;
        }
        if(geschlossen = true){
            offen = false; 
        }
        System.out.println("Door Closed");
    }
    
}
