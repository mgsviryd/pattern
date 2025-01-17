package com.sviryd.pattern.bridge;

public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Square[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
