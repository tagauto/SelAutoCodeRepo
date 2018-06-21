package DataDrive;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations {
	
	/*public static void main(String[] args)
	{
		System.out.println("hi");		
	}*/
	
	
	@BeforeTest
	public void DeleteCookiesAtTestExecutionStart()
	{
		System.out.println("DataDrive.Annotations.BeforeTest: Delete Cookies - Before starting the test execution");
	}
	
	@AfterTest
	public void DeleteCookiesAtTestExecutionEnd()
	{
		System.out.println("DataDrive.Annotations.AfterTest: Delete Cookies - After the test execution");
	}
	
	@BeforeMethod
	public void UserIDGeneration()
	{
		System.out.println("DataDrive.Annotations.BeforeMethod: User ID Generation - this should be executed before each test");
	}
	
	
	@AfterMethod
	public void DeleteUserID()
	{
		System.out.println("DataDrive.Annotations.AfterMrthod: Delete the User ID - this should be executed after each test");
	}
	
	@Test(dataProvider ="getData" )
	public void UserID(String userName, String fullName, String address)
	{
		System.out.println("---- DataDrive.Annotations.UserID: Test Start -----");
		System.out.println("DataDrive.Annotations.UserID. userName: " + userName);
		System.out.println("DataDrive.Annotations.UserID.fullName: " + fullName);
		System.out.println("DataDrive.Annotations.UserID.address: " + address);
		System.out.println("---- DataDrive.Annotations.UserID: Test End -----");
		
	}
	
	@Test
	@Parameters({"adminUserid"})
	//Purchase the tickets
	public void FlightBookingUsingAdmin(String userID)
	{
		System.out.println("---- DataDrive.Annotations.FlightBookingUsingAdmin: Test Start -----");
		System.out.println("testNGFiles.Annotations.FlightBookingUsingAdmin: Purchase Tickets: " + userID);
		System.out.println("---- DataDrive.Annotations.FlightBookingUsingAdmin: Test End -----");
		
	}
	
	
	@Test
	//this opens the browser
	public void OpeningBrowser()
	{
		
		System.out.println("testNGFiles.Annotations.OpeningBrowser: Opening the Browser");
		
	}	
	
	
	@Test
	//Purchase the tickets
	public void FlightBooking()
	{
		System.out.println("testNGFiles.Annotations.FlightBooking: Purchase Tickets");
		
	}
	
	
	
	@DataProvider
	public Object[][] getData()
	{
		/*//i= number of times the test to be repeated
		//j= number of data parameters
		Object[][] data= new Object[i][j];*/
		
		Object[][] data= new Object[3][3];
		
		data[0][0] = "abcd1";
		data[0][1] = "vxyz1";
		data[0][2] = "12341";
		
		data[1][0] = "abcd2";
		data[1][1] = "vxyz2";
		data[1][2] = "12342";
		
		data[2][0] = "abcd3";
		data[2][1] = "vxyz3";
		data[2][2] = "12343";
		
		return data;
		
	}


}
