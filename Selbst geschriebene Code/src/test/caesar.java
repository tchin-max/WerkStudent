package test;
import java.util.*;
public class  caesar {
	private  int Key;
	public caesar(int Key) {
		this.Key = Key%26;
		
	}
	
	public  String encrypt(String message) {
		
		char [] chars = Delete(message);
		for (int i=0 ;i<chars.length;i++) {
			chars[i] = Schift(chars[i],Key);
			
		}
		  
			return new String(chars); 
		
		
		
	}
	
	
	public  String decrypt(String message) {
		
		char [] chars = Delete(message);
		for (int i=0 ;i<chars.length;i++) {
			chars[i] = Schift(chars[i],-Key);
			
		}
		
			return new String(chars); 
		
		
		
	}
	
	public char [] Delete(String message) {
		
		char[] results = new char[message.length()] ;
		char c = message.charAt(Key);
		for (int i = 0;i< message.length() ;i++) {
	
			if(c>='a' && c<='z' || c>='A' && c<='Z' ) {
				results[i] = c;
			
		} else if(c==' ') {
			results[i]= ' ';
			
		}else {
			results[i] = '.';
		}
		
		
		
		}
		
		
		
		return results ;
		
		
	}
	
	public char Schift(char c , int schift) {
		
		if(c>='a' && c<='z') {
			
			return (char) ('a'+(c-'a' + schift+26)%26);
			
		}else if(c>='A' && c<='Z') {
			
			return (char) ('A'+(c-'A' + schift+26)%26);
			
		
		
		}else {
			return c;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
public static void main (String [] args) {
	
	String codedtext ="Bollu xyl Wixy zohencihcyln" ; 
	
	caesar caesar;
	for(int Key =0;Key<26;Key++) {
		
		
	
	caesar  = new caesar(Key);
	
	String decodedtext = caesar.decrypt(codedtext);
	System.out.println("the key ist :"+ Key +"and the decodedtext ist" + decodedtext);
	
	
	}
}}

