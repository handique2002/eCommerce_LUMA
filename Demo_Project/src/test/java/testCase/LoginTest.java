package testCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.luna.Pages.LoginPage;
import com.luna.Util.Util;
import com.luna.base.Base_Class;

import TestNG.JavaScript_001;

import org.apache.logging.log4j.*;

@Listeners(CustomListener.class)
public class LoginTest extends Base_Class{
	
	LoginPage obj1;
	Util obj2;
	Logger log;
	
	@BeforeMethod
	public void launch_URL() throws IOException
	{
	PreConditions();
	 obj1=new LoginPage();
	 obj2=new Util();
	 log=org.apache.logging.log4j.LogManager.getLogger(LoginTest.class);
	 
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test(priority = 1)
	public void Validate_login() throws InterruptedException
	{
		log.info("Login with valid creds");
		obj1.login((prop.getProperty("username")), prop.getProperty("password"));
		Thread.sleep(4000);
		log.info("Pause script");
		
		String Actual_loginName=obj1.login_name;
		System.out.println(Actual_loginName);
		String Expected_loginName="Welcome, Pranjal Handique!";
		
		log.info("Verify correct login");
		Assert.assertEquals(Actual_loginName, Expected_loginName, "Incorrect login credentials.");
		System.out.println("Successfully logged in");
		
		//obj2.Screenshot("Validate_login");	
	}
	
	/*@Test(priority=2)
	public void Validate_invalidLogin() throws InterruptedException
	{
		obj1.login((prop.getProperty("username1")), prop.getProperty("password1"));
		Thread.sleep(4000);
		String Actual_loginName=obj1.login_name;
		System.out.println(Actual_loginName);
		String Expected_loginName="Welcome, Pranjal Handique!";
		
		try {
			Assert.assertEquals(Actual_loginName, Expected_loginName, "Incorrect login credentials.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	
	}*/
	
	@Test(priority=4)
	public void Validate_SignIn_Link()
	{
		boolean Actual_SignInLink=obj1.validate_SignIn_link();
		Assert.assertTrue(Actual_SignInLink,"SignIn link not found");
		System.out.println("SigIn link found");
		
	}
	
	@Test(priority=3)
	public void Validate_logo()
	{
		boolean Actual_Logo_status=obj1.validate_Logo();
		Assert.assertTrue(Actual_Logo_status,"Logo not found");
		System.out.println("Logo found");
		
		
	}
	
}
