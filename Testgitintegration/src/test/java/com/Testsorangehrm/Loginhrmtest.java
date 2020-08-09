package com.Testsorangehrm;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Testbaseintegration.Loginhrmpage;
import com.orangehrm.Basetest;



public class Loginhrmtest {
	
	Loginhrmpage lph;
	
@BeforeMethod
	public void openbrowser() {
		
	Basetest.launchbrowser("https://opensource-demo.orangehrmlive.com/");
		
	}
	
	@Test
	public void getlogin() {
		lph = PageFactory.initElements(Basetest.driver, Loginhrmpage.class);
		lph.login("admin", "admin123");
	}

}
