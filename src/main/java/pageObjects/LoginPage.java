package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	By userName = By.xpath("//input[@name='username']");
	By userPassword = By.xpath("//input[@name='password']");
	By login = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
	
	public WebElement userName()
	{
		return driver.findElement(userName);
	}
	
	public WebElement userPassword()
	{
		return driver.findElement(userPassword);
	}
	
	public WebElement login()
	{
		return driver.findElement(login);
	}
	
	
	
	
	
	
	
}
