package if2b;

import java.util.NoSuchElementException;

public class Queue {

	private int size;
	private int[] queue;
	private int head;
	private int tail;
	private int length;
	
	public Queue(int size) {
		this.size = size;
		this.queue = new int[size];
		this.head = -1;
		this.tail = -1;
		this.length = 0;
	}
	
	public boolean isEmpty() {
		return head == -1;
	}
	
	public boolean isFull() {
		return head == 0 & tail == size-1;
	}
	
	public void enqueue(int data) {
		if(isFull()) {
			System.out.println("QueuePenuh");
		} else if (isEmpty())	{
			this.head = 0;
			this.tail = 0;
			this.queue[tail] = data;
			length++;
			System.out.println("Data yang dimasukkan ke Queue = " + data);
		} else if (tail+1 < size){
			this.queue[++tail] = data;
			length++;
			System.out.println("Data yang dimasukkan ke Queue = " + data);
		}
	}
	
	public int dequeue() {
		if(isEmpty()) {
			throw new NoSuchElementException("Queue Kosong");
		} else {
			int dataDihapus = this.queue[head];
			if(this.head == this.tail) {
				this.head = -1;
				this.tail = -1;	
			} else {
				this.head++;
			}
			length--;
			System.out.println("Data Yang Dihapus dari Queue = " + dataDihapus);
			return dataDihapus;
		}
	}
	
	public void tampilData() {
		System.out.println("Data Queue = ");
		if(this.isEmpty()) {
			System.out.println("Queue Kosong");
		} 
		for (int i = this.head; i <= this.tail; i++) {
			System.out.print(this.queue[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue(5);
		queue.enqueue(5);
		queue.enqueue(4);
		queue.tampilData();
		
		queue.enqueue(3);
		queue.enqueue(2);
		queue.enqueue(1);
		queue.tampilData();
		
		queue.dequeue();
		queue.tampilData();
	}
}
