package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	
	
	public WebDriver driver;
	
	
	
	public OffersPage(WebDriver driver) {
		
		
		this.driver =driver;
		
	}
	
	
	
	
	
	By productname =By.cssSelector("tbody tr td:nth-child(2)");
	By placeorder =By.xpath("//button[contains(text(),'Place Order')]");
	
	
	
	
	public String getproductname() {
		
		
		
		
		return driver.findElement(productname).getText();
		
		
	}
	
	public void orderplace() {
		
		driver.findElement(placeorder).click();
		
	}

}
