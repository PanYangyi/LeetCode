package com.pyy;

import java.util.Stack;

/**
 * 最小栈
 *      原始栈 保存原始数据
 *      辅助栈 与每一个栈元素同步当时的 min
 */
public class MinStack {
    // 原始栈
    Stack<Integer> originStack;

    // 辅助栈
    Stack<Integer> helperStack;

    /**
     * init stack
     */
    public MinStack() {
        originStack = new Stack<>();
        helperStack = new Stack<>();
    }

    public void push(int x) {
        // 入栈放入原始数据
        originStack.add(x);
        // 同步辅助栈的最小值
        if (helperStack.isEmpty() || helperStack.peek() >= x) {
            helperStack.add(x);
        } else {
            helperStack.add(helperStack.peek());
        }
    }

    public void pop() {
        if (!originStack.isEmpty()) {
            originStack.pop();
            helperStack.pop();
        }
    }

    public Integer top() {
        if (!originStack.isEmpty()) {
            return originStack.peek();
        }
        throw new RuntimeException("栈中元素为空");
    }

    public Integer getMin() {
        if (!helperStack.isEmpty()) {
            return helperStack.peek();
        }
        throw new RuntimeException("栈中元素为空");
    }

}
