package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightFinder {
	
	WebDriver driver;
	
	By continueButton = By.xpath("//input[@name='findFlights']");
	
	public void findFlight()
	{
		driver.findElement(continueButton).click();
		
	}
	
	
	public FlightFinder(WebDriver driver)
	{
		this.driver = driver;
	}
	
	

}
