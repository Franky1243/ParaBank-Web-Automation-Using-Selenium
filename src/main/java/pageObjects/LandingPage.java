package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By registerButton = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");
	
	public WebElement registerButton()
	{
		return driver.findElement(registerButton);
	}
	
	
	
	
	
}
