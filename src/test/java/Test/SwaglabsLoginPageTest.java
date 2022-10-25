package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pojo.Browser;
import pom.SwaglabsLoginPage;
import utility.perametrization;
@Listeners(utility.Listener.class)
public class SwaglabsLoginPageTest {

	
	WebDriver driver;
	   @BeforeMethod
	   public void Openbrowser()
	   {
		  driver =  Browser.OpenchromeBrowse();
	   }
	
	   @Test
	   public void SwaglabsloginPageWithValidCreditial() throws EncryptedDocumentException, IOException {
		   SwaglabsLoginPage swaglabsloginpage = new SwaglabsLoginPage  (driver);
		   swaglabsloginpage  .enteruserId( perametrization.getExcelData(0, 1, "Sheet1"));
		   swaglabsloginpage.enterpassword( perametrization.getExcelData(1, 1, "Sheet1"));
		   swaglabsloginpage.clicklogin();	
	   }
	   
	   @Test
	   public void login() {
		   SwaglabsLoginPage swaglabsloginpage = new SwaglabsLoginPage  (driver); 
		   swaglabsloginpage.clicklogin();
		   
	
		   
		   
		   
	   }
	   
	   
}
