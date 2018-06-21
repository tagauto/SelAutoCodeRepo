package testNGFiles;

import org.testng.annotations.Test;

public class DependencyAnnotations {
	

	@Test
	//this opens the browser
	public void OpeningBrowser()
	{
		
		System.out.println("testNGFiles.DependencyAnnotations.OpeningBrowser: Executing Opening the Browser");
		
	}	
	
	
	@Test(dependsOnMethods={"OpeningBrowser"}, alwaysRun = true)
	//Purchase the tickets
	public void FlightBooking()
	{
		System.out.println("testNGFiles.DependencyAnnotations.FlightBooking: Purchase Tickets");
		
	}
	
	
	@Test(enabled=true, dependsOnMethods={"FlightBooking"})
	//this opens the browser
	public void Payment()
	{
		
		System.out.println("testNGFiles.DependencyAnnotations.Payment: Executing Payment functionality test");
		
	}	
	
	@Test(timeOut=45000)
	//Purchase the tickets
	public void CreditCardPymentProcessing()
	{
		System.out.println("testNGFiles.DependencyAnnotations.CreditCardPymentProcessing: Processing the credit card payment");
		
	}
	

}
