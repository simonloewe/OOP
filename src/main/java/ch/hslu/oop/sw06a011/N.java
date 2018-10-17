/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw06a011;

import ch.hslu.oop.sw05a011.*;

/**
 *
 * @author lion
 */
public class N extends Element {

    public N(double temperaturC) {
        super(temperaturC);
    }

    @Override
    public double getTemperaturC() {
        System.out.println(temperaturC);
        return temperaturC;
    }

    @Override
    public void setTemperaturC(double temperaturC) {
        this.temperaturC = temperaturC;
    }

    @Override
    public void getZustand() {
        if(temperaturC < -195.8d){
                    if(temperaturC < -210d){zustand = "fest";}
                    else{zustand = "fluessig";}
                }else{zustand = "gas";}
                System.out.println("N" + " | " + zustand);
    }

}
