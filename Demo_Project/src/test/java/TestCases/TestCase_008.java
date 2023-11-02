package TestCases;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestCase_008 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//Thread.sleep(3000);
		
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(ele1).perform();
		
		WebDriverWait exp_wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		exp_wait.until
		(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"content\"]/div/div[1]/div/a")))).click();
		
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/a")).click();
		//Thread.sleep(3000);
		
		act.contextClick().perform();
		//Thread.sleep(3000);
		
		act.click().perform();
		System.out.println("Left Clicked");

	}

}
