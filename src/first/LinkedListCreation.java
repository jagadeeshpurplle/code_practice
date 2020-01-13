
package first;

import javax.xml.soap.Node;

public class LinkedListCreation {

	Node head;
	
	static class Node {
		 
		int data;
		Node next;
		Node(int d){
			data=d;
			next=null;
		}
		
	}
	
	public void printList() {
		Node n= head;
		while(n!=null) {
			System.out.print(n.data+ " -->" +" ");
			n=n.next;
		}
		System.out.println(n);
	}
	
	public static void main(String args[]) {
		LinkedListCreation ll=new LinkedListCreation();
		ll.head=new Node(1);
		Node second= new Node(2);
		Node third= new Node(3);
		
		
		ll.head.next=second;
		second.next= third;
		
		ll.push(5);
		ll.push(7);
		System.out.println("Inserting at first");
		ll.printList();

		System.out.println("Inserting after "+ll.head.data);
		ll.insertAfter(ll.head, 4);
		ll.printList();
		
		System.out.println("Inserting at end");
		ll.insertAtLast(10);
		ll.printList();
		
		System.out.println("Deleting Node");
		ll.deleteNode(7);
		ll.printList();
	}
	
	public void push(int newData) {
		
		Node new_Node= new Node(newData);
		new_Node.next=head;
		head=new_Node;
		
	}
	public void insertAfter(Node previous, int newData) {
		
		if(previous==null) {
			System.out.println("the given position cannot be null");
			return;
		}
		Node new_Node=new Node(newData);
		new_Node.next=previous.next; //it will assign the new_node of next to previos of next
		previous.next=new_Node;// it will assign previous.next to new_node
		
	}
	public void insertAtLast(int newData) {
		
		Node new_Node= new Node(newData);
		new_Node.next=null; //making the new_node next as null 
		Node last= head; //taking new head as "last" to iterate
		//this will iterate till last of the linked list
		while(last.next!=null) {
			last=last.next; //changing the last node from the head
		}
		last.next=new_Node; //making the last node next to new_node
		return; //return the list
	}
	
	public void deleteNode(int key) {
		
		Node temp=head, prev=null;
		//checking if the node itself holds the key to be deleted
		if(temp!=null && temp.data==key) {
			head=temp.next;
			return;
		}
		//search for the key to be deleted, and whenever it the key found then it should stop the iteration
		//and assign previous.next to temp.next
		while(temp!=null && temp.data!=key) {
			prev=temp;
			temp=temp.next;
		}
		
		if(temp==null) {
			return;
		}
		
		prev.next=temp.next;
		
	}
}

