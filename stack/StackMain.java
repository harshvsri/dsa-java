package com.harsh.stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);
        stack.push(5);
        stack.push(27);
        stack.push(26);
        stack.push(35);
        stack.push(18);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        stack.push(8);
    }
}
