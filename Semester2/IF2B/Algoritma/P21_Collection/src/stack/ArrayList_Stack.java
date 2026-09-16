package stack;

import java.util.ArrayList;

public class ArrayList_Stack<E> {

	private ArrayList<E> stack;
	
	public ArrayList_Stack() {
		stack = new ArrayList<>();
	}
	
	public int getSize() {
		return stack.size();
	}
	
	public E peek() {
		return stack.get(stack.size()-1);
	}
	
	public E pop() {
		E topElemen = stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return topElemen;
	}
	
	public void push(E data) {
		stack.add(data);
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		
		ArrayList_Stack<String> stack1 = new ArrayList_Stack<String>();
		stack1.push("IF");
		stack1.push("SI");
		System.out.println("Top Elemen = " + stack1.peek()); // IF SI
		stack1.push("TE");
		System.out.println("Top Elemen = " + stack1.peek()); // IF SI TE
		stack1.pop();
		System.out.println("Top Elemen = " + stack1.peek()); // IF SI
		
		ArrayList_Stack<Integer> stack2 = new ArrayList_Stack<Integer>();
		stack2.push(50);
		stack2.push(20);
		System.out.println("Top Elemen = " + stack2.peek()); // 50 20
		
		stack2.pop();
		System.out.println("Top Elemen = " + stack2.peek()); // 50 
	}

}
