/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw07a01;

/**
 *
 * @author lion
 */
public class Main {

    public static void main(String[] args){
        Person test = new Person(15,"name","surname");
        Person test2 = new Person(15,"name","surname");
        test.equals(test2);
        System.out.println(new Person(15,"name","surname"));
    }
    
}
