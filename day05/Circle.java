package com.homework.day05;

public class Circle  extends BaseGraph {
    private final double r;
    public Circle(double r){
        super();
        this.r = r;
    }

    public double getCircumference() {
        return 2 * r * Math.PI;
    }
}
