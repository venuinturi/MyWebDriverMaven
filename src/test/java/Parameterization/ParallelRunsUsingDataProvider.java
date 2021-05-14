package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParallelRunsUsingDataProvider {
	
	@Test (dataProvider="GetData")
	public void ParallelTest(String browser) {
		
		System.out.println(browser);
	}
	
	
	@DataProvider 
	public Object[][] GetData(){
		
		Object[][] obj=new Object[2][1];
		
		obj[0][0]="firefox";
		obj[1][0]="chrome";
		
		return obj;
		
	}

}
