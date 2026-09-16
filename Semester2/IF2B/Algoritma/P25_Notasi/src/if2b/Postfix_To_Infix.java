package if2b; 

import java.util.Stack; 

public class Postfix_To_Infix { 
    
    public boolean isOperator(char operator) { 
        if(operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '^') { 
            return true; 
        } else { 
            return false; 
        } 
    } 
    
    public String postfixInfix(String notasi) { 
        Stack<String> stack = new Stack<>(); 
        char simbol; 
        
        for(int i = 0; i < notasi.length(); i++) { 
            simbol = notasi.charAt(i); 

			//aturan no.2
			//jika simbol adalah operand, maka push operand ke stack
            if(Character.isLetterOrDigit(simbol)) { 
                stack.push(Character.toString(simbol)); 
            } 

			//aturan no.3
			//jika simbol adalah operator
            else if (isOperator(simbol)) { 
                String s1 = stack.pop(); 
                String s2 = stack.pop(); 
                String output = "(" + s2 + simbol + s1 + ")"; 
                stack.push(output); 
            } 
        } 
        return stack.pop(); 
    } 
    
    public static void main(String[] args) { 
        Postfix_To_Infix postinf = new Postfix_To_Infix(); 
        String notasiPostfix = "x2^3x*+4+x2-/"; 
        
        System.out.println("Notasi Postfix = " + notasiPostfix); 
        System.out.println("Postfix to infix = " + postinf.postfixInfix(notasiPostfix)); 
    } 
}

