package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	public static String expected="google";
	
	@Test
	public void AssertDemo() {
		SoftAssert sa=new SoftAssert();
		
		
		String Actual="yahoo";
		
		sa.assertEquals(Actual, expected);
		System.out.println("soft assert 1 failed");
		
		
		Assert.assertEquals(Actual, Actual);
		System.out.println("assert passed");
		
		sa.assertAll();
		
	}
}
