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
    public String getZustand() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTemperaturC(double temperaturC) {
        this.temperaturC = temperaturC;
    }
    
}
