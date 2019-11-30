package com.spartaglobal.OOP_Shapes;

public abstract class Shapes {
    private String shape;
    private String colour;
    private double areaOfShape;

    public Shapes(String shape, String colour){
        this.colour = colour;
        this.shape = shape;
    }

    public double getArea(){
        return this.areaOfShape;
    }

    public String getShape() {
        return shape;

    }

    public String getColour() {
        return colour;
    }

    public void setArea(double area){
        this.areaOfShape = area;
    }

}
