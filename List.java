package com.bridzelabz.linkedlist;

public class List{ 
	  public static void main(String[] args) {
	    LinkedList List = new LinkedList();

	    //Add four elements in the list.
	    List.push(56);
	    List.push(30);
	    List.push(40);
	    List.push(70);
	    List.PrintList(); 
	    
	    
	    List.pop_all(40);;
	    List.PrintList();  

	  }
	}
