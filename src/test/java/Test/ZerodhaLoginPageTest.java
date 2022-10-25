package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.ZerodhaloginPage;
import utility.perametrization;
@Listeners(utility.Listener.class)
public class ZerodhaLoginPageTest {

	
	WebDriver driver;
	   @BeforeMethod
	   public void Openbrowser()
	   {
		  driver =  Browser.OpenchromeBrowse();
	   }
	
	   @Test(timeOut=1000)
	   public void zerodhaloginPageWithValidCreditial() throws EncryptedDocumentException, IOException, InterruptedException {
		   ZerodhaloginPage zerodhaloginpage = new   ZerodhaloginPage (driver);
		   zerodhaloginpage.enteruserId( perametrization.getExcelData(0, 1, "Sheet1"));
		   zerodhaloginpage.enterpassword( perametrization.getExcelData(1, 1, "Sheet1"));
		   Thread.sleep(5000);
		   zerodhaloginpage.clicklogin();
		
		   
		   
	   }
	    @Test
	    public void sinnup() {
	    	 ZerodhaloginPage zerodhaloginpage = new   ZerodhaloginPage (driver);
	    	 zerodhaloginpage.clicksignup();
	    	 
	    }
	   
	   @Test
	   public void forgot() {
		   ZerodhaloginPage zerodhaloginpage = new   ZerodhaloginPage (driver);
		   zerodhaloginpage.clickforgotid();
	   }
	   
	   
	   
	   
	   
	   
	   
}
