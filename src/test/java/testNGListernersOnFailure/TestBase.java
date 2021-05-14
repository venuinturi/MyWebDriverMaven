package testNGListernersOnFailure;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void Setup() {
	
		
		if(driver==null) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			driver.get("https://google.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		}
		 
	}

	@AfterClass
	public void tearDown() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
