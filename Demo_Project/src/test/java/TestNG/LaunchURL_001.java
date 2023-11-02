package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaunchURL_001 extends BaseClass{
	
	@Test(priority = 2)
	public void Current_URL()
	{
		String Actual_url=driver.getCurrentUrl();
		System.out.println("Current url is: "+Actual_url);
		Assert.assertEquals(Actual_url, url, "Success");
	}
	
	@Test(priority = 3)
	public void PageTitle()
	{
		String PageTitle=driver.getTitle();
		System.out.println("Page Title of default url is: "+PageTitle);	
	}
	
	@Test(priority = 1)
	public void SignIn_Click()
	{
		WebElement SignIn_ele=driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a"));
		String SignIn_str=SignIn_ele.getText();
		System.out.println("Link name is: "+SignIn_str);
		
		SignIn_ele.click();
	}

}
