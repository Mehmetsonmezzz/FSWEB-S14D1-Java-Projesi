package com.workintech;

public class Rectangle {
    private double width;
    private double length;

    private double checkzeros(double value){
        if(value<0){
            return 0;
        }
        return value;
    }

    public Rectangle(double width, double length) {
        this.width = checkzeros(width);
        this.length = checkzeros(length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
       return width*length;
    }
}
