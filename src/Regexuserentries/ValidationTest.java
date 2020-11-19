package Regexuserentries;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ValidationTest {
	String[] validmails = new String[] {"abc@yahoo.com","abc-100@yahoo.com","abc.100@yahoo.com",
			"abc111@abc.com","abc-100@abc.net","abc.100@abc.com.au",
			"abc@1.com","abc@gmail.com.com","abc+100@gmail.com"};
	
	String[] Invalidmails = new String[] {"abc","abc@.com.my","abc123@gmail.a","abc123@.com",
			"abc123@.com.com",".abc@abc.com","abc()*@gmail.com","abc@%*.com",
			"abc..2002@gmail.com","abc.@gmail.com","abc@abc@gmail.com",
			"abc@gmail.com.1a","abc@gmail.com.aa.au"};
	
	@Test
	public void testValidateEmail_whenproper_returntrue() {
		Validation validation=new Validation();
		for (String name : validmails)
		{
		boolean result=validation.validateEmail(name);
		Assert.assertEquals(true, result);
		}
		
	}
	

	@Test
	public void testValidateEmail_whenimproper_returnfalse() {
		Validation validation=new Validation();
		for (String name : Invalidmails)
		{
		boolean result=validation.validateEmail(name);
		Assert.assertEquals(false, result);
		}
	}
} 