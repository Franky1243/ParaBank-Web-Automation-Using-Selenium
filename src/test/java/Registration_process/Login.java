package Registration_process;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.Base;

public class Login extends Base{

	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver = browserInitialization();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test
	public void login() throws InterruptedException, IOException
	{
		LoginPage LoginPageObject = new LoginPage(driver);
		LoginPageObject.userName().sendKeys("mikeykun1243");
		LoginPageObject.userPassword().sendKeys("sohel123456");
		LoginPageObject.login().click();
		
		Thread.sleep(2000);
		getScreenshot("Account Created Successfully");
		
		
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
		driver = null;
	}
	
}
