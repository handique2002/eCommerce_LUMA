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
		driver.get("https://www.guru99.com/ebook-pdf.html");
		
		List<WebElement> ls=driver.findElements(By.tagName("a"));
		ls.size();
		
		System.out.println("Number of links: "+ls.size());
		
		driver.findElement(By.xpath("//h2[text()=\"Following IT eBooks PDF are included in the Bundle\"]//following::img[1]")).click();
		//System.out.println(driver.getTitle());
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("//strong[text()=\"Python eBook\"]//following::strong[1]")).click();
		//System.out.println(driver.getTitle());		
		Thread.sleep(9000);
		
		String parent_handle=driver.getWindowHandle();
		
		
		
		driver.quit();
		
		
	}

}
