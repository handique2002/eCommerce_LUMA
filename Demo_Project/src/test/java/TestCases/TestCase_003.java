package TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase_003 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://output.jsbin.com/osebed/2");
		
		WebElement ele1=driver.findElement(By.id("fruits"));
		Select sel1=new Select(ele1);
		String ListName=ele1.getText();
		System.out.println(ListName);
		
		//WebElement ele2=sel1.getFirstSelectedOption();
		
		sel1.selectByIndex(1);
		//sel1.deselectByIndex(1);
		
		sel1.selectByValue("grape");
		sel1.selectByVisibleText("Orange");

		//sel1.deselectAll();
		
		List<WebElement> ele2=sel1.getAllSelectedOptions();
		int size=ele2.size();
		System.out.println(size);
			
		for(int i=0;i<size;i++)
		{
			String str2=ele2.get(i).getText();
			System.out.println("Selected list values are: "+ str2);
		}
		
		
		
	}

}
