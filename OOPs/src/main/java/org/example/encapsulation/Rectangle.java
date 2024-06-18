package org.example.encapsulation;

public class Rectangle {
    // write the code of rectangle class here
    private int height;
    private int width;
    private Point topLeft;

    int getArea() {
        return height*width;
    }

    int getPerimeter() {
        return 2*(height+width);
    }

    Point getBottomRight() {
        int x=topLeft.x+width;
        int y=topLeft.x-height;
        Point bottomRight=new Point(x,y);
        return bottomRight;
    }
}