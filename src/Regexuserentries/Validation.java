package Regexuserentries;

import java.util.Scanner;

public class Validation {
	private static Scanner inp;
	
	public void validateFirstname() {	
		inp = new Scanner(System.in);
		String regex = "^[A-Z][A-Za-z]+{2,}$";
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

	public void validatelastName() {
		inp = new Scanner(System.in);
		String regex = "^[A-Z][A-Za-z]+{2,}$";
		int i=1;
		while(i>0) {
			System.out.println("Enter LastName");
			String lastname=inp.nextLine();
			if (lastname.matches(regex)) {
			i=-1;
			System.out.println("Valid");
		}
		else  {
			System.out.println("InValid");
			}
		}
		
	}

	public void validatephone() {
		inp = new Scanner(System.in);
		String regex = "^[1-9]{1}[0-9]{0,2}[1-9]{1}[0-9]{9}$";
		int i=1;
		while(i>0) {
			System.out.println("Enter phonenumber with country code");
			String phone=inp.nextLine();
			if (phone.matches(regex)) {
			i=-1;
			System.out.println("Valid");
		}
		else  {
			System.out.println("InValid");
			}
		}
		
	}

	public void validatepassword() {
		System.out.println("Rule1: Minimum 8 characters");
		inp = new Scanner(System.in);
		String regex = "^[a-zA-Z]{8,}$";
		int i=1;
		while(i>0) {
			System.out.println("Enter password:");
			String pass=inp.nextLine();
			if (pass.matches(regex)) {
			i=-1;
			System.out.println("Valid");
		}
		else  {
			System.out.println("InValid");
			}
		}
		
		
	}
}
