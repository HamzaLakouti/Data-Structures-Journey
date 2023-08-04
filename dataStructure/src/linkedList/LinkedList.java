package linkedList;

class LinkedList{
	static class Node{
		int data;
		Node next;
	};
	
	static Node headNode;

	// inserting at the start/beginning of the Linked List
	static void push(int newData) {
		Node newNode = new Node();
		newNode.data = newData;
		newNode.next = headNode;
		headNode = newNode;
	}
	
	// inserting a node after a given node in the Linked List
	static void insert(Node prev, int newData) {
		if(prev == null) {
			System.out.println("previous node can't be null");
			return;
		}
		Node newNode = new Node();
		newNode.data = newData;
		newNode.next = prev.next;
		prev.next = newNode;
	}
	
	// inserting a node at the end/tail of a Linked List
	static void append(int newData) {
	    Node newNode = new Node();
	    newNode.data = newData;
	    
	    if (headNode == null) {
	        headNode = newNode;
	    } else {
	        Node tempNode = headNode;
	        while (tempNode.next != null) {
	            tempNode = tempNode.next;
	        }
	        tempNode.next = newNode;
	    }
	    
	    newNode.next = null;
	}
	
	// searching an element in a Linked List (Recursive Approach)
	static boolean searchRecursion(Node current, int s) {
		if(current == null) {
			return false;
		}
		else if(current.data == s) {
			return true;
		}
		else {
			return searchRecursion(current.next, s);
		}
	}
	
	// searching an element in the Linked List (Iterative Approach)
	static boolean searchIter(int s) {
		Node temp = headNode;
		while(temp != null) {
			if(temp.data == s) {
				return true;
			}
			temp = temp.next;
		}
		return false;
	}
	
	// delete an element at any given position
	static void delete(int position) {
		if (headNode == null) {
			System.out.println("the list is empty");
			return;
		}
		if (position == 0) {
	        headNode = headNode.next;
	        return;
	    }
		Node temp = headNode;
		for (int i = 0; i < position - 1; i++) {
			temp = temp.next;			
		}
		if(temp.next == null) {
			System.out.println("Invalid position");
			return;
		}
		temp.next = temp.next.next;
	}

	// counting the Linked List length
	// here I used the iterative approach but you can also use a recursive approach
	// by returning 1 + your getLength function with node.next in the param
	static int getLength() {
		Node temp = headNode;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	// reversing the linked list
	static Node reverse() {
		Node current = headNode;
		Node prev = null;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		headNode = prev;
		return headNode;
	}
	
	// printing the Linked List
	static void printList() {
		Node n = headNode;
		while(n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	
	
	// Just some random tests :p
	public static void main(String[] args) {
		push(113);
		push(112);
		push(111);
		push(100);
		insert(headNode, 110);
		append(114);
		printList();
		System.out.println(searchRecursion(headNode, 111));
		System.out.println(searchIter(1));
		System.out.println(getLength());
		reverse();
		System.out.println("Reversd List : ");
		printList();
		delete(2);
		printList();
	}
	
}
