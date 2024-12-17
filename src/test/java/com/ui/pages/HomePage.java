package com.ui.pages;

import org.openqa.selenium.By;

import com.utility.BrowserUtility;

public final class HomePage extends BrowserUtility {
	public HomePage(String browsername) {
		super(browsername);
		goToWebsite("http://www.automationpractice.pl");
		maximise();

	}

	private static final By SIGN_IN_LOCATOR = By.xpath("//a[contains(text(),\"Sign in\")]"); //we declare locators as private static final before using them in page functions
	
	
	public LoginPage GoToLoginPage() {  //page functions should always return a type but not void
		clickSignin(SIGN_IN_LOCATOR); //Calling custom methods(created that uses selenium methods) from page functions 
		LoginPage loginPage =new LoginPage(getDriver());  //we used getter method to use driver instance of BrowserUtility class as it is protected.
		return loginPage;
		
	}
	

}
