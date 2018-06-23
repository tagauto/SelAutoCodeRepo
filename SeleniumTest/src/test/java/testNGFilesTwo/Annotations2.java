package testNGFilesTwo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annotations2 {

	@BeforeSuite
	public void InstallSoftware()
	{
		
		System.out.println("@BeforeSuite - This is the first one to get executed in the test suite");
	}
	
	@AfterSuite
	public void UnInstallSoftware()
	{
		
		System.out.println("@AFterSuite - This is the last one to get executed in the test suite");
	}
	
}
