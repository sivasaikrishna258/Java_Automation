package com.qa.CRM.Mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	private By contactlink=By.xpath("(//*[contains(text(),'Contacts')]");
	
	private By User=By.xpath("//*[contains(text(),'Advanapu  Sivasaikrishna ')]");
	
	public WebElement getContactlink() {
		return getElement(contactlink);
	}

	public WebElement getUser() {
		return getElement(User);
	}
	
	public void clickonCalendarlink() {
		waitForPageTitle(User);
		getUser().isDisplayed();
		getContactlink().click();
	}
	
	

}
