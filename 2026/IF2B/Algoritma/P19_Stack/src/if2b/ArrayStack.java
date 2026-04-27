package if2b;

public class ArrayStack {

	private int[] data;
	private int size;
	private int top;
	private int length;
	
	public ArrayStack(int size) {
		this.size = size;
		length = 0;
		data = new int[size];
		top = -1; //tidak ada data / stack kosong
	}
	
	public boolean isEmpty() { //isEmpty = is it empty...?
		return top == -1;
	}
	
	public boolean isFull() {
		return top == size-1;
	}
	
	//cek panjang stack
	public int getSize() {
		return length;
	}
	
	public void push(int data) {
		if(top+1 >= size) {
			System.out.println("stack penuh");
		} else {
			this.data[++top] = data;
			length++;
		}
	}
	
	//keluarkan data dari stack
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack kosong");
		}
		length--;
		return data[top--]; //hapus data terakhir
	}
	
	public void tampilStack() {
		if(isEmpty()) {
			System.out.println("Stack kosong");
		} else {
			System.out.println("isi stack: ");
			for(int i = top; i >= 0; i--) {
				System.out.print(this.data[i] + " ");
			}
			System.out.println();
		}
	}
	
	//cek elemen top
	public int peek() {
		if(isEmpty()) {
			System.out.println("stack kosong");
		} 
		return this.data[top];
	}
	
	public static void main(String[] args) {
		ArrayStack stack= new ArrayStack(5);
		stack.push(10);
		System.out.println("top elemen = " + stack.peek());
		
		stack.push(20);
		System.out.println("top elemen = " + stack.peek());
		stack.tampilStack(); //20 10
		
		stack.push(30);
		System.out.println("top elemen = " + stack.peek());
		stack.tampilStack();// 30 20 10 
		
		System.out.println("hapus top elemen = " + stack.pop());
		stack.tampilStack(); //20 10
		
		System.out.println("banyak data dalam stack = " + stack.getSize());
		
		stack.pop();
		stack.pop();
		System.out.println("empty status = " + stack.isEmpty());
		
		System.out.println("full status = " + stack.isFull());
	}

}
