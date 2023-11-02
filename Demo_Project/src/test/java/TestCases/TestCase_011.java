package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_011 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://the-internet.herokuapp.com/");
		
		WebElement ele1=driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[8]/a"));
		String str1=ele1.getText();
		System.out.println(str1);
		ele1.click();
		Thread.sleep(3000);
		
		//driver.switchTo().alert().dismiss();*/
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth");
		
		System.out.println("Done");

	}

}
