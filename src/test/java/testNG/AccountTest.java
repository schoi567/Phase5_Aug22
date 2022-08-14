package testNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AccountTest {
	//whenever you make TestNG, then you dont need main 
	
	//  always run in alphanumeric order but you can have set up order as priority 
	
	@BeforeTest
	public void BeforeTest1() {
		System.out.println("Inside BeforeTest1");		
	} 
		
	@BeforeMethod(alwaysRun = true)  //  even if it is exclude you can always run this 
	public void BeforeMethod1() {
		System.out.println("Inside BeforeMethod1");		
	} 
	
	@Test(enabled=true, priority=1, description="This test will be doing something")  // you can either used enabled or the go to testing.xml 
	public void SavingAccountTest1() {
		System.out.println("Inside Saving Acc Test1");  
	} 
	
	@Test(priority=0)  // this says that it will run first 
	public void SavingAccountTest2() {
		System.out.println("Inside Saving Acc Test2");  
		
	} 
	
	
	
	
	@Test (groups = {"sanity, regression"}, priority=2)  // you can put these in multiple groups 
	public void ChekcingAccountTest3() {
		System.out.println("Inside Saving Acc ChekcingAccountTest3");  
		
	} 
	
	
	@AfterMethod
	public void AfterMethod1() {
		System.out.println("Inside AfterMethod1");		
	} 
	
	@AfterTest
	public void AfterTest1() {
		System.out.println("Inside AFterTest1");		
	} 
	
	
	
/*  Before test test only one where as before method test as
	many times 
	*/ 

	
	
	
	
}

































