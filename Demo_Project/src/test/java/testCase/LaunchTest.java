package testCase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.luna.Util.Util;
import com.luna.base.Base_Class;

public class LaunchTest extends Base_Class{
	
	//Util obj1=new Util();
	
	@Test
	public void launch_url() throws IOException
	{
		
		PreConditions();
		
		System.out.println("Add to Github");	
		
		driver.quit();
						
	}

}
