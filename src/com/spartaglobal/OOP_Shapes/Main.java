package com.spartaglobal.OOP_Shapes;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle("Circle","Green", 23);

        circle.setArea(23);
        System.out.println(circle.getArea());
        System.out.println(circle.getColour());
        System.out.println(circle.getShape());

    }



}
