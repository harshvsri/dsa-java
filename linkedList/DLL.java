package com.harsh.linkedList;

public class DLL {

    Node head;

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public void display() {
        Node temp = head;
        Node last = null;
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Reverse Order");
        while(last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val) {
        if(head == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        node.next = null;
        node.prev = temp;
        temp.next = node;
    }

    public void insert(int val, int index) {
        Node temp = get(index-1);
        Node node = new Node(val);
        node.next = temp.next;
        temp.next.prev = node;
        node.prev = temp;
        temp.next = node;
    }

    public Node get(int index) {
        Node node = head;
        for(int i=0; i<index; i++) {
            node = node.next;
        }
        return node;
    }
}
