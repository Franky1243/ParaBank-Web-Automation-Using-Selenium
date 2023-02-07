package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver browserInitialization() throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\Courses\\Selenium Demo Projects to Practice\\RahulShettyAcademyDemoProject\\src\\main\\java\\resources\\file.properties");
		prop = new Properties();
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Courses\\Selenium Demo Projects to Practice\\RahulShettyAcademyDemoProject\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "D:\\Courses\\Selenium Demo Projects to Practice\\RahulShettyAcademyDemoProject\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "D:\\Courses\\Selenium Demo Projects to Practice\\RahulShettyAcademyDemoProject\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public void getScreenshot(String result) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Courses\\Selenium Demo Projects to Practice\\RahulShettyAcademyDemoProject\\Screenshot\\"+result+" Screenshot.png"));
	}
	
	
	
}
