package queue;
//implement Queue using array
public class Queue {
	
	int front;
	int rear;
	int size;
	int queue[];
	int capacity;
	
	// Constructor
	Queue(int capacity) {
		this.capacity = capacity;
		front = size = rear = 0;
		queue = new int[capacity];
	}
	
	// Queue is empty when size is 0
	boolean isEmpty() {
		return (size==0);
	}
	
	// Queue is full when size equal to queue's length
	boolean isFull() {
		return (size==queue.length);
	}
	
	// Add element to the queue
	void enQueue(int val) {
		if(isFull()) {
			System.out.println("Queue is full");
			return;
		}
		queue[rear] = val;
		rear = (rear + 1) % capacity;
		size++;
	}

	// Remove element from the queue
	int deQueue(){
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		}
		int data = queue[front];
		front = (front + 1) % capacity;
		size--;
		return data;
	}
	
	// Get front of queue
    int front()
    {
        if (isEmpty())
            return Integer.MIN_VALUE;
 
        return queue[this.front];
    }
 
    // Get rear of queue
    int rear()
    {
        if (isEmpty())
            return Integer.MIN_VALUE;
 
        return queue[this.rear];
    }
	
	// Print
	void show() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		for (int i = 0; i < size; i++) {
			System.out.println(queue[(front + i) % capacity] + " ");
		}
	}
	
	// Just some random tests :p
	public static void main(String[] args) {
		Queue q = new Queue(4);
		
		q.enQueue(10);
		q.enQueue(20);
		q.enQueue(30);
		q.enQueue(40);
		q.enQueue(40);
		q.deQueue();
		q.deQueue();
		q.show();
	}

}
