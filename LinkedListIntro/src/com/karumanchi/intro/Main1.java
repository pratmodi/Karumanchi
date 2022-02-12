package com.karumanchi.intro;

public class Main1 {

	public static void main(String[] args) {
		ListNode ln = new ListNode(4561245);
		System.out.println(ListLength(ln));
	}

	public static int ListLength(ListNode headNode) {
		int length = 0;
		ListNode currentNode = headNode;
		while (currentNode != null) {
			length++;
			currentNode = currentNode.getNext();
		}
		return length;
	}

}
