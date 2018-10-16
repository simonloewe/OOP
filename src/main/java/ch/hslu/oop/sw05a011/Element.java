/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw05a011;

/**
 *
 * @author lion
 */
public abstract class Element {
    
    protected double temperaturC; 
    String zustand;  
    
    //Konstruktor mit einem double Parameter
    public Element(double temperaturC){
        this.temperaturC = temperaturC;
    }
    
    public abstract void setTemperaturC(double temperaturC);
    
    public abstract double getTemperaturC();
    
    public abstract String getZustand(); 
    
}
