package testNGFilesTwo;

import org.testng.annotations.Test;

public class DependencyAnnotations {
	

	@Test
	//this opens the browser
	public void OpeningBrowser()
	{
		
		System.out.println("testNGFilesTwo.DependencyAnnotations.OpeningBrowser: Executing Opening the Browser");
		
	}	
	
	
	@Test(dependsOnMethods={"OpeningBrowser"}, alwaysRun = true)
	//Purchase the tickets
	public void FlightBooking()
	{
		System.out.println("testNGFilesTwo.DependencyAnnotations.FlightBooking: Purchase Tickets");
		
	}
	
	
	@Test(enabled=true, dependsOnMethods={"FlightBooking"})
	//this opens the browser
	public void Payment()
	{
		
		System.out.println("testNGFilesTwo.DependencyAnnotations.Payment: Executing Payment functionality test");
		
	}	
	
	@Test(timeOut=45000)
	//Purchase the tickets
	public void CreditCardPymentProcessing()
	{
		System.out.println("testNGFilesTwo.DependencyAnnotations.CreditCardPymentProcessing: Processing the credit card payment");
		
	}
	

}
