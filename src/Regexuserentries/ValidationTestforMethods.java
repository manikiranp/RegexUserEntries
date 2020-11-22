package Regexuserentries;

import org.junit.Assert;
import org.junit.Test;


public class ValidationTestforMethods {

	@Test
	public void testValidateName_whenproper_true() {
		Validation uservalid= new Validation();
		String[] validNames = new String[] {"Jacob","Nesthe","Junior","Madnid"};
		for (String name : validNames)
		{
		boolean result;
		try {
			result = uservalid.validateName(name);
			Assert.assertEquals(true, result);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
		
	@Test
	public void testValidateName_whenshort_false() {
		Validation uservalid= new Validation();
		String[] InvalidNames = new String[] {"JdSo#b","@adnsthe","aunor","MOOC"};
		for (String name : InvalidNames)
		{
		boolean result;
		try {
			result = uservalid.validateName(name);
			Assert.assertEquals(false, result);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
	
	@Test
	public void testValidatephone_whenproper_true()  {
		Validation uservalid= new Validation();
		String[] phonenum = new String[] {"+91 9299909074","+1 7878690890","+99 5645321256","+156 8989786540"};
		for (String name : phonenum)
		{
		boolean result;
		try {
			result = uservalid.validatephone(name);
			Assert.assertEquals(true, result);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
	
	@Test
	public void testValidatephone_whenshort_false()  {
		Validation uservalid= new Validation();
		String[] phonenum = new String[] {"+91 09299909074","+00 7878690890","+99+5645321256","+156 099089786544"};
		for (String name : phonenum)
		{
		boolean result;
		try {
			result = uservalid.validatephone(name);
			Assert.assertEquals(false, result);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}

	@Test
	public void testValidatepassword_whenproper_true() {
		Validation uservalid= new Validation();
		String[] passwordcase = new String[] {"Maub89@ud","dbha8*AJd","ADD$adh789","15_6dfaAFD"};
		for (String name : passwordcase)
		{
		boolean result;
		try {
			result = uservalid.validatepassword(name);
			Assert.assertEquals(true, result);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
	
	@Test
	public void testValidatepassword_whenshort_false() {
		Validation uservalid= new Validation();
		String[] passwordcase = new String[] {"MaubDF@ud","dbhSDa8*@d","dafad$adh789","15__6dfaAFD"};
		for (String name : passwordcase)
		{
		boolean result;
		try {
			result = uservalid.validatepassword(name);
			Assert.assertEquals(false, result);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}
	
	@Test
	public void testValidateName_whennull_throwexception() {
		Validation uservalid= new Validation();
		boolean result;
		try {
			result = uservalid.validateName(null);
		} catch (ValidationException e) {
			Assert.assertEquals(ValidationException.ExceptionType.ENTEREDNULL,e.getType());
		}
	}
	
	@Test
	public void testValidatephone_whennull_throwexception()  {
		Validation uservalid= new Validation();
		boolean result;
		try {
			result = uservalid.validatephone(null);
		} catch (ValidationException e) {
			Assert.assertEquals(ValidationException.ExceptionType.ENTEREDNULL,e.getType());
			
		}
	}
	
	@Test
	public void testValidatepassword_whennull_throwexception() {
		Validation uservalid= new Validation();
		boolean result;
		try {
			result = uservalid.validatepassword(null);
		} catch (ValidationException e) {
			Assert.assertEquals(ValidationException.ExceptionType.ENTEREDNULL,e.getType());
		}
		
	}
	
	@Test
	public void testValidateEmail_whennull_throwexception() {
		Validation uservalid= new Validation();
		boolean result;
		try {
			result = uservalid.validatepassword(null);
		} catch (ValidationException e) {
			Assert.assertEquals(ValidationException.ExceptionType.ENTEREDNULL,e.getType());
			}
		
		}
	
	
}
		

