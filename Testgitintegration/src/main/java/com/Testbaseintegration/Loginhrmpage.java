package com.Testbaseintegration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Loginhrmpage {
	
	@FindBy(how = How.XPATH,using = "//input[@id='txtUsername']")
	 
	 @CacheLookup
	 
	 WebElement username;
	
	@FindBy(how = How.XPATH,using = "//input[@id='txtPassword']")
	 
	 @CacheLookup
	 
	 WebElement pass;
	
	@FindBy(how = How.XPATH,using = "//input[@id='btnLogin']")
	 
	 @CacheLookup
	 
	 WebElement loginbutton;
	
	public void login(String un,String password) {
		
		username.sendKeys(un);
		pass.sendKeys(password);
		loginbutton.click();
	}
	
	
}
