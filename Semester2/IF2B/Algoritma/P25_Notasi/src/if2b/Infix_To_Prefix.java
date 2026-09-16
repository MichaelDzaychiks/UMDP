package if2b;

import java.util.Stack;

public class Infix_To_Prefix {

	public int operator(char operator) {
		if(operator == '+' || operator == '-') return 1;
		else if(operator =='*' || operator == '/') return 2;
		else if (operator == '^') return 3;
		else return -1;
	}
	
	public String reverseNotasi(String notasi) {
		String kata = "";
		for(int i = notasi.length()-1; i>=0; i--) {
			char karakter = notasi.charAt(i);
			
			if(karakter == '(') {
				kata = kata + ')';
			} 
			else if (karakter == ')' ) {
				kata = kata + '(';
			}
			else {
				kata = kata + karakter;
			}
		}
		return kata;
	}
	
	public String reverseHasil(String karakter) {
		String kata = "";
		for(int i = karakter.length()-1; i >=0;i--) {
			kata = kata + karakter.charAt(i);
		}
		return kata;
	}
	
	public String infixPrefix(String notasi) {
		String hasilReverse = reverseNotasi(notasi);
		
		Stack<Character> stack = new Stack<>();
		
		String output = new String("");
		char simbol;
		
		for(int i = 0; i < hasilReverse.length();i++) {
			simbol = hasilReverse.charAt(i);
			
			//aturan no.2
			//jika simbol adalah operand, maka push operand ke output
			if(Character.isLetterOrDigit(simbol)) {
				output = output + simbol;
			}
			
			//aturan no.3
			//jika simbol adalah '(' maka push '(' ke stack
			else if (simbol == '(') {
				stack.push(simbol);
			}
			
			//aturan no.4
			//jika simbol adalah ')', maka pop semua elemen dari stack ke output sampai ketemu simbol '(' tetapi tidak dipindahkan ke output
			else if(simbol == ')') {
				while(!stack.isEmpty() && stack.peek() != '(' ) {
					output = output + stack.pop();
				}
				if (!stack.isEmpty() && stack.peek() != '(' ) {
					return "invalid expression";
				} else {
					stack.pop();
				}
			}
			
			// aturan no.5
			//jika simbol adalah operator
			else {
				while(!stack.isEmpty() && operator(stack.peek()) > operator(simbol)) {
					if(stack.peek() == '(') {
						return "invalid expression";
					}
					output = output + stack.pop(); // aturan 5.c
				}
				stack.push(simbol); //aturan 5.d
			}
		}
		while(!stack.isEmpty()) {
			if(stack.peek() == '(' ) {
				return "invalid expression";
			}
			output = output + stack.pop();
		}
		return reverseHasil(output);
		}
	
	public static void main(String[] args) {
		Infix_To_Prefix infpre = new Infix_To_Prefix();
				
		String notasi = "(x^2+3*x+4)/(x-2)";
		
		System.out.println("Notasi Infix = " + notasi);
		System.out.println("Infix To Prefix = " + infpre.infixPrefix(notasi));
	}

}
