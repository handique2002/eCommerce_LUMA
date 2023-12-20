package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestCase_001 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Launch Browser");		
		
		WebDriver driver=new ChromeDriver();
		TakesScreenshot ts=(TakesScreenshot)driver;
		ts.getScreenshotAs(null);
		
		
		RemoteWebDriver rw=new ChromeDriver();
		rw.getScreenshotAs(null);
		
		
		ChromiumDriver cd=new ChromeDriver();
		cd.getScreenshotAs(null);
		
		ChromeDriver cdr=new ChromeDriver();
		cdr.getScreenshotAs(null);
		
		
		
		
	}

}
