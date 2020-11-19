package Regexuserentries;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validation {
	private static Scanner inp;
	
	public boolean validateName(String name) {	
		String regex = "^[A-Z][a-z]{2,}$";
		Pattern pattern=Pattern.compile(regex); 
		return pattern.matcher(name).matches();	
	}

	public boolean validatephone(String phone) {
		String regex = "^[+][1-9]{1}[0-9]{0,2} [1-9]{1}[0-9]{9}$";
			if (phone.matches(regex)) 
				return true;
		else  
				return false;
		
	}

	public boolean validatepassword(String password) {
//		System.out.println("Rule1: Minimum 8 characters\n"
//							+"Rule2: Should have atleast 1 uppercase\n"
//							+"Rule3: Should have atleast 1 Number\n"
//							+"Rule4: Should have exactly one special character");
	
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?!(?:.*[@$!_%*#?&]){2})[a-zA-Z0-9@$!_%*#?&]{8,}$";
			if (password.matches(regex)) 
				return true;
			else  
			return false;
	}
	

	public boolean validateEmail(String email) {
		
			String regex = "^([a-z]+)([_+.-]?)([a-z0-9]+)@([A-Za-z0-9]+).([a-z]{2,3})((.[a-z]{2,3})?)$";	
			Pattern pattern=Pattern.compile(regex);
			return pattern.matcher(email).matches();
			
	}

}