/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw03a01;

/**
 *
 * @author Lion
 */
public class Demo {
    
    public int a;
    public int b;
    public int c;
    
    //Nur 2
    public void getMax2(final int a, final int b){
        this.a = a;
        this.b = b;
        
        if(a < b){
            System.out.println("b: " + b);
        }else{System.out.println("a: " + a);}
    }
    
    public void getMin2(final int a, final int b){
        this.a = a;
        this.b = b;
        
        if(a > b){
            System.out.println("b: " + b);
        }else{System.out.println("a: " + a);}
    }
    
    //Ab hier 3
    public void getMax3(final int a, final int b, final int c){
        this.a = a;
        this.b = b;
        this.c = c;
        
        if(a < b){
            if(b < c){
                System.out.println("c: " + c);
            }else{System.out.println("b: " + b);}
        }else{System.out.println("a: " + a);}
    }
   
}
