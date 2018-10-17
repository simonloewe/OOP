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
public class Pb extends Element {

    public Pb(double temperaturC) {
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
        //wenn temp kleiner als gastemp gehe in schleife, sonst gas
                if(temperaturC < 1749d){
                    //wenn temp kleiner als schmelz dann gleich fest sonst flüssig
                    if(temperaturC < 327.5d){zustand = "fest";}
                    else{zustand = "fluessig";}
                }else{zustand = "gas";}
                System.out.println("Pb" +  " | " + zustand);
    }

}
