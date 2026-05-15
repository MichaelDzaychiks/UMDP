package latihanStack;

import java.util.Stack;

import java.util.Scanner;

public class Latihan1 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int desimal = 0, sisa = 0;
		
		System.out.print("Masukkan nilai desimal = ");
		desimal = sc.nextInt();
		sc.nextLine();
		
		Stack<Integer> stack = new Stack<>();
		
		while(desimal > 0) {
			sisa = desimal % 2;
			stack.push(sisa); //sisa bagi dimasukkan ke stack
			
			desimal = desimal/2;
		}
		
		System.out.print("Hasil Biner = ");
		while(!stack.isEmpty()) {
			System.out.print(stack.pop());
		}
	}

}
