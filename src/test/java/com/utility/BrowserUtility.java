package com.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public abstract class BrowserUtility {

	private WebDriver driver;
	
	public WebDriver getDriver() {
		return driver;
	}

	public BrowserUtility(WebDriver driver) {
		super();
		this.driver = driver;
	}
	public BrowserUtility(String browsername) {
		if(browsername .equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("Edge")){
			driver =new EdgeDriver();
		}
		else {
			System.err.println("Enter valid browser name");
		}
		
	}
	
	public void goToWebsite(String url){
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
	
	public String getVisibleText(By locator) {
		WebElement element=driver.findElement(locator);
		return element.getText();
	}
}
