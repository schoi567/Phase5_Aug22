package appTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotExample {

	public static void main(String[] args) throws IOException {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			
			
	 		FirefoxDriver driver = new FirefoxDriver(); 
//			ChromeDriver driver = new ChromeDriver(); 
			driver.get("https://www.simplilearn.com/"); 
			
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 	
			
			TakesScreenshot obj = (TakesScreenshot) driver; 
			File file = obj.getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(file, new File("image.png")); 
			
			
			
			

	}

}









