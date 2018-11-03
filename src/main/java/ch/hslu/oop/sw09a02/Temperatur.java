/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw09a02;

import ch.hslu.oop.sw03a01.d.*;
import ch.hslu.oop.sw02a01.*;

/**
 *
 * @author Lion
 */
public class Temperatur {
        
    public double tCel = 20;
    public double tKelv;
    public double tFar;
    public double changeT;
    public double convCtoK = 273.15;
    private double tempValue;
    
    public String zustand;
    
    public String element; 
    
    
    
    //Set Methoden
    public void setTCel(double tempCel){
        this.tCel = tempCel; 
    }

    //Get Methoden
    public void getValues(){
        tKelv = (tCel + convCtoK);
        tFar = (tCel * 1.8d);
        System.out.println("C " + tCel);
        System.out.println("K " + tKelv);
        System.out.println("F " + tFar);
    }
    
    //Verändern der bereits vorhandenen
    public void changeTWithCel(double changeT){
        tempValue = tCel;
        tCel = (tempValue + changeT);
    }
    
    public void changeTWithFar(double changeT){
        tempValue = tCel;
        tCel = (((tempValue * 1.8) + (1.8 * changeT))/1.8);
    }
    
    //die if wird nicht durchgegangen solange das statement nicht stimmt
    public void getState(String element){
        switch(element){
            case "Pb": 
                //wenn temp kleiner als gastemp gehe in schleife, sonst gas
                if(tCel < 1749d){
                    //wenn temp kleiner als schmelz dann gleich fest sonst flüssig
                    if(tCel < 327.5d){zustand = "fest";}
                    else{zustand = "fluessig";}
                }else{zustand = "gas";}
                System.out.println(element + " | " + zustand);
                break;
                
            case "N":
                if(tCel < -195.8d){
                    if(tCel < -210d){zustand = "fest";}
                    else{zustand = "fluessig";}
                }else{zustand = "gas";}
                System.out.println(element + " | " + zustand);
                break;
                
            case "Hg":
                if(tCel < 357d){
                    if(tCel < -38.83d){zustand = "fest";}
                    else{zustand = "fluessig";}
                }else{zustand = "gas";}
                System.out.println(element + " | " + zustand);
                break;
                
            default:
                System.out.println("Nicht in DB");
                break;
        }
    }
    
}
