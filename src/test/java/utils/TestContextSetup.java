package utils;

import java.io.IOException;

import pageObjects.PageObjectManager;

public class TestContextSetup {
	
	public TestBase testBase;
	
	public PageObjectManager pageObjectManager;
	public GenericUtils genericUtils;
	public String landingpageproductname;
	
	
	public TestContextSetup() throws IOException {
		
		
		testBase =new TestBase();
		pageObjectManager = new PageObjectManager(testBase.getdriver());
		genericUtils =new GenericUtils(testBase.getdriver());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
