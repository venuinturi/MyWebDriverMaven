package Parameterization;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersFromXML {

	@Parameters({"browser","TestingType"})
	@Test
	public void getBrowser(String browser, String TestingType) {
		System.out.println(browser);
		System.out.println(TestingType);
	}
}
