package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_009 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",ele1);
		Thread.sleep(3000);
		String str1=driver.switchTo().alert().getText();
		System.out.println(str1);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement ele2=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[2]/button"));
		js.executeScript("arguments[0].click();", ele2);
		Thread.sleep(2000);
		
		String str2=driver.switchTo().alert().getText();
		System.out.println(str2);
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement ele4=driver.findElement(By.xpath("//*[@id=\"result\"]"));
		String str4=ele4.getText();
		System.out.println(str4);
		Thread.sleep(2000);
		
		WebElement ele5=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button"));
		js.executeScript("arguments[0].click();", ele5);
		Thread.sleep(2000);
		String str6=driver.switchTo().alert().getText();
		System.out.println(str6);
		driver.switchTo().alert().sendKeys("Test Demo");
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		WebElement ele7=driver.findElement(By.xpath("//*[@id=\"result\"]"));
		String str7=ele7.getText();
		System.out.println(str7);
		
		System.out.println("Testing!");
		//driver.quit();

	}

}
