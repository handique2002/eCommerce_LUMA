package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_004 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.xpath("//span[text()=\"Account\"]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Cancel Ticket\"]")).click();
		
		
		
	}

}
