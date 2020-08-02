package com.pyy;

/**
 * 测试用例
 * ["MyQueue","push","push","peek","pop","empty"]
 * [[],[1],[2],[],[],[]]
 * <p>
 * 预期结果
 * [null,null,null,1,1,false]
 */
public class Test {
    public static void main2(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.empty());
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        System.out.println(myQueue.empty());
    }
}
