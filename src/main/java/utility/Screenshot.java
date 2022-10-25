package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	

	private static final String TestCaseID = null;

	public static void TakesScrenshot (WebDriver driver ,String name ) throws IOException {   
		         			{
				File src =
				((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				File dest = new
				File("H:\\Java\\Selenium\\Screenshot\\TCID"+TestCaseID+".jpg");
				FileHandler.copy(src, dest);
				}
			    }
	
	
	
}
