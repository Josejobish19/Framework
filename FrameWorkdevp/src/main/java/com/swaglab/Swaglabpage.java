package com.swaglab;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actions.ActionHelper;
import com.actions.AlertFrameWindowHelper;
import com.actions.MouseAction;
import com.actions.SendkeysActionHelper;

public class Swaglabpage {
	

	WebDriver driver;
	ActionHelper ob  = new ActionHelper();
	MouseAction obj = new MouseAction();
	SendkeysActionHelper objk = new SendkeysActionHelper();
	AlertFrameWindowHelper ab = new AlertFrameWindowHelper();
	
	public Swaglabpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//input[@id='user-name']")
	WebElement uname ;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement pass ;
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement login ;
	@FindBy(xpath = "//h3[contains(.,'Epic sadface: Username is required')]")
	WebElement EmptyInputError ;
	@FindBy(xpath = "//h3[contains(.,'Epic sadface: Username and password do not match any user in this service')]")
	WebElement InvalidInputError ;
	@FindBy(xpath = "//span[contains(.,'Products')]")
	WebElement productpage ; 
    @FindBy(xpath = "//h5[contains(.,'Draggable')]")
    WebElement click;
    @FindBy(xpath = "//div[@id=\"draggable\"]")
    WebElement source;
    @FindBy(xpath = "//div[@id = 'droppable']")
    WebElement target;
    
  @FindBy(xpath = "//h5[contains(.,'Droppable')]")
  WebElement Droppable;
  @FindBy(xpath = "//h5[contains(.,'Edit') ]")
  WebElement Editbuttom;
  @FindBy(xpath = "//input[@id ='email']")
  WebElement EditFieild;
  @FindBy(xpath = "//input[@value=\"Clear me!!\"]")
  WebElement ClearFieild;
  @FindBy(xpath = "//h5[contains(.,'Alert')]")
  WebElement AlertButton;
  @FindBy(xpath = "//button[contains(.,'Alert Box')]")
  WebElement AlertBox;
	
	public void typeusername(String username)
	{
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated((By) uname));
		
		uname.clear();
		uname.sendKeys(username);
	}
	
	public void typepassword(String password)
	{
		pass.clear();
		pass.sendKeys(password);
	}
	public void clicklogin() {
		login.click();	
	}
	
	public boolean isEmptyInputDisplayed()
	{
		return EmptyInputError.isDisplayed();
	}
	public boolean isInvalidInputdisplayed() {
		
		return InvalidInputError.isDisplayed();
		
	}
	public boolean isProductTitledispalyed()
	{
		return productpage.isDisplayed();
	}

	public String pageTitle()
	{
		return ob.getPageTitle(driver);
	}
	
	public String PageCurrentUrl()
	{
		return ob.getPageCurrentUrl(driver);
	}
	
	public String Pagesource()
	{
		return ob.getPagesource(driver);
	}
	public void movetoURL(String URL)
	{
		ob.navigateURL(driver, URL);
	}
	public void pageRefresh()
	{
		ob.navigateRefresh(driver);
	}
	public void pageBack()
	{
		ob.navigateBack(driver);
	}
	public void pageForward()
	{
		ob.navigateForward(driver);
	}
	
	public void pageClose()
	{
		ob.navigateclose(driver);
	}
	
	public void pageQuit()
	{
		ob.navigateQuit(driver);
		}
		
		public void pageDragClick()
		{
			obj.mouseClick(driver, click );
		}
		public void pageDragDrop(int A , int B)
		{
			obj.mouseDragDrop(driver, source, A ,B);
			ob.navigateBack(driver);
		}
		public void pagedropSourceToTarget()
		{
			obj.mouseClick(driver, Droppable );
			obj.mouseDragDrop(driver, source , target);
			ob.navigateBack(driver);
		}
		
		public void pageSendKeys(String input)
		{
			obj.mouseClick(driver,Editbuttom);
			objk.sendkeys(driver, EditFieild, input);
			ob.navigateBack(driver);
		}
		public void pageclearAndsendkeys(String input)
		{
			obj.mouseClick(driver,Editbuttom);
			objk.clearAndsendkeys(driver, ClearFieild, input);
			ob.navigateBack(driver);
		}
		public void pageAlert() {
			
			obj.mouseClick(driver,AlertButton);
			obj.mouseClick(driver, AlertBox);
			ab.switchToAlert(driver);
			ab.alertAccept(driver);
			
		}
	}
