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
public class TemperaturVerlauf{

    public int index;
    public int temp;
    public int maxTemp;
    public int minTemp;
    public int size;
    public float average;
    
    ArrayList<Integer> TemperaturVerlauf = new ArrayList<>();
    
    public void addTemperatur(int temperatur) {
        TemperaturVerlauf.add(temperatur);
    }

    public int getSize() {
        size = TemperaturVerlauf.size();
        return size;
    }

    public void clear() {
        //removes all elements from list temperaturVerlauf 

        //could also check with 2end list and remove only duplicates found in second list
        //removes all elements from temp2 if found in temp1
        /**
         * TemperaturVerlauf2.removeAll(TemperaturVerlauf);
         */
        TemperaturVerlauf.removeAll(TemperaturVerlauf);
        getSize();
    }

    public int getMaxValue() {
        for (int i = 0; i < TemperaturVerlauf.size(); i++) {
            temp = TemperaturVerlauf.get(i);
            if (temp > maxTemp) {
                maxTemp = temp;
            } else {
            }
        }
        temp = 0;
        return maxTemp;
    }

    public int getMinValue() {
        //minTemp muss erst ein Wert zugewiesen werden der mit sicherheit groesser ist als der kleinste wert im array
        minTemp = getMaxValue();
        for (int i = 0; i < TemperaturVerlauf.size(); i++) {
            temp = TemperaturVerlauf.get(i);
            //sonst wird auf dieser ebene der wert get(0) mit null verglichen
            if (temp < minTemp) {
                minTemp = temp;
            } else {
            }
        }
        temp = 0;
        return minTemp;
    }
    
    public double getAverage(){
        temp = 0;
        for(int i = 0; i < TemperaturVerlauf.size(); i++){
            temp = temp+TemperaturVerlauf.get(i);
        }
        average = (float)(temp/getSize());
        return (float)average;
    }
    
    public void printShit(){
        System.out.println("Max Value: " + getMaxValue());
        System.out.println("Min Value: " + getMinValue());
        System.out.println("Size: " + getSize());
        System.out.println("Average: " + getAverage());
    }
}
