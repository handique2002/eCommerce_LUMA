package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchURL {
	
	@Test
	public void Launch_URL()
	{
		System.out.println("Test Launch URL!");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String url="https://magento.softwaretestingboard.com/";		
		driver.get(url);
		
		String Actual_url=driver.getCurrentUrl();
		System.out.println("Current url is: "+Actual_url);
		Assert.assertEquals(Actual_url, url, "Success");
				
		String PageTitle=driver.getTitle();
		System.out.println("Page Title of default url is: "+PageTitle);		
		
		WebElement SignIn_ele=driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
		String SignIn_str=SignIn_ele.getText();
		System.out.println("Link name is: "+SignIn_str);
		
		SignIn_ele.click();
		
		WebElement Create_Link_ele=driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[3]/a"));
		String Create_Link_str=Create_Link_ele.getText();
		System.out.println("Link name is: "+Create_Link_str);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		
		String error_email=driver.findElement(By.xpath("//*[@id=\"email-error\"]")).getText();
		String error_pwd=driver.findElement(By.xpath("//*[@id=\"pass-error\"]")).getText();
		
		System.out.println("Error email is: "+error_email);
		System.out.println("Error pwd is: "+error_pwd);
		
		WebElement CreateAccount_ele=driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[3]/div/div[2]/div[2]/div[2]/div/div/a/span"));
		System.out.println("Click link : "+CreateAccount_ele.getText());
		CreateAccount_ele.click();		
		
		//String CreateAccount_url=CreateAccount_ele.getText();  // stale element reference: stale element not found
		String CreateAccount_url=driver.getCurrentUrl();
		System.out.println("URL is: "+CreateAccount_url);
		
		String CreateAccount_PageTitle=driver.getTitle();
		System.out.println("Page Title is: "+CreateAccount_PageTitle);
		
		//driver.quit();
		
	}

}
