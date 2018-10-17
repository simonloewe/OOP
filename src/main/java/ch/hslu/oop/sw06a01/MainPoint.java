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
public class MainPoint {
    public static void main(String[] args){
        Point test = new Point(5,1);
        
        test.getQuadrant();
        test.getXandY();
        test.moveRelative(5, 5);
    }
}
