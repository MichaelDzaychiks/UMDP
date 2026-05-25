package if2b;

import java.util.Stack;

public class Postfix_To_Prefix {
	
	//cek apakah operator atau bukan
	public boolean isOperator(char operator) {
		if(operator == '+' || operator == '-' || operator == '*' || 
		   operator == '/' || operator == '^') {
		return true;
		} 
		else {
			return false;
		}
	}
	
	public String postfixPrefix(String notasi) {
		Stack<String> stack = new Stack<>();
		
		char simbol;
		
		for (int i=0; i<notasi.length(); i++) {
			simbol = notasi.charAt(i); //mengambil simbol satu per satu
			
			//aturan no 2 
			//Jika simbol adalah operand, maka push operand ke stack
			if (Character.isLetterOrDigit(simbol)) {
				stack.push(simbol + "");
			}
			//aturan no 3
			//Jika simbol adalah operator
			else if (isOperator(simbol)) {
				String s1 = stack.pop();
				String s2 = stack.pop();
				
				String output = simbol + s2 + s1;
				stack.push(output);
			}
		}
		return stack.pop();
	}
		
	public static void main(String[] args) {

		Postfix_To_Prefix postpre = new Postfix_To_Prefix();
		
		String notasi = "x2^3x*+4+x2-/";
		
		System.out.println("Notasi Postfix = " + notasi);
		System.out.println("Notasi Prefix  = " + postpre.postfixPrefix(notasi));
	    //  /++^x2*3x4-x2
	}

}