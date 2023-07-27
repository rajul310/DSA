package com.core;

public class Stack {
	public static Node head = null;

	public  void push(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		newNode.next = head;
		head = newNode;
	}

	public  boolean isEmpty() {
		return head == null;
	}

	public int pop() {
		
		 if(isEmpty()) {
             return -1;
             }
		
		Node top = head;
		head = head.next;
		return top.data;
	}
	

    public int peek() {
        if(isEmpty()) {
            return -1;
        }
        Node top = head;
        return top.data;
    }
}

	


