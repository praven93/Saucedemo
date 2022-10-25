package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZerodhaloginPage {

	@FindBy(xpath="//input [@id=\"userid\"]") private WebElement userId;
	@FindBy(xpath="//input [@id=\"password\"]") private WebElement passwoard;
	@FindBy(xpath="//button [@class='button-orange wide']") private WebElement login;
	@FindBy(xpath="//a [@class=\"text-light forgot-link\"]") private WebElement forgotIDorpass;
	@FindBy(xpath="//a [@class=\"text-light\"]") private WebElement signup;
	
	public ZerodhaloginPage (WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enteruserId(String user) 
	{
		userId.sendKeys(user);
	}
	
	public void enterpassword(String pass) 
	{
		passwoard.sendKeys(pass);
	}
	
	public void clicklogin() 
	{
       login.click();		
	}
	
	public void clickforgotid() 
	{
		forgotIDorpass.click();
	}
	
	public void clicksignup() 
	{
	   signup.click();	
	}
	
	
	
	
	
	
}
