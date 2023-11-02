package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCase_001 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//WebDriverManager.chromedriver().setup();
		System.out.println("Launch Browser");
		
		WebDriver driver=new ChromeDriver();
		//WebDriver driver= new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String PageTitle=driver.getTitle();
		System.out.println(PageTitle);
		
		System.out.println("Browser Launched");
		
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@name=\"password\"]//following::button[1]")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class=\"oxd-userdropdown-link\"]/following::a[3]")).click();
		
		Thread.sleep(3000);
		driver.quit();

	}

}
