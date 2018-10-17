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
public class Hg extends Element {
    
    public Hg(double temperaturC){
        /** sucht in der oberklasse nach einem Konstruktor mit einem double Parameter*/ 
        super(temperaturC);
    }

    @Override
    public void setTemperaturC(double temperaturC) {
        this.temperaturC = temperaturC; 
    }
    
    @Override
    public double getTemperaturC() {
        System.out.println(temperaturC);
        return temperaturC;
    }

    @Override
    public void getZustand() {
        if(temperaturC < 357d){
                    if(temperaturC < -38.83d){zustand = "fest";}
                    else{zustand = "fluessig";}
                }else{zustand = "gas";}
                System.out.println("Hg" + " | " + zustand);
    }


 
    
}
