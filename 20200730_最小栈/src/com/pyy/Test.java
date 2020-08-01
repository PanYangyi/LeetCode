package com.pyy;

public class Test {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
//        minStack.getMin();
        System.out.println("min = "+minStack.getMin());
        minStack.pop();
//        minStack.top();
        System.out.println("after pop get top = "+minStack.top());
        System.out.println("after pop get min = "+minStack.getMin());
//        minStack.getMin();

    }
}
