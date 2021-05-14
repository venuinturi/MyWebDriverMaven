package com.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
	
	@BeforeTest
	public void establishingConnectionDB() {
		System.out.println("DB COnnection Established");
	}
	
	@BeforeMethod
	public void openingBrowser() {
		System.out.println("Opening Browser");
	}
	
	
	@Test(priority=2)
	public void OP(){
		System.out.println("Executing test 2");
	}
	
	@Test(priority=1)
	public void ToRunFIrst() {
		System.out.println("Executing test 1");
	}
	
	@AfterMethod
	public void closingBrowser() {
		System.out.println("closing the browser");
	}
	
	@AfterTest
	public void method() {
		System.out.println("Closing the DB connections");
	}
	
	
}
