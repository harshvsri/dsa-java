package com.harsh.oop;

public class Main {
    public static void main(String[] args) {
        Box box0 = new Box(2,4,6);
        Box box1 = new Box(box0);
        System.out.println(box1.length+"  "+box1.breadth+"  "+box1.height);
    }
}
