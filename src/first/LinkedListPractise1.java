package first;

public class LinkedListPractise1 {

	Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}

	}

	public void print() {

		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LinkedListPractise1 ll = new LinkedListPractise1();
		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(4);
		ll.head.next = second;
		second.next = third;
		third.next = null;

		ll.insertAfter(2, 6);
		ll.print();
	}

	public void insertFirst(int d) {
		Node newNode = new Node(d);
		Node n = head;
		newNode.next = n;
		head = newNode;
	}

	public void insertAfter(int position, int d) {
		Node n = head;
		for (int i = 0; i < position; i++) {
			n = n.next;
		}
		Node newNode = new Node(d);
		newNode.next = n;
		n.next = newNode;
	}

}
