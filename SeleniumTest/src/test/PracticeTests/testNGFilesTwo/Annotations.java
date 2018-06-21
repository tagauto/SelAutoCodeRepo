package testNGFilesTwo;

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
		System.out.println("testNGFilesTwo.Annotations.BeforeTest: Delete Cookies - Before starting the test execution");
	}
	
	@AfterTest
	public void DeleteCookiesAtTestExecutionEnd()
	{
		System.out.println("testNGFilesTwo.Annotations.AfterTest: Delete Cookies - After the test execution");
	}
	
	@BeforeMethod
	public void UserIDGeneration()
	{
		System.out.println("testNGFilesTwo.Annotations.BeforeMethod: User ID Generation - this should be executed before each test");
	}
	
	
	@AfterMethod
	public void DeleteUserID()
	{
		System.out.println("testNGFilesTwo.Annotations.AfterMrthod: Delete the User ID - this should be executed after each test");
	}
	
	
	
	@Test
	//this opens the browser
	public void OpeningBrowser()
	{
		
		System.out.println("testNGFilesTwo.Annotations.OpeningBrowser: Opening the Browser");
		
	}	
	
	
	@Test
	//Purchase the tickets
	public void FlightBooking()
	{
		System.out.println("testNGFilesTwo.Annotations.FlightBooking: Purchase Tickets");
		
	}
	
	
	
	


}
