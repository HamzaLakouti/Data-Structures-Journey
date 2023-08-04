package stack;
// Let's implement Stack using Arrays

public class Stack {
	
	static final int MAX = 100;
	int a[] = new int[MAX];
	int top;
	
	// Constructor
	Stack() {
		top = -1;  // Initializes the top variable to -1, indicating an empty stack
	}
	
	// Checking if the stack is empty (returning a boolean value)
	boolean isEmpty() {
		return (top < 0);
	}
	
	// Adding an element to the stack
	void push(int val) {
		if(top >= MAX) {
			System.out.println("The Legendary Stack Overflow");
			return;
		}
		else {
			a[++top] = val;
		}
	}
	
	// Removing an element from the stack
	int pop() {
		if(top < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int val = a[top--];
			return val;
		}
	}
	
	// Looking at the top element
	int peek() {
		if(top < 0) {
			System.out.println("Stack Is empty");
			return 0;
		}
		else {
			return a[top];
		}
	}
	
	// Printing the stack
	void show() {
		if(top < 0) {
			System.out.println("Stack Is empty, try to push elements");
			return;
		}
		else {
			for (int i = 0; i<= top; i++ ) {
				System.out.println(a[i] + " ");
			}
		}
	}
	
	// Just some random tests :p
	public static void main(String[] args) {
		Stack s = new Stack();
		s.push(1);
		s.push(2);
		s.push(3);
		
		s.pop();
		s.show();
		System.out.println(s.peek());
		
	}
}
