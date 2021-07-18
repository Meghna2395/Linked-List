package com.bridzelabz.linkedlist;

import com.bridzelabz.stack.Stack;

public class LinkedList {
	Node head;

	LinkedList() {
		head = null;
	}

	void push(int Element) {
		Node newNode = new Node();
		newNode.data = Element;
		newNode.next = null;
		if (head == null) {
			head = newNode;
		} else {
			Node temp = new Node();
			temp = head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = newNode;
		}
	}

	
	// To display the content of the list
	void PrintList() {
		Node temp = new Node();
		temp = this.head;
		if (temp != null) {
			System.out.print("The list has :");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.println();
		} else {
			System.out.println("The list is empty.");
		}

	}
}
