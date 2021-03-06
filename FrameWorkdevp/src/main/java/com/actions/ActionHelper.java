package com.actions;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class ActionHelper {

	
	public void LaunchUrl(WebDriver driver , String url) {
		
		try {
			driver.get(url);
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.manage().window().maximize();}
		
			catch (Exception e) {
				
				System.out.println("Exceptiom occured" +e);
				// TODO: handle exception
			}
		}
	public String getPageTitle(WebDriver driver ) {
		String title = "";
		try {
			
			title = driver.getTitle() ;
		}
		
			catch (Exception e) {
				
				System.out.println("Exceptiom occured" +e);
				// TODO: handle exception
			}
		return title;
}
		
		public String getPageCurrentUrl(WebDriver driver ) {
			
			 String PageCurrentUrl ="";
			 
			try {
				PageCurrentUrl = driver.getCurrentUrl() ;
				}
			
				catch (Exception e) {
					
					System.out.println("Exceptiom occured" +e);
					// TODO: handle exception
				}
			return PageCurrentUrl;
		}
		

		public String getPagesource(WebDriver driver ) {
			String GetPagesource="";
			try {
				GetPagesource = driver.getPageSource() ;
				}
			
				catch (Exception e) {
					
					System.out.println("Exceptiom occured" +e);
					// TODO: handle exception
				}
			return GetPagesource;
		}
	
		public void navigateURL(WebDriver driver  ,	String URL)
		{
	
		try {
			if(driver != null)
			{
				driver.navigate().to(URL);
			}
			else {
				System.out.println("Navigation Exception");
				
			}
				
			}
		
			catch (Exception e) {
				
				System.out.println("Exceptiom occured" +e);
				// TODO: handle exception
			}
		}
		

			public void navigateRefresh(WebDriver driver ) {
			
				try {
					
					driver.navigate().refresh(); 
				}
				
					catch (Exception e) {
						
						System.out.println("Exceptiom occured" +e);
						// TODO: handle exception
					}
			
		}
			
			public void navigateBack(WebDriver driver)
			{
				try {
					driver.navigate().back();
				}
				catch (Exception e) {
					
					System.out.println("Exceptiom occured" +e);
					// TODO: handle exception
				}
				
			}

			public void navigateForward(WebDriver driver)
			{
				try {
					driver.navigate().forward();
				}
				catch (Exception e) {
					
					System.out.println("Exceptiom occured" +e);
					// TODO: handle exception
				}
				
			}
			
			public void navigateclose(WebDriver driver)
			{
				try {
					driver.close();;
				}
				catch (Exception e) {
					
					System.out.println("Exceptiom occured" +e);
					// TODO: handle exception
				}
				
			}
			public void navigateQuit(WebDriver driver)
			{
				try {
					driver.quit();
				}
				catch (Exception e) {
					
					System.out.println("Exceptiom occured" +e);
					// TODO: handle exception
				}
				
			}
			
		}
	

