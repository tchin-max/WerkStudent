package test;

public class PArenth {
	
	static  boolean isvalid(String text) {
		
		char pile [] = new char[text.length()] ;
		
		int top = -1;
		
		for (int i= 0;i<text.length();i++) {
		char pos = text.charAt(i);
		
		if(top == '(' || top == '{' || top == '[' ) {
			
			pile [top++] = pos;
			
			
		}else if(top == ')' || top == '}' || top == ']') {
			
			if(top == -1) {
				
				return false;
				
			}
			char zumachen = pile[top--];
			
			if(top == ')' && zumachen != '(' || top == '}' && zumachen != '{' || top == ']' && zumachen != '[' ) {
				return false;
				
			}
		}
		
	
		}
		return top ==-1;
		
		
		
		
	}

}
