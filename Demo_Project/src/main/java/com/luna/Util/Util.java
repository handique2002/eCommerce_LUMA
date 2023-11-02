package com.luna.Util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.luna.base.Base_Class;

public class Util extends Base_Class{
	
	Actions act=new Actions(driver);
	
	
	public void Hover(WebElement ele1,WebElement ele2,WebElement ele3)
	{
		//act=new Actions(driver);
		
		act.moveToElement(ele1).pause(Duration.ofSeconds(3)).
		moveToElement(ele2).pause(Duration.ofSeconds(3)).
		moveToElement(ele3).pause(Duration.ofSeconds(3)).
		click().build().perform();
	}
	
	/*public void Screenshot(String sname)
	{
		TakesScreenshot ss=(TakesScreenshot) driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\pranj\\eclipse-workspace\\Demo_Project\\Screenshot\\"+sname+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}*/
	
}
