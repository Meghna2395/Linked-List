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
	
	
	 void push(int Element, int position) {     
		    Node newNode = new Node(); 
		    newNode.data = Element;
		    newNode.next = null;

		    if(position < 1) {
		      System.out.print("\nposition should be >= 1.");
		    } else if (position == 1) {
		      newNode.next = head;
		      head = newNode;
		    } else {
		      
		      Node temp = new Node();
		      temp = head;
		      for(int i = 1; i < position-1; i++) {
		        if(temp != null) {
		          temp = temp.next;
		        }
		      }
		   
		      if(temp != null) {
		        newNode.next = temp.next;
		        temp.next = newNode;  
		      } else {
		        System.out.print("\nThe previous node is null.");
		      }       
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
