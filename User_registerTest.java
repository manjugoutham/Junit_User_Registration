package com.java.regex.Regexuc1;

    import org.junit.Assert;
    import org.junit.Test;
	import java.util.Arrays;
	import java.util.Collection;
	 
	import org.junit.Test;
	import org.junit.Before;

	import org.junit.runners.Parameterized;
	import org.junit.runners.Parameterized.Parameters;
	import org.junit.runner.RunWith;
	import static org.junit.Assert.assertEquals;

	@RunWith(Parameterized.class)
	
	public class User_registerTest {
	   private String email;
	   private Boolean expectedResult;
	   private user_register user_reg;

	   @Before
	   public void initialize() {
		   user_reg = new user_register();
	   }

		
	   public User_registerTest(String email, Boolean expectedResult) {
	      this.email = email;
	      this.expectedResult = expectedResult;
	   }

	   @Parameterized.Parameters
	   public static Collection emailaddress() {
	      return Arrays.asList(new Object[][] {
		         {"abc+100@gmail.com", true},
		         { "abc@abc@gmail.com", false },
		         { "abc.100@yahoo.com", true },
		         {"abc@gmail.com.1a",false}
	      });
	   }

	   @Test
	   public void emailvalidTest() {
	      System.out.println("Parameterized email is : " + email);
	      assertEquals(expectedResult, 
	    		  user_reg.email(email));
	   }
	

	
	
	//uc 10 problem.....
	@Test
	public void firstnameTest() {
		user_register ur = new user_register();
		boolean result = ur.firstname();
		Assert.assertEquals(true, result);
	}

	@Test
	public void lastnameTest() {
		boolean result = user_register.lastname();
		Assert.assertEquals(true, result);
	}
	
	@Test
    	public void emailTest(){
    	boolean emailres = user_register.email("abc+100@gmail.com");
    	Assert.assertEquals(true, emailres);
    }

	@Test
   	 public void mobilenumberTest(){
		boolean mobile = user_register.mobilenumber();
    	Assert.assertEquals(true,mobile);
    }
	
	@Test
  	public void rule4Test(){
		boolean specialch = user_register.Rule4();
  	Assert.assertEquals(true, specialch);
  }

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		moodanalyser ma = new moodanalyser();
		String m = ma.analysemood("This is a Sad message");
		Assert.assertEquals("SAD", m);
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		moodanalyser ma = new moodanalyser();
		String m = ma.analysemood("This is a Sad");
		Assert.assertEquals("HAPPY", m);
	}
	
	// uc 11 code 
	
	
	
	
}
