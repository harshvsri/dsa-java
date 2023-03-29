package com.harsh.queue;

public class QueueMain {
    public static void main(String[] args) {
        CustomCircularQueue queue = new CustomCircularQueue(5);

        queue.insert(3);
        queue.insert(5);
        queue.insert(7);
        queue.insert(11);
        queue.insert(67);

        queue.display();
    }
}
