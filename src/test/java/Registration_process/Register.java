package Registration_process;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import pageObjects.SignUpPage;
import resources.Base;

public class Register extends Base{

	@BeforeTest
	public void initialize() throws IOException
	{
		driver = browserInitialization();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void registerUser() throws InterruptedException
	{
		
		LandingPage LandingPageObject = new LandingPage(driver);
		LandingPageObject.registerButton().click();
		
		SignUpPage SignUpPageObject = new SignUpPage(driver);
		SignUpPageObject.firstName().sendKeys("Sohel");
		SignUpPageObject.lastName().sendKeys("Sarker");
		SignUpPageObject.address().sendKeys("Tushardhara R/A");
		SignUpPageObject.city().sendKeys("Narayanganj");
		SignUpPageObject.state().sendKeys("Dhaka");
		SignUpPageObject.zipCode().sendKeys("1259");
		SignUpPageObject.phoneNumber().sendKeys("01884107989");
		SignUpPageObject.ssn().sendKeys("1243");
		SignUpPageObject.userName().sendKeys("mikeykun1243");
		SignUpPageObject.password().sendKeys("sohel123456");
		SignUpPageObject.confirmPassword().sendKeys("sohel123456");
		SignUpPageObject.register().click();
		Thread.sleep(3000);
		SignUpPageObject.logout().click();
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		
		driver = null;
	}
}
