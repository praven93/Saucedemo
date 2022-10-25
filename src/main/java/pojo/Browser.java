package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

	public static WebDriver  OpenchromeBrowse()
	{
       System.setProperty("webdriver.chrome.driver","F:\\automation\\chrome 105\\chromedriver.exe");
       WebDriver Driver= new ChromeDriver();
		Driver.get("https://kite.zerodha.com/");	
		return Driver;
	}
}
