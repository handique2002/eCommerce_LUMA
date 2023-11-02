package com.luna.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class Base_Class {

	public static WebDriver driver;
	public Properties prop;
		
		public void PreConditions() throws IOException
		{
		
		prop=new Properties();
		FileInputStream fs=new FileInputStream("C:\\Users\\pranj\\eclipse-workspace\\"
				+ "Demo_Project\\src\\main\\java\\com\\luna\\config\\config.properties");
		prop.load(fs);
		
		String url_id=prop.getProperty("url");
		System.out.println(url_id);
		
		String browser_name=prop.getProperty("browser");
		System.out.println(browser_name);
		
		if(browser_name.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browser_name.equals("Edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser_name.equals("safari"))
		{
			driver=new SafariDriver();
		}
		else
		{
			System.out.println("Invalid Browser");
		}
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url_id);
		
		
	}

}
