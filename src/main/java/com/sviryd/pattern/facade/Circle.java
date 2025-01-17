package com.sviryd.pattern.facade;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
