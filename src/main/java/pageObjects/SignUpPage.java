package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {

	public WebDriver driver;
	
	public SignUpPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By firstName = By.id("customer.firstName");
	By lastName = By.id("customer.lastName");
	By address = By.id("customer.address.street");
	By city = By.id("customer.address.city");
	By state = By.id("customer.address.state");
	By zipCode = By.id("customer.address.zipCode");
	By phoneNumber = By.id("customer.phoneNumber");
	By ssn = By.id("customer.ssn");
	By userName = By.id("customer.username");
	By password = By.id("customer.password");
	By confirmPassword = By.id("repeatedPassword");
	By register = By.xpath("//*[@id=\"customerForm\"]/table/tbody/tr[13]/td[2]/input");
	By logout = By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a");
	
	public WebElement firstName()
	{
		return driver.findElement(firstName);
	}
	
	public WebElement lastName()
	{
		return driver.findElement(lastName);
	}
	
	public WebElement address()
	{
		return driver.findElement(address);
	}
	
	public WebElement city()
	{
		return driver.findElement(city);
	}
	
	public WebElement state()
	{
		return driver.findElement(state);
	}
	
	public WebElement zipCode()
	{
		return driver.findElement(zipCode);
	}
	
	public WebElement phoneNumber()
	{
		return driver.findElement(phoneNumber);
	}
	
	public WebElement ssn()
	{
		return driver.findElement(ssn);
	}
	
	public WebElement userName()
	{
		return driver.findElement(userName);
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement confirmPassword()
	{
		return driver.findElement(confirmPassword);
	}
	
	public WebElement register()
	{
		return driver.findElement(register);
	}
	
	public WebElement logout()
	{
		return driver.findElement(logout);
	}
	
	
	
}
