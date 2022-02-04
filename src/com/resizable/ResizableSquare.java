package com.resizable;

public class ResizableSquare extends Square implements Resizable, AutoResizable{
    public ResizableSquare() {
    }

    public ResizableSquare(double side) {
        super(side);
    }

    public ResizableSquare(double side,String color, boolean filled) {
        super(color, filled, side);
    }

    @Override
    public void resize(int amount) {
        int percent = amount / 100;
        setSide(getSide() * percent);
    }

    @Override
    public void autoResize(double percent) {
        setSide(getSide() * percent);
    }
}
