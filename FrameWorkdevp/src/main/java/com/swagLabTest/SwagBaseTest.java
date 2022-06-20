package com.swagLabTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.actions.ActionHelper;
public class SwagBaseTest{
	WebDriver driver;
	
	@BeforeTest
	public void launch()
	{
		ActionHelper ob = new ActionHelper();
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver\\CHromeDriver_102\\chromedriver.exe");
		driver = new ChromeDriver();
		ob.LaunchUrl(driver, "https://www.saucedemo.com/");
		
	
		
		}

}
