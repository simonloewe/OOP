/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw07a02;

import ch.hslu.oop.sw07a011.*;
import ch.hslu.oop.sw06a01.*;
import ch.hslu.oop.sw03a01.g.*;
import java.util.Objects;

/**
 *
 * @author Lion
 */
public class Point implements Comparable {

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
   
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    

    @Override
    public int compareTo(Object temp) {
        Point other = (Point) temp;
        
        if(getX() > other.getX()){
            return 1;
        }
        else if(getX() < other.getX()){
            return -1;
        }
        else{
            return 0; 
        }
    }
    
    
}
