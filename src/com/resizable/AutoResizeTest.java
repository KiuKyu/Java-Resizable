package com.resizable;

public class AutoResizeTest {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(1.5, "blue", true);
        ResizableRectangle rectangle = new ResizableRectangle(5, 6, "red", true);
        ResizableSquare square = new ResizableSquare(4, "yellow", false);
        AutoResizable[] autoResizables = new AutoResizable[]{circle, rectangle, square};
        // Pre resize
        System.out.println("Pre-resize: ");
        toString(autoResizables);
        // Auto resize
        System.out.println("Auto-resize: ");
        for (AutoResizable autoResizable : autoResizables) {
            double amount = 100 + (int) (Math.random() * 100);
            double percent = amount / 100;
            autoResizable.autoResize(percent);
        }
        toString(autoResizables);
    }
    public static void toString(AutoResizable[] autoResizables) {
        for (AutoResizable autoResizable : autoResizables) {
            System.out.println(autoResizable);
        }
    }
}
