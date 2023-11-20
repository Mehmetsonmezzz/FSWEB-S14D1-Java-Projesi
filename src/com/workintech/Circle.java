package com.workintech;

public class Circle {


    private double radius;

    private double checkZero(double radius){
        return  radius < 0 ? 0 : radius;
    }

    public Circle(double radius) {
        this.radius = checkZero(radius);
    }

    public double getRadius() {
        return radius;
    }


    public double getArea(){
        return radius* radius*Math.PI;
    }
}

