/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw08a02;

import java.util.*;

/**
 *
 * @author simon.loewe
 */
public class TemperaturVerlauf {

    ArrayList<Integer> TemperaturVerlauf = new ArrayList<>();

    public void addTemperatur(int temperatur) {
        TemperaturVerlauf.add(temperatur);
    }

    public void getInhalt() {
        for (int i = 0; i < TemperaturVerlauf.size(); i++) {
            TemperaturVerlauf.get(i);
            System.out.println(TemperaturVerlauf.get(i));
        }
    }
    
    public void clear(){
        for(int j = 0 ; j < TemperaturVerlauf.size(); j++){
            TemperaturVerlauf.remove(j);
            getInhalt();
        }
    }
}
