package com.java.regex.Regexuc1;

import org.junit.Assert;
import org.junit.Test;

public class Testing {

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		moodanalyser ma = new moodanalyser();
		String m = ma.analysemood("This is a Sad message");
		Assert.assertEquals("SAD", m);
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() {
		moodanalyser ma = new moodanalyser();
		String m = ma.analysemood("This is a Happy message");
		Assert.assertEquals("HAPPY", m);
	}


}
