package Regexuserentries;

import java.util.Scanner;

public class Validation {
	private static Scanner inp;
	
	public void validateFirstname() {	
		inp = new Scanner(System.in);
		
		String regex = "^[A-Z][a-z]+{2,}$";
		int i=1;
		while(i>0) {
			System.out.println("Enter firstname");
			String firstname=inp.nextLine();
			if (firstname.matches(regex)) {
			i=-1;
			System.out.println("Valid");
		}
		else  {
			System.out.println("InValid");
			}
		}
	}
}
