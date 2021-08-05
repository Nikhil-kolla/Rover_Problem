package org.javaexercises.exercise2;
public class Rectangle {

    private final int breadth;
    private final int height;


    public Rectangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }

    public int calculateArea() {

        return (breadth * height);

    }

}
