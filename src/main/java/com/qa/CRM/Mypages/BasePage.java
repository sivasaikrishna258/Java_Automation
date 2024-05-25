package com.qa.CRM.Mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends page {

	public BasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getpageTitle() {
		return driver.getTitle();
	}

	@Override
	public WebElement getElement(By locator) {
		WebElement element=null;
		try {
		element=driver.findElement(locator);
		return element;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void waitForPageTitle(By locator) {
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
	}

}
