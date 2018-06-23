package packageTwo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	/*public static void main(String[] args)
	{
		System.out.println("hi");		
	}*/
	
	
	@BeforeTest
	public void DeleteCookiesAtTestExecutionStart()
	{
		System.out.println("testNGFiles.Annotations.BeforeTest: Delete Cookies - Before starting the test execution");
	}
	
	@AfterTest
	public void DeleteCookiesAtTestExecutionEnd()
	{
		System.out.println("testNGFiles.Annotations.AfterTest: Delete Cookies - After the test execution");
	}
	
	@BeforeMethod
	public void UserIDGeneration()
	{
		System.out.println("testNGFiles.Annotations.BeforeMethod: User ID Generation - this should be executed before each test");
	}
	
	
	@AfterMethod
	public void DeleteUserID()
	{
		System.out.println("testNGFiles.Annotations.AfterMrthod: Delete the User ID - this should be executed after each test");
	}
	
	
	
	@Test
	//this opens the browser
	public void OpeningBrowser()
	{
		
		System.out.println("testNGFiles.Annotations.OpeningBrowser: Opening the Browser");
		
	}	
	
	
	@Test(groups={"Priority1"})
	//Purchase the tickets
	public void FlightBooking()
	{
		System.out.println("testNGFiles.Annotations.FlightBooking: Purchase Tickets");
		
	}
	
	
	@Test(groups={"Priority2"})
	//Purchase the tickets
	public void FlightCancel()
	{
		System.out.println("testNGFiles.Annotations.FlightCancel: Cancel Tickets");
		
	}
	
	@Test(groups={"Priority2", "Priority3"})
	//Purchase the tickets
	public void ListFlightTickets()
	{
		System.out.println("testNGFiles.Annotations.ListFlightTickets: List Flight Tickets");
		
	}
	
	
	
	
	


}
