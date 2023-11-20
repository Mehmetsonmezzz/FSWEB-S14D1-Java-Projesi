package com.workintech;

public class Cylinder extends Circle{

    private double height;


    private double checkHeight(double height){
        if(height<0){
            return 0;
        }
        return height;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height=checkHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return  height*getArea();
    }
}
