package TestCases;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestCase_001 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Launch Browser");		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
				
		driver.navigate().to("https://the-internet.herokuapp.com/windows");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Current url is: "+driver.getCurrentUrl());
		System.out.println("Page title is: "+driver.getTitle());
		
		String parent_handle=driver.getWindowHandle();
		System.out.println("Parent handle is: "+parent_handle);
		
		driver.findElement(By.linkText("Click Here")).click();		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Elemental Selenium")).click();		
		Thread.sleep(5000);
		
		Set<String> handles=driver.getWindowHandles();
		System.out.println("Count of tabs: "+handles.size());
		
		ArrayList<String> sl=new ArrayList<>(handles);
		String str1;
		
		for(String handle: handles)
		{
			//boolean status1=driver.getTitle().contains("Elemental Selenium");
			String page_title=driver.switchTo().window(handle).getTitle();
			
			if(page_title.contains("Elemental"))
			{
			
			driver.switchTo().window(handle);
			System.out.println(driver.getTitle());
			
			WebElement ele1=driver.findElement(By.xpath("//input[@type=\"email\" and @id=\"email\"]"));
			ele1.sendKeys("Test");
			
			System.out.println("Entered text is: "+ele1.getText());
			
			Thread.sleep(10);
			
			}
			
		}
		
		driver.switchTo().window(parent_handle);
		System.out.println("Current page title is: "+driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
	}

}
