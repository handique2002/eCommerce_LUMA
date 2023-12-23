package com.luna.Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.luna.Util.Util;
import com.luna.base.Base_Class;

public class HomePage extends Base_Class{
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
	WebElement LoginLabel;
	
	@FindBy(xpath="//*[@id=\"ui-id-4\"]/span[2]")
	WebElement WomenDropList;
	
	@FindBy(xpath="//*[@id=\"ui-id-9\"]")
	WebElement WomenTop;
	
	@FindBy(xpath="//*[@id=\"ui-id-11\"]/span")
	WebElement WomenJacket;
	
	Actions act=new Actions(driver);
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String PageTitle()
	{
		String PageTitle=driver.getTitle();
		return PageTitle;
	}
	
	public WebElement LabelName()
	{
		//LoginLabel.getText();
		return LoginLabel;
	}
	
	Util utl=new Util();
	
	public void WomenTop()
	{
		/*act.moveToElement(WomenDropList).pause(Duration.ofSeconds(2)).
		moveToElement(WomenTop).pause(Duration.ofSeconds(2)).
		moveToElement(WomenJacket).pause(Duration.ofSeconds(2)).
		click().build().perform();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String PageTitle1=driver.getTitle();
		System.out.println(PageTitle1);*/
		
		utl.Hover(WomenDropList,WomenTop,WomenJacket);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String PageTitle1=driver.getTitle();
		System.out.println(PageTitle1);
		
	}
	
	
}
