package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwaglabsLoginPage {


	@FindBy(xpath="//input [@id=\"user-name\"]") private WebElement userId;
	@FindBy(xpath="//input [@id=\"password\"]") private WebElement passwoard;
	@FindBy(xpath="//input [@id=\"login-button\"]") private WebElement login;
	 

  public SwaglabsLoginPage(WebDriver driver) 
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
}