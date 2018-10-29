/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw07a011;

import ch.hslu.oop.sw06a01.*;
import ch.hslu.oop.sw03a01.g.*;

/**
 *
 * @author Lion
 */
public class MainPoint {

    public static void main(String[] args) {
        Point test = new Point(5, 1);
        Point test1 = new Point(51, 1);

        test.getQuadrant();
        test.getXandY();
        test.moveRelative(5, 5);

        System.out.println(test.equals(test1));
        System.out.println(test.hashCode());
        System.out.println(test1.hashCode());
        
        test.equals(test1);
    }
}
