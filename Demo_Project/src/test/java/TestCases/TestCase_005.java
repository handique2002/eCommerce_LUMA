package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase_005 {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		List<WebElement> ele1=driver.findElements(By.tagName("a"));
		int size=ele1.size();
		
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			String LinkName=ele1.get(i).getText();
			String Link=ele1.get(i).getAttribute("href");
			System.out.println(LinkName);
			System.out.println(Link);
			
		}
		
		
	}

}
