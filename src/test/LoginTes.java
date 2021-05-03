package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
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
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Venu Gopal");
		//doLogin();
	}

	public static void doLogin() {
		System.out.println("login SUccessful");
	}
}
