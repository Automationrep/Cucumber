package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils {
	
	 public WebDriver driver;
	
	
	public GenericUtils(WebDriver driver) {
		
		this.driver =driver;
		
		
	}
	
	
	
	
	
	
	
	
	public void selectbyvalue(WebElement element,String value) {
		
		
		Select sel = new Select(element);
		sel.selectByValue(value);
						
						
						
		
		
	}

}
