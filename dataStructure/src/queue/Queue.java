package queue;

public class Queue {
	
	int front;
	int rear;
	int size;
	int queue[];
	
	Queue(int capacity) {
		front = rear = size = 0;
		queue = new int[capacity];
	}
	
	boolean isEmpty() {
		return (size==0);
	}
	
	boolean isFull() {
		return (size==queue.length);
	}
	
	void enQueue(int val) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		queue[rear] = val;
		rear++;
		size++;
	}
	
	void show() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		for (int i = 0; i < rear; i++) {
			System.out.println(queue[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Queue q = new Queue(2);
		
		q.enQueue(10);
		q.enQueue(20);
		q.show();
	}

}
