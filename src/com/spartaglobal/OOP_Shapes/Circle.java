package com.spartaglobal.OOP_Shapes;

public class Circle extends Shapes {
   private double radius;


    public Circle(String shape, String colour, double radius) {
        super(shape, colour);
        this.radius = radius;
    }

    @Override
    public void setArea(double area) {
         super.setArea(Math.PI * Math.pow(radius,2));
    }

}
