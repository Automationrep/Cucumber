package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	
	
	
	
	
	public WebDriver getdriver() throws IOException {
		
		String path =System.getProperty("user.dir")+"/src/test/resources/global.properties";
		
		//System.out.println(path);
		
		FileInputStream fis = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		String browser =prop.getProperty("browser");
		
		if(driver==null) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("firefox")) {
			
			
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}else if(browser.equalsIgnoreCase("edge")) {
			
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		
		
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(prop.getProperty("baseurl"));
		
		}
		
		return driver;
		
		
		
		
		
		
		
		
	}

}
