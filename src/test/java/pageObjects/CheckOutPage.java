package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
	
	
	public WebDriver driver;
	
	
	public CheckOutPage(WebDriver driver) {
		
		
		this.driver=driver;
		
		
	}
	
	By dropdown =By.cssSelector(".wrapperTwo div select");
	By checkbox = By.cssSelector(".chkAgree");
	By Proceed = By.xpath("//button[contains(text(),'Proceed')]");
	public WebElement getdropdown()
	
	{
		return driver.findElement(dropdown);
		
	}
	
	public void getcheckbox()
	{
		
		
		driver.findElement(checkbox).click();
		
		
	}
	
	public void proceedbutton()
	{
		
		
		driver.findElement(Proceed).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
