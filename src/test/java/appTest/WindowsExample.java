package appTest;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","chromedriver.exe"); 
	 	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	 	
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.get("https://demoqa.com/browser-windows"); 
		
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS); 		
	 	
		String ParentWin = driver.getWindowHandle(); 
		
		System.out.println("Before clicking new button: " + ParentWin); 
		
		WebElement Tab = driver.findElement(By.id("tabButton"));
		Tab.click(); 
		
		Set<String> handles = driver.getWindowHandles(); 
		Iterator<String> itr = handles.iterator(); 
		
		while(itr.hasNext()) {
			String currentHandle = itr.next(); 
			System.out.println(currentHandle); 
			if (!currentHandle.equals(ParentWin)) {	
				driver.switchTo().window(currentHandle); 
				break; 
				
				} 
		} 
		
		WebElement ChildWinElem = driver.findElement(By.tagName("h1"));
		System.out.println("Text on new window is: " + ChildWinElem.getText()); 
//      driver.close(); 
        
        driver.switchTo().window(ParentWin); 
		System.out.println("Back to Parent window");
		System.out.println(ParentWin);    
 	
//		driver.close(); 
		
		
		
		
		
	}

}

/*
 
It's an abstract reference value to a resource, often memory or an open file, or a pipe.
Properly, in Windows, (and generally in computing) a handle is an abstraction which hides a real memory 
address from the API user, allowing the system to reorganize physical memory transparently to the program. 
Resolving a handle into a pointer locks the memory, and releasing the handle invalidates the pointer. 
In this case think of it as an index into a table of pointers... 
you use the index for the system API calls, and the system can change the pointer in the table at will.
Alternatively a real pointer may be given as the handle when the API writer intends that the user of the API 
be insulated from the specifics of what the address returned points to; 
in this case it must be considered that what the handle points to may change at any time 
(from API version to version or even from call to call of the API that returns the handle) - the handle 
should therefore be treated as simply an opaque value meaningful only to the API.

I should add that in any modern operating system, even the so-called "real pointers" are still opaque handles into the virtual memory space of the process, which enables the O/S to manage and rearrange memory without invalidating the pointers within the process.
*/ 



 






//

