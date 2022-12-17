package com.spesce.rpn;

import java.util.Arrays;

public class Stack {
    private com.spesce.rpn.Node top;
    private int size;

    public Stack() {
        size = 0;
    }

    public Stack(double[] dataArray){
        Arrays.stream(dataArray).forEach(data -> push(data));
        size = dataArray.length;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }
    //add int to top of stack
    public void push(double data){
        if(top == null)
            top = new com.spesce.rpn.Node(data);
        else
        {
            com.spesce.rpn.Node current = new com.spesce.rpn.Node(data,top);
            top = current;
        }
        size++;
    }
    //get data from top, but dont remove it
    public double peekTop() {
        return top.getData();
    }
    //remove and get data from top of stack
    public double pop() {
        final double data = top.getData();
        top = top.getNext();
        size--;
        return data;
    }
    //print stack to console, point at top element
    public void print() {
        if(top == null)
            System.out.println("The stack is empty");

        com.spesce.rpn.Node current = top;
        System.out.println(current.getData() + " <--");
        current = current.getNext();

        while(current != null)
        {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }
}
