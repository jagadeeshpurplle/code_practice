package first;

public class LinkedListPractise {

	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
		
	}
	
	 void print() {
		 Node n = head;
		 while(n!=null) {
			 System.out.print(n.data+" ->"+ " ");
			 n= n.next;
		 }
		 System.out.println();
	 }
	
	
	public static void main(String args[]) {
		
		LinkedListPractise ll = new LinkedListPractise();
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
			
		ll.head.next= second;
		second.next = third;
		
		ll.insertAtFirst(5);
		ll.print();
		ll.insertAtLast(10);
		ll.print();
	}
	
	
	void insertAtFirst(int val) {
		Node new_node = new Node(val);
		new_node.next = head;
		head = new_node;
		
	}
	
	void insertAtLast(int val) {
		Node new_node = new Node(val);
		new_node.next = null;
		Node last = head;
		while(last.next != null) {
			last = last.next;
		}
		last.next = new_node;
		return;
		
	}
	
	
	
}
