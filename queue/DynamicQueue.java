package com.harsh.queue;

public class DynamicQueue extends CustomCircularQueue{
    public DynamicQueue() {
        super();
    }
    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int val) {
        if(this.isFull()) {
            int[] temp = new int[data.length*2];
            for(int i = 0; i< (front+i)%data.length; i++) {
                temp[i] = data[i];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
        return super.insert(val);
    }
}
