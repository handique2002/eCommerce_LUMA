package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TextCase_006 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/radio.html");
		Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//input[@type=\"radio\" and @id=\"vfb-7-2\"]")).click();
		//driver.findElement(By.xpath("//input[@type=\"radio\" and @id=\"vfb-7-3\"]")).click();
		
		//driver.findElement(By.id("vfb-6-1")).click();
		Thread.sleep(1000);
		WebElement ele1=driver.findElement(By.id("vfb-6-1"));
		String str1=ele1.toString();
		String str2=ele1.getAttribute("value");
		//System.out.println(str1);
		System.out.println(str2);
		boolean status1=ele1.isDisplayed();
		boolean status2=ele1.isEnabled();
		boolean status3=ele1.isSelected();
		System.out.println(status1+" "+status2+" "+status3);
		
		/*WebElement ele3=driver.findElement(By.id("vfb-6-2"));
		Actions act=new Actions(driver);
		act.moveToElement(ele3).click().perform();*/
		
		
		
		
	}

}
