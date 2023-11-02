package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNG_001 {
	

	@BeforeTest
	public void Pre()
	{
		System.out.println("Precondtion");
	}
	
	@AfterTest
	public void Post()
	{
		System.out.println("Post condition");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("After method");
	}
	
	@Test(priority = 2)
	public void Launch_url()
	{
		System.out.println("Demo Test!");
	}
	
	@Test(priority = 1)
	public void Login()
	{
		System.out.println("Login Test");
	}
	
	
}
