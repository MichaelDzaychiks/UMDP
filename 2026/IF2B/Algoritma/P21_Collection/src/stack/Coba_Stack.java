package stack;

import java.util.Iterator;
import java.util.Stack;

public class Coba_Stack {

	public static void tampil(Stack<String> stack) {
		Iterator<String> data = stack.iterator();
		while(data.hasNext()) {
			System.out.println(data.next() + " ");
		}
	}
	
	public static void main(String[] args) {
		
		Stack<String> kelas = new Stack<>();
		
		kelas.push("IF2A");
		tampil(kelas);
		System.out.println("\nTop Elemen = " + kelas.peek());
		
		kelas.push("IF2B"); //IF2A IF2B
		tampil(kelas);
		System.out.println("\nTop Elemen = " + kelas.peek());
		
		System.out.println("Hapus Top Elemen = " + kelas.pop());
		tampil(kelas);
		System.out.println("\nTop Elemen = " + kelas.peek());
		
		kelas.push("IF21");
		tampil(kelas);
		System.out.println("\nTop Elemen = " + kelas.peek());
	}

}
