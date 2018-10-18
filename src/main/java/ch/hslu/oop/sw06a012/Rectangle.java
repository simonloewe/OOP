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
public class Rectangle extends Shape {

    private int width;
    private int height;

    public Rectangle(final int x, final int y, final int width, final int height) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    @Override
    public int getPerimeter() {
        return (2 * this.height) + (2 * this.width);
    }

    public void changeDimensions(int newWidth, int newHeight) {
        width = newWidth;
        height = newHeight;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getArea() {
        return width * height;
    }
}
