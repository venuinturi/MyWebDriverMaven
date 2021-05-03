package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTes {

	public static WebDriver driver;

	@Test
	public void testLogin() {
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://google.com");

		doLogin();
	}

	public static void doLogin() {
		System.out.println("login SUccessful");
	}
}
