package Parameterization;

import java.util.Date;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralleltest {

	@Parameters({"browser"})
	@Test
	public void DoLogin(String Browser) {
		
		Date d=new Date();
		System.out.println(Browser+d);
	}

}
