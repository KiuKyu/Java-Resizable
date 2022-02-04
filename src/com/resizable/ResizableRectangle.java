package com.resizable;

public class ResizableRectangle extends Rectangle implements Resizable, AutoResizable{
    public ResizableRectangle() {
    }

    public ResizableRectangle(double width, double length) {
        super(width, length);
    }

    public ResizableRectangle(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }

    @Override
    public void resize(int amount) {
        int percent = amount / 100;
        setWidth(getWidth() * percent);
        setLength(getLength() * percent);
    }

    @Override
    public void autoResize(double percent) {
        setWidth(getWidth() * percent);
        setLength(getLength() * percent);
    }
}
