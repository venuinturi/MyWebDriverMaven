package Parameterization;

import org.bouncycastle.cms.bc.BcPasswordEnvelopedRecipient;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.ExcelReader;



public class ReadingFromExcel {
	
	ExcelReader er=new ExcelReader("C:\\Users\\ivenugopal\\GitWorkSpace\\MavenGit\\DataReading.xlsx");
	
	@Test (dataProvider="CellReading")
	public void DatinExcel(String UserName, String Password) {
		System.out.println("Username is "+UserName+"\t************ Password is "+Password);
	}
	
	
	@DataProvider
	public Object[][] CellReading() {
		
		String SheetName="Sheet1";
		int rowCount=er.getRowCount(SheetName);
		int colCount=er.getColumnCount(SheetName);
		
		Object[][] ExcelObj=new Object[rowCount-1][colCount];
		
		for(int rowData=2;rowData<=rowCount;rowData++) {
			for(int ColData=0;ColData<colCount;ColData++) {
				
				ExcelObj[rowData-2][ColData]=er.getCellData(SheetName, ColData, rowData);
				
				
				
			}
		}
		
		return ExcelObj;
		
		
		
		
	}
	
	
	
}