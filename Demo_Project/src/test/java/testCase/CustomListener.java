package testCase;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.luna.base.Base_Class;

public class CustomListener extends Base_Class implements ITestListener{

	public void onTestFailure(ITestResult result) {		
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\pranj\\eclipse-workspace\\Demo_Project\\Screenshot\\"
		+(result.getMethod().getMethodName())+".png");
		
		try {
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}

	public void onTestSuccess(ITestResult result) {
		
	}

}
