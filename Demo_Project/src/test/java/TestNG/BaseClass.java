package TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	WebDriver driver;
	String url;
	//String browser="edge";
	
	
	
	@BeforeMethod
	public void Launch_URL() throws IOException
	{
		System.out.println("Launch URL.");
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\pranj\\eclipse-workspace\\Demo_Project\\"
				+ "src\\main\\java\\com\\luna\\config\\config.properties");
		
		prop.load(fis);
		String url_link=prop.getProperty("url");
		String browser_name=prop.getProperty("browser");
		
		if(browser_name.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser_name.equalsIgnoreCase("Edge"))
		{
			driver=new EdgeDriver();
		}
		
		//driver=new ChromeDriver();
		driver.manage().window().maximize();		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		url="https://magento.softwaretestingboard.com/";		
		driver.get(url);
	}
	
	
	@AfterMethod
	public void TearDown()
	{
		System.out.println("Close the driver browser.");
		driver.quit();
	}
}
