package com.resizable;

import java.util.Scanner;

public class ResizableTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ResizableCircle circle = new ResizableCircle(1.5, "blue", true);
        ResizableRectangle rectangle = new ResizableRectangle(5, 6, "red", true);
        ResizableSquare square = new ResizableSquare(4, "yellow", false);
        Resizable[] resizables = new Resizable[]{circle, rectangle, square};

        System.out.println("Pre-resize: ");
        toString(resizables);

        System.out.println("Enter new size: ");
        int amount = scanner.nextInt();
        for (Resizable resizable : resizables) {
            resizable.resize(amount);
        }

        System.out.println("Post-resize: ");
        toString(resizables);
    }
    public static void toString(Resizable[] resizables) {
        for (Resizable resizable : resizables) {
            System.out.println(resizable);
        }
    }
}

