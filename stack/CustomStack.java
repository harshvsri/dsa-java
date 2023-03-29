package com.harsh.stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int val) {
        if(isFull()) {
            System.out.println("Stack Overflow.");
            return false;
        }

        ptr++;
        data[ptr] = val;
        return true;
    }

    public int pop() throws Exception {
        if(isEmpty()) {
            throw new Exception("Cant pop from empty stack.");
        }
//        int removed =  data[ptr];
//        ptr--;
//        return removed;
        return data[ptr--];
    }
    public int peek() throws Exception {
        if(isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return data[ptr];
    }

    private boolean isFull() {
        return ptr == data.length-1;
    }
    private boolean isEmpty() {
        return ptr == -1;
    }
}
