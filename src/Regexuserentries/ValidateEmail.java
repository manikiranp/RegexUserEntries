package Regexuserentries;

import java.util.regex.Pattern;

public class ValidateEmail {
	
	public boolean validatEmail(String email) {
		String regex = "^([A-Za-z]+)([_+.-]?)([a-z0-9]+)@([A-Za-z0-9]+).([a-z]{2,3})((.[a-z]{2,3})?)$";
		Pattern pattern=Pattern.compile(regex);
		return pattern.matcher(email).matches();
	}
}
