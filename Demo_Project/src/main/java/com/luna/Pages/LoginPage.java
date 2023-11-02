package com.luna.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.luna.base.Base_Class;

public class LoginPage extends Base_Class{

	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[2]/a")
	WebElement SignIn_Link;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement username;
	
	@FindBy(xpath="//*[@id=\"pass\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"send2\"]")
	WebElement login_button;
	
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/ul/li[1]/span")
	WebElement LoggedIn_Name;
	
	@FindBy(xpath="/html/body/div[2]/header/div[2]/a/img")
	WebElement logo;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean validate_SignIn_link()
	{
		boolean SignIn_status=SignIn_Link.isDisplayed();
		return SignIn_status;
		
	}
	
	public boolean validate_Logo()
	{
		boolean logo_status=logo.isDisplayed();
		return logo_status;
	}
	
	public String login_name;
	
	public void login(String uname,String passwrd) 
	{
		SignIn_Link.click();
		username.sendKeys(uname);
		password.sendKeys(passwrd);
		login_button.click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		login_name=LoggedIn_Name.getText();
		
		//System.out.println(login_name);	
	}
	
	
	
}
