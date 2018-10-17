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
public class Main {
    public static void main(String[] args){
        Hg element1 = new Hg(20);
        Pb element2 = new Pb(10);
        N element3= new N(55);
        element1.getTemperaturC();
        element2.getTemperaturC();
        element3.getTemperaturC();
        
        element1.getZustand();
        element2.getZustand();
       
        element2.toString();
        
    }
    
}
