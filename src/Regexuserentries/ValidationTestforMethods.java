package Regexuserentries;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ValidationTestforMethods {

	@Test
	void testValidateName_whenproper_true() {
		Validation uservalid= new Validation();
		String[] validNames = new String[] {"Jacob","Nesthe","Junior","Madnid"};
		for (String name : validNames)
		{
		boolean result=uservalid.validateName(name);
		Assert.assertEquals(true, result);
		}
	}
		
	@Test
	void testValidateName_whenshort_false() {
		Validation uservalid= new Validation();
		String[] InvalidNames = new String[] {"JdSo#b","@adnsthe","aunor","MOOC"};
		for (String name : InvalidNames)
		{
		boolean result=uservalid.validateName(name);
		Assert.assertEquals(false, result);
		}
	}
	
	@Test
	void testValidatephone_whenproper_true() {
		Validation uservalid= new Validation();
		String[] phonenum = new String[] {"+91 9299909074","+1 7878690890","+99 5645321256","+156 8989786540"};
		for (String name : phonenum)
		{
		boolean result=uservalid.validatephone(name);
		Assert.assertEquals(true, result);
		}
	}
	
	@Test
	void testValidatephone_whenshort_false() {
		Validation uservalid= new Validation();
		String[] phonenum = new String[] {"+91 09299909074","+00 7878690890","+99+5645321256","+156 099089786544"};
		for (String name : phonenum)
		{
		boolean result=uservalid.validatephone(name);
		Assert.assertEquals(false, result);
		}
	}

	@Test
	void testValidatepassword_whenproper_true() {
		Validation uservalid= new Validation();
		String[] passwordcase = new String[] {"Maub89@ud","dbha8*AJd","ADD$adh789","15_6dfaAFD"};
		for (String name : passwordcase)
		{
		boolean result=uservalid.validatepassword(name);
		Assert.assertEquals(true, result);
		}
	}
	
	@Test
	void testValidatepassword_whenshort_false() {
		Validation uservalid= new Validation();
		String[] passwordcase = new String[] {"MaubDF@ud","dbhSDa8*@d","dafad$adh789","15__6dfaAFD"};
		for (String name : passwordcase)
		{
		boolean result=uservalid.validatepassword(name);
		Assert.assertEquals(false, result);
		}
	}

}
