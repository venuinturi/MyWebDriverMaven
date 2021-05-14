package Parameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTest {

	

	@Test(dataProvider = "Params")
	public void loginTest(String UserName, String Password, String nonPassword) {
		
		System.out.println("Username is "+ UserName +" and the password is "+Password+"non Password "+nonPassword);
		
	}
	
	@DataProvider
	public Object[][] Params() {
		
		Object[][] data=new Object[3][3];
		
		data[0][0]="VenuGopal";
		data[0][1]="absdjhagshdasd";
		data[0][2]="third one";
		
		data[1][0]="pritham";
		data[1][1]="absdjhagshdasd";
		data[1][2]="third 2";
		
		data[2][0]="govind";
		data[2][1]="absdjhagshdasd";
		data[2][2]="third 3";
		
		System.out.println(data[1][0]);
				
		return data;
		
		
		
		
	}
	
	
	
}
