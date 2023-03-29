package com.harsh.oop;

public class Box {
    double length;
    double breadth;
    double height;

    Box() {
        this.length = 0;
        this.breadth = 0;
        this.height = 0;
    }

    Box(double side) {
        this.length = side;
        this.breadth = side;
        this.height = side;
    }

    Box(double lenght, double breadth, double height) {
        this.length = lenght;
        this.breadth = breadth;
        this.height = height;
    }

    Box(Box old) {
        this.length = old.length;
        this.breadth = old.breadth;
        this.height = old.height;
    }


}
