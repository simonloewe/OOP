
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw11a01;

/**
 *
 * @author lion
 */
public class Main {
    public static void main(String[] args){
        TextFileWriter test = new TextFileWriter();
        test.write(100, "Test");
        test.read();
       
    }
}
