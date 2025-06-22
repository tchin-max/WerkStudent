package test;

import java.io.IOException;
import java.lang.module.ModuleDescriptor.Builder;
import java.util.Scanner;


import inter6.confirmBox;

public class Usermodel {
	
public boolean login(String email ,String passwort) {
	return email.equals("tchinda@gamil.com") && passwort.equals("1234");

	
}
	class ConsoleUI {
		
		private String Eingabe(String eingsbe) {
			
			System.out.println(eingsbe);
Scanner sc = new Scanner(System.in);

return sc.nextLine();


		}
		
		
	}
	
	
		
		public static void main(String[] args) {
			
			Usermodel um = new Usermodel();
			ConsoleUI cu = um.new ConsoleUI();
			String email = cu.Eingabe("email: ");
			String passwort = cu.Eingabe("Password: ");
			
			if (um.login(email, passwort)) {
				System.out.println("welcome");
				
			}else {
				System.out.println("bille nochmal");
			}
		}
	}
		





