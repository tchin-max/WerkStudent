package inter4;
public class Caesar {

	private int key ;
	
	public Caesar(int key) {
	
		this.key= key%26;
		
	}
	public  String encrypt(String message) {
		char[] chars = Delete(message);
		for (int i =0;i<chars.length;i++) {
			chars[i]= schift(chars[i],key);
			
		}
		return new String(chars);
		
	}
	public  String decrypt(String message) {
		char[] chars = Delete(message);
		for (int i =0;i<chars.length;i++) {
			
			chars[i]= schift(chars[i],-key);
			
		}
		return new String(chars);
		
		
		
	}
	
	
	public char [] Delete (String message) {
		
		
		    char[] result = new char[message.length()];
		    for (int i = 0; i < message.length(); i++) {
		        char c = message.charAt(i);
		        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
		            result[i] = c;   
		        } else if (c == ' ') {
		            result[i] = ' '; 
		        } else {
		            result[i] = '.'; 
		        }
		    }
		    return result;
		}

	
	public char schift(char c , int schift ) {
		
	if(c>='a' && c<='z') {
		return  (char) ('a'+(c-'a'+schift +26)%26);
		
		
	}else if(c>='A' && c<='Z') {
		return   (char)('A'+(c-'A'+schift +26)%26) ;
		
		
	}else {
		
		return c;
	}
		
	
	}
	
	
	
	public static  void main (String[] args) {
		
		String codedtext = "Bollu xyl Wixy zohencihcyln";
		Caesar Caesar ;
		for(int key=0;key<26;key++) {
			Caesar = new   Caesar(key);
			String decodedtext =  Caesar.decrypt(codedtext);
			
			System.out.println( "Der Schlüssel ist :" + key + "decodedtext ist :" + decodedtext);
			
			
			
		}
		

			
			
		}
		
			
			
		}
	


