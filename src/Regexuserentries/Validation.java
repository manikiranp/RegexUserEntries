package Regexuserentries;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;


public class Validation {
	
	private Scanner input;

	public boolean validateName(String inp) throws ValidationException {
//		input = new Scanner(System.in);
//		System.out.println("Enter the  Firstname:");
//		String inp=input.nextLine();
//		String regex = "^[A-Z][a-z]{2,}$";
		try {
		if (inp.length()==0) 
		throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Follow proper pattern");
		Predicate<String> matcher = n -> (n.matches("^[A-Z][a-z]{2,}$"));
		return matcher.test(inp);
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
			throw new ValidationException(ValidationException.ExceptionType.ENTEREDNULL,"No Input, Enter Proper Input");
			}
	}
	
	public boolean validatephone(String inp) throws ValidationException {
		try {
			if (inp.length()==0) 
				throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Follow proper pattern");
			Predicate<String> matcher = n -> (n.matches("^[+][1-9]{1}[0-9]{0,2} [1-9]{1}[0-9]{9}$"));
			return matcher.test(inp);
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
			throw new ValidationException(ValidationException.ExceptionType.ENTEREDNULL,"No Input, Enter Proper Input");
			
		}
		
	}

	public boolean validatepassword(String inp) throws ValidationException {
	
		try {
			if (inp.length()==0) 
			throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Follow proper pattern");
			
			Predicate<String> matcher = n -> (n.matches("^(?=.*[A-Z])(?=.*[0-9])(?!(?:.*[@$!_%*#?&]){2})[a-zA-Z0-9@$!_%*#?&]{8,}$"));
			return matcher.test(inp);
			}
		catch (NullPointerException e) {
			System.out.println("Invalid Input");
			throw new ValidationException(ValidationException.ExceptionType.ENTEREDNULL,"No Input, Enter Proper Input");
			
		}
	}

	public boolean validateEmail(String inp) throws ValidationException {
		
			try {
				if (inp.length()==0) 
				throw new ValidationException(ValidationException.ExceptionType.ENTERED_EMPTY,"Follow proper pattern");
				Predicate<String> matcher = n -> (n.matches("^([a-z]+)([_+.-]?)([a-z0-9]+)@([A-Za-z0-9]+).([a-z]{2,3})((.[a-z]{2,3})?)$"));
				return matcher.test(inp);
				
			}
			catch (NullPointerException e) {
				System.out.println("Invalid Input");
				throw new ValidationException(ValidationException.ExceptionType.ENTEREDNULL,"No Input, Enter Proper Input");
			}
			
	}
}
