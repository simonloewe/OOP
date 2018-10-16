/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw04a01;

/**
 *
 * @author Lion
 */
public class Main {
    
    public static void main(String[] args){
        Motor test = new Motor();
        test.switchOn();
        test.statusAbfrage();
        test.switchOff();
        test.statusAbfrage();
    }
    
}
