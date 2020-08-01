package com.pyy;

public class Test {
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        System.out.println("answer :"+cQueue.deleteHead());
        System.out.println("answer :"+cQueue.deleteHead());
    }
}
