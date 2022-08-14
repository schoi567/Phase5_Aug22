package testNG;

import org.testng.annotations.Test;

@Test (groups = {"sanity"}) // you can have it over class, but only the public method within your class will be part of the test, 
public class LoanTest {
	
	@Test (groups = {"sanity"})
	public void PersonalLoanTest1() {
		System.out.println("Inside PL1"); 
		
		
	}  
}


//  Testng packages-> go ahead and run the xml file 
// to create suite -> have all the details that you want to 
// run 





