package com.harsh.linkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(3);
//        list.insertFirst(4);
//        list.insertFirst(7);
//        list.insertFirst(11);
//        list.insertLast(34);
//        list.insertLast(45);
//        list.insertFirst(1);
//        list.insert(5, 2);
//        list.display();
//
//        System.out.println(list.deleteFirst());
//        list.display();
//
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println(list.deleteLast());
//        list.display();
//
//        System.out.println(list.delete(3));
//        list.display();


//        DLL newList = new DLL();
//        newList.insertFirst(4);
//        newList.insertFirst(6);
//        newList.insertFirst(9);
//        newList.insertFirst(13);
//        newList.insertLast(30);
//        newList.insertLast(99);
//        newList.insert(100, 2);
//        newList.display();

        CLL list = new CLL();
        list.insert(4);
        list.insert(5);
        list.insert(14);
        list.insert(58);
        list.insert(89);
        list.display();

        list.delete(58);
        list.display();


    }
}
