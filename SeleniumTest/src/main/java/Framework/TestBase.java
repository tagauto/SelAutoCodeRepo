//test base file

package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {
	
	public static WebDriver driver = null;
	
	public void setup() throws IOException
	{
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("..//SeleniumTest//src//main//java//Framework//global.properties");
		p.load(fis);
		System.out.println(p.getProperty("browser"));
		
		if(p.getProperty("browser").contains("chrome"))
		{
			System.out.println("Setting up chrome driver ");
			System.setProperty("webdriver.chrome.driver", "C:\\Apps\\Jars\\chromedriver.exe");
			driver = new ChromeDriver();			
		}
		else if(p.getProperty("browser").contains("FireFox"))
		{
			driver = new FirefoxDriver();
		}
		else if(p.getProperty("browser").contains("InternetExplorer"))
		{
			driver = new InternetExplorerDriver();
		}
		
		driver.get(p.getProperty("url"));

		System.out.println("-------Initiated the URL-----");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	}

}
