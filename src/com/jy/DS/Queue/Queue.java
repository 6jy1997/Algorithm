package com.jy.DS.Queue;

import java.util.LinkedList;

/**
 * @description:
 * @author: Andy
 * @time: 2021/3/20 14:38
 */
public class Queue {
    protected LinkedList list;
    public Queue(){
        list = new LinkedList();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }

    public void enqueue(Object obj){
        list.addLast(obj);
    }

    public Object dequeue(){
        return list.removeFirst();
    }
    public Object front(){
        return list.getFirst();
    }
}
