package if2b;

import java.util.Stack;

public class Prefix_To_Postfix {
	 public boolean isOperator(char operator) { 
	        if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '^') { 
	            return true; 
	        } else { 
	            return false; 
	        } 
 	} 
	
	 public String prefixPostfix(String notasi) { 
        Stack<String> stack = new Stack<>(); 
        char simbol;
	             
//	    reverse
        for(int i = notasi.length()-1;i>=0;i--) {
        	simbol = notasi.charAt(i);
        	
        	//aturan no.2
			//jika simbol adalah operand, maka push operand ke stack
            if(Character.isLetterOrDigit(simbol)) { 
                stack.push(simbol + ""); 
            } 
            
            //aturan no.3
			//jika simbol adalah operator
            else if (isOperator(simbol)) { 
            	String s1 = stack.pop(); 
                String s2 = stack.pop(); 
                String output = s1 + s2 + simbol; 
                stack.push(output); 
            }
        }
        return stack.pop();
	 }
	 
	public static void main(String[] args) {
		Prefix_To_Postfix prePost = new Prefix_To_Postfix();
		
		String notasi = "/++^x2*3x4-x2";
//		x2^3x*+4+x2-/
		System.out.println("Notasi Prefix = " + notasi);
		System.out.println("Notasi Postfix = " + prePost.prefixPostfix(notasi));
	}

}
