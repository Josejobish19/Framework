package com.actions;

import org.openqa.selenium.WebDriver;


public class AlertFrameWindowHelper {
	
	public void switchToAlert(WebDriver driver )
	{
		try {
			driver.switchTo().alert();
		}
		catch(Exception e)
		{
			System.out.println("Exeption is occured" +e);
		}
	}
	
	public void alertAccept(WebDriver driver )
	{
		try {
			driver.switchTo().alert().accept();
		}
		catch(Exception e)
		{
			System.out.println("Exeption is occured" +e);
		}
	}
	public void alertDismiss(WebDriver driver )
	{
		try {
			driver.switchTo().alert().dismiss();;
		}
		catch(Exception e)
		{
			System.out.println("Exeption is occured" +e);
		}
	}
	
	public void alertSendKeys(WebDriver driver , String value)
	{
		try {
			driver.switchTo().alert().sendKeys(value);
		}
		catch(Exception e)
		{
			System.out.println("Exeption is occured" +e);
		}
	}

}
