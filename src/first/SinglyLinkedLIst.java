package first;

public class SinglyLinkedLIst {

	Node head;

	private static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display() {
		Node n = head;
		while (n != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println();

	}

	public static void main(String args[]) {
		SinglyLinkedLIst ll = new SinglyLinkedLIst();

		ll.head = new Node(1);
		Node first = new Node(2);
		Node second = new Node(3);

		ll.head.next = first;
		first.next = second;
		ll.display();

	}

}
