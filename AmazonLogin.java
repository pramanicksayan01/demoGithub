package pageobjects;
rf
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonLogin {
WebDriver driver;
	
	@FindBy(xpath="//*[@id='glow-ingress-line2']")
	WebElement location;
	
	@FindBy(xpath="//*[@id='GLUXZipUpdateInput']" )
	WebElement inputpin;
	
	@FindBy(xpath="//*[@id='GLUXZipUpdate']//*[contains(@class, 'a-button-input')]")
	WebElement apply;
	
	@FindBy(xpath="//*[@id='twotabsearchtextbox']")
	WebElement searchtextbox;
	
	
	@FindBy(xpath="//*[@id='nav-search-submit-button']")
	WebElement submit;
	
	@FindBy(xpath="//span[contains(text(), 'Samsung Galaxy M32 (Black, 4GB RAM, 64GB Storage) 6 Months Free Screen Replacement for Prime')]")
	WebElement submitoption;
	
	@FindBy(id="add-to-cart-button")
	WebElement addtocartbutton;
	
	@FindBy(xpath="//*[@id='attach-sidesheet-checkout-button']//*[contains(@class, 'a-button-input')]")
	WebElement proceed;
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement con;
	
	 @FindBy(id="ap_password")
	 WebElement pass;
	 
	 @FindBy(id="signInSubmit")
	 WebElement sub;
	public AmazonLogin(WebDriver driver)
	
	{
		 this.driver=driver;
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver,10);
		PageFactory.initElements(driver, this);
	}

	   public WebElement Location()
	    {
		    return location;
	    }
	   public WebElement Inputpin()
	    {
		    return inputpin;
	    }
	   public WebElement Apply()
	    {
		    return apply;
	    }
	   public WebElement SearchBox()
	    {
		     return searchtextbox;
	    }
	  public WebElement Submit()
	    {
		    return submit;
	    }
	  public WebElement submitoption()
	   {
		    return submitoption ;
	   }
	
	public WebElement addtocartbutton()
	{
		return addtocartbutton;
	}
  
   public WebElement Proceed()
   {
	   return proceed;
   }
     public WebElement Email()
     {
    	 return email;
     }
     public WebElement Continue()
     {
    	 return con;
     }
     public WebElement Password()
     {
    	 return pass;
     }
     public WebElement SingIn()
     {
    	 return sub;
     }
     public void getWindowHandle()
     {
   	 Set<String> ids = driver.getWindowHandles();
	    Iterator<String> it = ids.iterator();
	    String parentId = it.next();
	    String childId = it.next();
	    driver.switchTo().window(childId);
   	
   	  
     }
   
}