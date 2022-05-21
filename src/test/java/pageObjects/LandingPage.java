package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver)
	{
		
		this.driver=driver;
		
		
	}
	
	
	By searchitem = By.cssSelector(".search-keyword");
	By veggie= By.cssSelector("h4.product-name");
	By cart =By.cssSelector(".product-action button");
	By carticon = By.xpath("//img[@alt='Cart']");
	By checkout =By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	
	
	
	public void search(String name) {
		
		
		driver.findElement(searchitem).sendKeys(name);
		
		
	}
	
	public String getveggietext()
	{
		
		return driver.findElement(veggie).getText();
		
		
		
	}
	
	public String gettitle()
	{
		
		return driver.getTitle();
		
	}
	
	
	public void addtocart()
	{
		
		
		driver.findElement(cart).click();
	}
	
	public void cartbutton()
	{
		
		driver.findElement(carticon).click();
		
	}
	
	public void checkoutbutton() {
		
		
		driver.findElement(checkout).click();
		
	}
	
	
	
	

}
