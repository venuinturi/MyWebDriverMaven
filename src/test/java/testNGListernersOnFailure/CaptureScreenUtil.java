package testNGListernersOnFailure;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.asn1.dvcs.Data;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenUtil extends TestBase {

	
	public static void ScreenshotCap(String path) throws IOException {
		
		//FileInputStream fis=new FileInputStream(Path);
		Date dt=new Date();
		
		
		
		File ScreenFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String DateString=dt.toString().replace(" ", "_").replace(":","_");
		//String DateString=dt.toString().trim();
		//System.out.println(dt);
		
		FileUtils.copyFile(ScreenFile, new File(path+DateString+".jpg"));
		
	}
}
