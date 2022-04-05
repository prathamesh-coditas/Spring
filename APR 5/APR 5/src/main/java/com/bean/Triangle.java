package com.bean;

public class Triangle {
    private float h,b;
    private String name;

    public float getH() {
        return h;
    }

    public void setH(float h) {
        this.h = h;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Triangle[" + "Height=" + h +
                ", Breadth=" + b +
                ", Name of triangle='" + name + '\'' + ", Area of Triangle is="+h*h*0.4330127019+']';
    }
}
