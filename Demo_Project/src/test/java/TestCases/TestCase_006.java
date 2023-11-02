package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase_006 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		WebElement ele2=driver.findElement(By.id("frm1"));
		driver.switchTo().frame(ele2);
		Thread.sleep(2000);
		
		WebElement ele1=driver.findElement(By.id("selectnav1"));
		ele1.click();
		
		Select sel=new Select(ele1);
		sel.selectByVisibleText("Tutorials");
		
		driver.switchTo().parentFrame();
		WebElement ele3=driver.findElement(By.xpath("//h1[contains(text(),\" Frames Practice\")]"));
		String str1=ele3.getText();
		System.out.println(str1);
		
	}

}
