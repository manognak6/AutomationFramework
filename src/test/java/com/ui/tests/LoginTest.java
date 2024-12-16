package com.ui.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.BrowserUtility;

public class LoginTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		BrowserUtility browserutility = new BrowserUtility(driver);
		browserutility.GoToWebsite("http://www.automationpractice.pl");
		browserutility.maximise();
		
		By signinLocator = By.xpath("//a[contains(text(),\"Sign in\")]");
		browserutility.clickSignin(signinLocator);
	
		By emailTextBoxLocator = By.id("email");	
		browserutility.enterText(emailTextBoxLocator, "bakomam596@skrak.com");		
		By passwordTextBoxLocator = By.id("passwd");	
		browserutility.enterText(passwordTextBoxLocator, "password");
		
		By submitLoginButtonLocator = By.id("SubmitLogin");	
		WebElement SubmitLoginButtonElement=driver.findElement(submitLoginButtonLocator);
		SubmitLoginButtonElement.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
