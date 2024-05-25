package com.qa.CRM.Mypages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class page {
	WebDriver driver;
	WebDriverWait wait;
	
	public page(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(this.driver, Duration.ofSeconds(30));
		
	}
	
	public abstract String getpageTitle();
	
	public abstract WebElement getElement(By locator);

	public abstract void waitForPageTitle(By locator);

}
