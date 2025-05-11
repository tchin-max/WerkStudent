package inter4;

public class ParenthesisChecker {
	
	public static boolean isValid (String text ) {
		
		char[] pile = new char[text.length()];
		int top = -1;
		
		for(int i=0;i<text.length();i++) {
			
			char pos = text.charAt(i) ;   
			
			if(pos == '(' || pos == '{' || pos == '['){
				
			 pile [++top] = pos;
			 
			}else if(pos == ')' || pos == '}' || pos == ']') {
				
				if(top == -1) {
					return false;
					
					
				}
				
				char zumachen = pile[top--];
				
				if(pos == ')' && zumachen != '(' || pos == '}' && zumachen != '{' || pos == ']' && zumachen != '[') {
					
					return false;
				}
			}					
			
		}
	return top == -1;
}
}