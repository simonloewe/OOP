/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw03a02;

/**
 *
 * @author Lion
 */
public class DemoMain {
    public static void main(String[] args){
        Demo test = new Demo();
        
        test.cToTenWithFor();
        test.cToTenWithDo();
        test.cToTenWithWhile();
        
        test.addtitionFloatWithWile();
        
        test.printBox(4, 6);
    }
}
