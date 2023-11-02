package testCase;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luna.Pages.HomePage;
import com.luna.Pages.LoginPage;
import com.luna.base.Base_Class;

public class HomeTest extends Base_Class{
	
	HomePage obj1;
	LoginPage obj2;
		
	@BeforeMethod
	public void launchURL() throws IOException, InterruptedException
	{
		PreConditions();
		obj1=new HomePage();
		obj2=new LoginPage();
		
		obj2.login(prop.getProperty("username"), prop.getProperty("password"));
		//String str_name=obj2.login_name;
		//System.out.println(str_name);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void Validate_PageTitle() throws InterruptedException
	{
		
		System.out.println(obj1.PageTitle());
		String ActualPageTitle=obj1.PageTitle();
		String ExpectedPageTitle="Home Page";
		Assert.assertEquals(ActualPageTitle, ExpectedPageTitle,"Page Title do not match");
		System.out.println("Page title match");
	}
	
	@Test
	public void Validate_LabelName() throws InterruptedException
	{
		boolean LabelName_status=obj1.LabelName().isDisplayed();
		System.out.println(LabelName_status);
		assertEquals(LabelName_status, true,"Label not displayed");
		System.out.println("Label is displayed");
		
		
		/*obj2.login(prop.getProperty("username"), prop.getProperty("password"));
		String str_name=obj2.login_name;
		System.out.println(str_name);
		
		String Actual_LabelName=obj1.LabelName();
		String Expected_LabelName="Welcome, Pranjal Handique!";
		
		Assert.assertTrue(Expected_LabelName.contains("Welcome"));*/
		
	}
	
	@Test
	public void Validate_womenTop()
	{
		obj1.WomenTop();
		String Expected_WomenTop="Jackets - Tops - Women";
		Assert.assertEquals(Expected_WomenTop, obj1.PageTitle(),"Page title do not match");
		System.out.println("Page title match");
	}
	
	

}
