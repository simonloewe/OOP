/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw08a02;

/**
 *
 * @author simon.loewe
 */
public class TemperaturVerlaufMain {
    public static void main(String[] args){
        TemperaturVerlauf test = new TemperaturVerlauf();
        test.addTemperatur(4);
        test.addTemperatur(11);
        test.getInhalt();
        test.clear();
    }
}
