package Regexuserentries;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
//import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ValidationTestEmail {
	private String email;
	private Boolean expectedvalidation;
	private Validation validation;
	
	@Before
	public void intialize() {
		validation = new Validation();
	}
	
	public ValidationTestEmail(String email, boolean expectedvalidation) {
		this.email=email;
		this.expectedvalidation=expectedvalidation;
	}
	
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com", true}, {"abc.100@abc.com.au", true},{"abc@gmail.com.com", true},
			{"abc-100@yahoo.com", true},{"abc@1.com", true},{"abc+100@gmail.com", true},
			{"abc.100@yahoo.com", true},{"abc-100@abc.net", true},{"abc111@abc.com", true},
			{"abc..2002@gmail.com", false},{"abc@.com.my", false},{"abc123@.com", false},{"abc123@gmail.a", false},
			{"abc123@.com.com", false},{".abc@abc.com", false},{"abc()*@gmail.com", false},{"abc@%*.com", false},
			{"abc.@gmail.com", false},{"abc@abc@gmail.com", false},{"abc@gmail.com.1a", false},{"abc@gmail.com.aa.au", false},
		
			});
		
		
	
	}
	
	@Test
	public void testValidateEmail() {
		
		assertEquals(expectedvalidation, validation.validateEmail(email));
		
	}

}
