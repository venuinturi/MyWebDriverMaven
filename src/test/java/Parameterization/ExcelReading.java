package Parameterization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReading {

	public static void main(String[] args) throws IOException {
		
		ExcelReading.ExcelReader("C:\\Users\\ivenugopal\\GitWorkSpace\\MavenGit\\DataReading.xlsx");
	}
	
	public static  void ExcelReader(String Path) throws IOException {
		FileInputStream fis=new FileInputStream(Path);
		//FileOutputStream fos=new FileOutputStream("C:\\Users\\ivenugopal\\GitWorkSpace\\MavenGit\\DataReading.xlsx");
		XSSFWorkbook excelBook=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=excelBook.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
		XSSFCell cell=row.getCell(0);
		
		System.out.println(cell);
	}
}
