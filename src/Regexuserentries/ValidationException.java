package Regexuserentries;

import Regexuserentries.ValidationException.ExceptionType;

public class ValidationException extends Exception {
	public ExceptionType type;
	
	enum ExceptionType{
		ENTEREDNULL,NO_INPUT
	}
	
	public ValidationException(ExceptionType type, String s) {
		super(s);
		this.type=type;
	}

	public ExceptionType getType() {
		return type;
	}

}
