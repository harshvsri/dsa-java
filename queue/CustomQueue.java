package com.harsh.queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int val) {
        if(isFull()) {
            return false;
        }
//        data[end++] = val;   It can be also written as this.
        data[end] = val;
        end++;
        return true;
    }

    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is empty.");
        }
        for(int i=1; i< data.length; i++) {
            data[i-1] = data[i];
        }
        end--;
        return data[0];
    }


    private boolean isFull() {
        return end == data.length;
    }
    private boolean isEmpty() {
        return end == 0;
    }
}
