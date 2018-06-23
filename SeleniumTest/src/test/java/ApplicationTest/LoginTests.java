package ApplicationTest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Framework.TestBase;
import ObjectRepository.*;

import ObjectRepository.LoginPage;

public class LoginTests extends TestBase {
	
	
	//WebDriver driver;
	
	
	
	
	
	@Test
	public void ALoginTest() throws IOException
	{
		System.out.println("-------Started test cases-----");
		//WebDriver driver = new ChromeDriver();
		//Login to application
		setup();
		System.out.println("-------I am in the test cases-----");
		LoginPage lp = new LoginPage(driver);
		FlightFinder ff = new FlightFinder(driver);
		lp.setuserName("Automationtester");
		lp.setPassword("test@123");
		lp.signIn();
		ff.findFlight();
	}

	
	/*@Test
	public void BFindFlight()
	{
		//Login to application
		
		FlightFinder lp = new FlightFinder(driver);
		lp.findFlight();
	}*/
	
	
	
}
