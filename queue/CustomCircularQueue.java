package com.harsh.queue;

public class CustomCircularQueue {
    public int[] data;
    private static final int DEFAULT_SIZE = 10;

    public int front = 0;
    public int end = 0;
    private int size = 0;

    public CustomCircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomCircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int val) {
        if(isFull()) {
            return false;
        }
        data[end++] = val;
        end = end% data.length;
        size++;
        return true;
    }

    public int removed() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
        }
        front = front% data.length;
        size--;
        return data[front++];
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i = i% data.length;
        } while (i != end);
        System.out.println("FRONT");
    }


}
