package com.qa.CRM.Mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	private By loginbtn=By.cssSelector("a[href*='ui'");
	private By username=By.name("email");
	private By passsword=By.name("password");
	private By loginfn=By.xpath("//div[contains(@class,'ui fluid large blue submit button')]");
	
	//Getters 
	public WebElement getLoginbtn() {
		return getElement(loginbtn);
	}
	 
	public WebElement getUsername() {
		return getElement(username);
	}
	 
	public WebElement getPasssword() {
		return getElement(passsword);
	}
	 
	public WebElement getLoginfn() {
		return getElement(loginfn);
	}
	 
	public HomePage doLoginByClickOnLoginBtn(String uname, String pwd) {
		getLoginbtn().click();
		waitForPageTitle(username);
		getUsername().sendKeys(uname);
		getPasssword().sendKeys(pwd);
		getLoginfn().click();
		
		return new HomePage(driver);
	}

}
