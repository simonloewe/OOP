/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw08a03;

/**
 *
 * @author lion
 */
public enum Hg {
    SOLID(200){
        public Hg state(){return SOLID;}
    },
    LIQUID(100){
        public Hg state(){return LIQUID;}
    },
    GAS(0){
        public Hg state(){return GAS;}
    };
    
    public int temp;
    
    Hg(int temp){
        this.temp = temp;
    }    
    
    public abstract Hg state();
}
