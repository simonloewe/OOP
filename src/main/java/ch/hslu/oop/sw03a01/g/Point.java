/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw03a01.g;

/**
 *
 * @author Lion
 */
public class Point {
    public int x;
    public int y;
    public String quadrant;
        
    public void getAndSetQuadrant(int x, int y){
        this.x = x;
        this.y = y; 
        
        if(x > 0){
            if(y > 0){
                quadrant = "Oberes rechtes";
            }else{quadrant = "Unteres rechtes";}
        }
        if(x < 0){
            if(y > 0){
                quadrant = "Oberes linkes";
            }else{quadrant = "Unteres linkes";}
        }
        if(x == 0){
            if(y > 0){
                quadrant = "Obere Hälfte mit x auf 0";
            }else{quadrant = "Untere Hälfte mit x auf 0";}
        }
        if(y == 0){
            if(x > 0){
                quadrant = "Rechte Seite mit y auf 0";
            }else{quadrant = "Linke Seite mit y auf 0";}
        }
        if(y == 0 && x == 0){
            quadrant = "Beide auf Wert 0";
        }
        
        System.out.println(quadrant);
    }
    
}
