package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrowserUtility {

	private WebDriver driver;

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void GoToWebsite(String url)
{
		driver.get(url);

		
}
	public void maximise() {
		driver.manage().window().maximize();

	}
	public void clickSignin(By locator) {
		WebElement element = driver.findElement(locator);
		element.click();
		
	}
	public void enterText(By locator, String enterText) {
		WebElement element=driver.findElement(locator);
		element.sendKeys(enterText);
	}
}
