package linkedList;

public class CircularLinkedList {
	
	static class Node{
		int data;
		Node next;
	};
	
	static Node push(Node headNode, int newData) {
		Node p = new Node();
		Node temp = headNode;
		p.data = newData;
		p.next = headNode;
		
		if(headNode != null) {
			while(temp.next != headNode) {
				temp = temp.next;
			}
			temp.next = p;
		}
		
		else 
			p.next = p;
		
		return headNode;
	}
	
	public static void main(String[] args) {
		
	}

}
