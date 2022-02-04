package com.resizable;

public class ResizableCircle extends Circle implements Resizable, AutoResizable{
    public ResizableCircle() {
    }

    public ResizableCircle(double radius) {
        super(radius);
    }

    public ResizableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public void resize(int amount) {
        int percent = amount / 100;
        setRadius(getRadius() * percent);
    }

    @Override
    public void autoResize(double percent) {
        setRadius(getRadius() * percent);
    }
}
