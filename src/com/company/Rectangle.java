package com.company;

public class Rectangle {
    double height, width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Rectangle{" +
                "height=" + height +
                ",\nwidth=" + width +
                ",\nperimeter= " + this.getPerimeter() +
                ",\narea = " + this.getArea() +
                '}';
    }
}
