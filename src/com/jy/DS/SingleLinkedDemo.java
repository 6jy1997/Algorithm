package com.jy.DS;

/**
 * @description:
 * @author: Andy
 * @time: 2021/3/17 19:52
 */
public class SingleLinkedDemo {
}


class SingleLinedList{
    private Node headNode;
    private int Size;

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */



    public void add(Node node){
        Node temp = headNode;
        while(true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }

    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {

    }





}

class Node{
    private int val;
    public Node next;

    public Node(int val){
        this.val = val;

    }

}