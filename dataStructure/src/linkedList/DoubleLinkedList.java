package linkedList;

public class DoubleLinkedList {
	static class Node{
		int data;
		Node prev;
		Node next;
	};
	
	static Node headNode;

	static void push(int new_data) {
		Node newNode = new Node();
		newNode.data = new_data;
		
		newNode.next = headNode;
		newNode.prev = null;
		
		if (headNode != null) {
			headNode.prev = newNode;
		}
		
		headNode = newNode;
	}
	
	static void show(Node n) {
		
		Node last = null;
		
		while(n != null) {
			System.out.println(n.data + " ");
			last = n;
			n = n.next;
		}
		
		while(last != null) {
			System.out.println(last.data);
			last = last.prev;
		}
	}
	
	public static void main(String[] args) {
		headNode = null;
		push(6);
		push(8);
		push(2);
		
		show(headNode);
	}

}
