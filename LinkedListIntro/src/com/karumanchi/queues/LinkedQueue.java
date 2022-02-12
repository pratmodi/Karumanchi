package com.karumanchi.queues;

import com.karumanchi.intro.ListNode;

public class LinkedQueue {

	private int length;
	private ListNode front,rear;
	
//Creates an empty queue..
	public LinkedQueue() {
		front=rear=null;
		length=0;
	}
	
//Adds the specified data to the rear of the queue..
	public void enQueue(int data) {
		ListNode node = new ListNode(data);
		if(length==0) 
			front=node;
		else
			rear.setNext(node);
		rear = node;
		length++;
	}
	
	
//Removes the data from the front of the queue and returns a reference to it
	public int deQueue() throws Exception {
		if(length==0)
			throw new Exception("Queue is empty!");
		int result = front.getData();
		front = front.getNext();
		length--;
		if(length==0)
			rear = null; 		//WHY?
		return result;
	}
	
//Returns a reference to the data at the front of the queue
	public int first() throws Exception {
		if(length==0)
			throw new Exception("Queue is empty!");
		return front.getData();
	}
	
//Returns true if this queue is empty and false otherwise..
	public boolean isEmpty() {
		return (length==0);
	}
	
//Returns the number of elements in the queue..
	public int size() {
		return length;
	}
	
//Returns a string representation of this queue..
	public String toString() {
		String result = "";
		ListNode current = front;
		while(current!=null) {
			result += current.toString() +"\n";
			current = current.getNext();
		}
		return result;
	}
}
