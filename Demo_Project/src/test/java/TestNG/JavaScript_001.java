package TestNG;

import java.time.Duration;
import java.util.logging.LogManager;

import org.apache.logging.log4j.core.config.Loggers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.Test;
import org.apache.logging.log4j.*;
import org.apache.logging.log4j.LogManager.*;



public class JavaScript_001 {
	
	//org.apache.logging.log4j.core.Logger;
	//org.apache.logging.log4j.Logger;
	Logger log=org.apache.logging.log4j.LogManager.getLogger(JavaScript_001.class);
	
	@Test
	public void List()
	{
		System.out.println("Test");
		log.info("Start Test!");
		
		WebDriver driver=new ChromeDriver();
		log.info("Launch Browser");
		
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println("Page launched");
		log.info("Browser launched");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.info("Click on SignIn link");
		driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
		log.info("Pause script");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("pranjal.handik620@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement Women_List=driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/span[2]"));
		WebElement Women_Top=driver.findElement(By.xpath("//*[@id=\"ui-id-9\"]"));
		WebElement Women_Jacket=driver.findElement(By.xpath("//*[@id=\"ui-id-11\"]/span"));
		
		System.out.println("Before interaction");
		Boolean Womean_List_status=Women_List.isDisplayed();
		System.out.println("Mid interaction");
		Boolean Womean_Top_status=Women_Top.isDisplayed();
		System.out.println("Before last interaction");
		Boolean Womean_Jacket_status=Women_Jacket.isDisplayed();
		System.out.println("After interaction");
		
		System.out.println(Womean_List_status);
		System.out.println(Womean_Top_status);
		System.out.println(Womean_Jacket_status);
		
		Actions act=new Actions(driver);
					
		//Assert.assertEquals(Womean_List_status, true);
		
		log.info("Hover over");
		act.moveToElement(Women_List).pause(Duration.ofSeconds(4))
		.moveToElement(Women_Top).pause(Duration.ofSeconds(3))
		.moveToElement(Women_Jacket).click()	
		.build().perform();
		
		log.info("Pause script");
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String Current_url=driver.getCurrentUrl();
		String Current_Page_Title=driver.getTitle();
		System.out.println("Current url is: "+Current_url);
		System.out.println("Current url is: "+Current_Page_Title);
		
		driver.quit();
	}

}
