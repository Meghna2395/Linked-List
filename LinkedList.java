package com.bridzelabz.linkedlist;

import com.bridzelabz.stack.Stack;

public class LinkedList {
	Node head;

	LinkedList() {
		head = null;
	}

	public void push(int Element) {
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
	
	// To add in betwwen of the list
	public void push(int Element, int position) {     
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

	 
	//Delete first element of the list
	public void pop() {
	    if(this.head != null) {
	      Node temp = this.head;
	      this.head = this.head.next;
	      temp = null;  
	    }
	  }
	
	// To display the content of the list
	public void PrintList() {
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
		
	//Delete last element of the list
	public void popLast() {
			    if(this.head != null) {
			      if(this.head.next == null) {
			        this.head = null;
			      } else {
			        Node temp = new Node();
			        temp = this.head;
			        while(temp.next.next != null)
			          temp = temp.next;
			        Node lastNode = temp.next;
			        temp.next = null; 
			        lastNode = null;
			      }
			    }


	}
}
