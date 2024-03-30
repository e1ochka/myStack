package org.example;

public class myStack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public myStack(int size) {
        this.maxSize = size;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long j) {
        stackArray[++top] = j;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}