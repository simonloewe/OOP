/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw06a012;

import ch.hslu.oop.sw05a01.*;

/**
 *
 * @author lion
 */
public abstract class Shape {
    private int x;
    private int y;
    
    Shape shape1 = new Circle(1,1,1); 
    Shape shape2 = new Rectangle(1,1,1,1);
    
    
            
    protected Shape(final int x, final int y){
        this.x = x;
        this.y = y;
        
        //über variable shape1 wird nun eine methode aufgerufen
        shape1.move(1, 1);
        //downcasted muss ihm sagen was shape1 ist damit wir die methoden brauchen können
        ((Circle) shape1).getDiameter();
    }
    
    public void move(int newX, int newY){
        x = newX;
        y = newY;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public abstract int getPerimeter();
    
}
