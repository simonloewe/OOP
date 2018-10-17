/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw06a01;

import ch.hslu.oop.sw03a01.g.*;

/**
 *
 * @author Lion
 */
public class Point {
    public int x;
    public int y;
    public String quadrant;
    
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //kopie des oberen konstruktors. dieser kann andere anweisungen bekommen
    public Point(Point point){
        System.out.println(x + " " + y);
    }
        
    public void getQuadrant(){
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
    
    public void getXandY(){
        System.out.println(x + " " + y);
    }
    
    public void moveRelative(int x, int y){
        x = (this.x + x);
        y = (this.y + y);
        System.out.println(x + " " + y);
    }
    
    public void moveRelative(double x, double y){
    
    }
    
}
