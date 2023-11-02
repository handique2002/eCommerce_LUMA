package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase_002 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		By loc1=By.xpath("//input[@type=\"text\" and @name=\"lastname\"]");
		driver.findElement(loc1).sendKeys("test");
		
		By loc2=By.xpath("//input[@type=\"text\" and @name=\"firstname\"]");
		driver.findElement(loc2).sendKeys("Demo");
		
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("arguments[0].scrollIntoView();", ele1);
		//js.executeScript("window.scrollBy(0,1000)");
		//System.out.println("Scrolled Down");
		
		Thread.sleep(2000);
		
		WebElement ele1=driver.findElement(By.xpath("//button[@name=\"websubmit\"]"));
		ele1.click();
		
		WebElement ele2=driver.findElement(By.xpath("//select[@name=\"birthday_day\" and @title=\"Day\"]"));
		WebElement ele3=driver.findElement(By.xpath("//select[@name=\"birthday_month\" and @title=\"Month\"]"));
		
		Select sel1=new Select(ele2);
		sel1.selectByIndex(1);
		
		Select sel2=new Select(ele3);
		sel2.selectByIndex(2);
		
		Thread.sleep(3000);
		
		Select sel3=new Select(ele2);
		sel3.selectByIndex(2);
		
		Select sel4=new Select(ele3);
		sel4.selectByIndex(5);
		//sel4.
		
		//String str1=sel4.toString();
		//System.out.println(str1);
		
		List<WebElement> list1=sel2.getOptions();
		
		for(int i=0;i<list1.size();i++)
		{
			String MonthName=list1.get(i).getText();
			//System.out.println(MonthName);
			
			if(MonthName.equalsIgnoreCase("Mar"))
			{
				sel2.selectByVisibleText("Mar");
				System.out.println("Mar selected");
				break;
			}
			else
			{
				System.out.println("Mar not present in list");
			}
		}
		
		Thread.sleep(3000);
		
		//driver.close();

	}

}
