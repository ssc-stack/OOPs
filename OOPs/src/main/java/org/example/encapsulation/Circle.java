package org.example.encapsulation;

public class Circle {
    // write the code of circle class here
    Point center;
    int radius;

    double getArea() {
        return Math.PI*radius*radius;
    }

    double getParameter() {
        return 2*Math.PI*radius;
    }

    boolean isOverlapping(Circle c) {
        int x1=center.x;
        int y1=center.y;
        int x2=c.center.x;
        int y2=c.center.y;
        int r1=radius;
        int r2=c.radius;

        double d=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));

        if(d<=Math.abs(r1-r2) || d<=r1+r2) return true;
        return false;
    }
}
