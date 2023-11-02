package TestCases;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_007 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),\"Click\")]")).click();
		
		Thread.sleep(2000);
		
		Set<String> set1=driver.getWindowHandles();
		int size=set1.size();
		System.out.println(size);
		
		Iterator<String> iterator=set1.iterator();
		String parent_window=iterator.next();
		String child_window=iterator.next();
		
		driver.switchTo().window(child_window);
		String str1=driver.findElement(By.xpath("//h3[contains(text(),\"New\")]")).getText();
		System.out.println(str1);
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),\"Elemental\")]")).click();
		
		
		

	}

}
