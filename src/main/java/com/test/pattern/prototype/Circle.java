package com.test.pattern.prototype;

public class Circle extends Shape {

    public Circle(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
