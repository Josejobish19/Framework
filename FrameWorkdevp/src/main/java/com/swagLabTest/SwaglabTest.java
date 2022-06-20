package com.swagLabTest;



import org.testng.annotations.Test;


import com.swaglab.Swaglabpage;

public class SwaglabTest extends SwagBaseTest{
	Swaglabpage page1;


	
	
	@Test(priority = 1 )
public void getMethods()
{
	
		page1 = new Swaglabpage(driver);
		
		
		/**PAGE TITLE*/
	System.out.println("page title is "+page1.pageTitle());
		
/*PAGE CURRENT URL*/
	System.out.println("PAGE CURRENT URL is "+page1.PageCurrentUrl());
	
	/**PAGE SOURCE*/
	System.out.println("PAGE SOURCE URL is "+page1.Pagesource());
	
}
	@Test(priority = 2)
	public void navigationCommands() throws InterruptedException
	{
		page1 = new Swaglabpage(driver);
		
		/*NAVIGATETOURL*/
		page1.movetoURL("http://www.leafground.com/");
		
		Thread.sleep(2000);
		
		/*NAVIGATEREFRESH*/
		page1.pageRefresh();
		
		//NAVIGATE BACK
		page1.pageBack();
		
		Thread.sleep(2000);
		
		//NAVIGATE FORWARD
	page1.pageForward();
		
	}
	@Test(priority = 3 , enabled = false)
	public void navigateCloseQuitCOMMAND() {
		
	
		//NAVIGATE CLOSE
		page1.pageClose();
		
		//NAVIGATE Quit
		
		page1.pageQuit();
		
	}
	@Test(priority = 4)
	public void checkMouseAction()
	{
		page1.pageDragClick();
	}
	@Test(priority = 5)
	public void testDragDrop()
	{
		page1.pageDragDrop(100, 200);
	}
	@Test(priority = 6)
	public void testdropSourceToTarget()
	{
		page1.pagedropSourceToTarget();
	}
	@Test(priority = 7)
	public void testSendKeys()
	{
		page1.pageSendKeys("Hello jobish. you are great");
	}
	@Test(priority = 8)
	public void testclearAndsendkeys()
	{
		page1.pageclearAndsendkeys("Hello jobish. you are great");
	}
	@Test(priority = 9)
	
		public void testAlert()
		{
			page1.pageAlert();
		}
	}

