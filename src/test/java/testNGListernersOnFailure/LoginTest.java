package testNGListernersOnFailure;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
	
	@Test 
	public void TestLogin() throws IOException {
		
//		driver.findElement(By.name("q")).sendKeys("Venu");
		
		WebElement searchBox=driver.findElement(By.name("aq"));
		
		searchBox.sendKeys("Venu ");
		searchBox.sendKeys(Keys.ENTER);
		
		//CaptureScreenUtil.ScreenshotCap(".//screenshot//");
	}
	
	@Test
	public void FailureCase() {
		Assert.fail("Error manually created ");
	}

}
