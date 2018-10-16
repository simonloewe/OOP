/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw02a01;

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
    
}
