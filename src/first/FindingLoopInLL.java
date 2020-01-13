package first;

public class FindingLoopInLL {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	public void push(int data) {

		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

	public boolean detectLoop() {
		Node slowNode = head, fast_node = head;
		while (slowNode != null && fast_node != null && fast_node.next != null) {
			slowNode = slowNode.next;
			fast_node = fast_node.next.next;
			if (slowNode == fast_node)
				return true;

		}
		return false;
	}

	public static void main(String[] args) {
		FindingLoopInLL ll = new FindingLoopInLL();
		ll.push(10);
		ll.push(20);
		ll.push(30);
		ll.push(40);
		ll.head.next = ll.head;

		if (ll.detectLoop())
			System.out.println("loop found");
		else
			System.out.println("loop not found");

	}

}
