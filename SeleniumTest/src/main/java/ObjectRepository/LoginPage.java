package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	//By userName = By.name("userName");
	By userName = By.xpath("//input[@name='userName']");
	
	By password = By.xpath("//input[@name='password']");
	
	By login = By.xpath("//input[@name='login']");
	
	
	public LoginPage(WebDriver driver) {    
		//WebDriver driver - this driver will be coming from test case. driver will be a ChromeDriver or FireFoxDriver or other based on the test case
		
		this.driver = driver;
	}
	
	public void setuserName(String userID)
	{
		driver.findElement(userName).sendKeys(userID);		
		
	}
	
	
	public void setPassword(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);		
		
	}
	
	
	public void signIn()
	{
		driver.findElement(login).click();
		
	}
	
	
	

}
