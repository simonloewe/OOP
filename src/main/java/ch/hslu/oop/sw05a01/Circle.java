/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw05a01;

/**
 *
 * @author lion
 */
public class Circle extends Shape{
    private int diameter;
    
    public Circle(final int x, final int y, final int diameter){
        super(x,y);
        this.diameter = diameter; 
    }
    
    public void setDiameter(int diameter){
        this.diameter = diameter; 
    }
    
    public int getDiameter(){
        return diameter; 
    }
    
    @Override
    public int getPerimeter(){
        return (int) (2*Math.PI*diameter);
    }
    
    public int getArea(){
        return (int) (((diameter/2)*(diameter/2))*Math.PI);
    }
}
