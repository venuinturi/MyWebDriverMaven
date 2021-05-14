package com.test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
	String expected="www.google.com";
	
	
	@Test
	public void COmpare() {
		String actual="yahoo.com";
		
		Assert.assertNotEquals(actual, expected);
		//Assert.assertEquals(actual, expected);
		//assertFalse(expected==actual);
		Assert.fail();
	}
	
}
