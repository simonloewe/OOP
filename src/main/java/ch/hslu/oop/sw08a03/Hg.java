/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw08a03;

/**
 *
 * @author lion
 */
public enum Hg {
    SOLID, LIQUID, GAS; 
    
    int temperatur;
    
    public int getTemperatur(int temperatur){
        this.temperatur = temperatur; 
        return temperatur;
    }
    
   
}
