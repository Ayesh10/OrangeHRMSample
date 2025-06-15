package com.DemoOrangeHRM.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	protected WebDriver driver;
	@FindBy(xpath=("//input[@placeholder='Username']"))
	private WebElement userNameInputBox;
	

	@FindBy(xpath=("//input[@placeholder='Password']"))
	private WebElement passwordInputBox;
	@FindBy(xpath=("//button"))
	private WebElement loginButton;
	
	public  LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}

	private WebElement getUserNameInputBox() {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(userNameInputBox));
		return userNameInputBox;
	}

	private WebElement getPasswordInputBox() {
		return passwordInputBox;
	}

	private WebElement getLoginButton() {
		return loginButton;
	}
	public LoginPage enterUserName(String username) {
		getUserNameInputBox().sendKeys(username);
		return this;
	}
	public LoginPage enterPassword(String password) {
		getPasswordInputBox().sendKeys(password);
		return this;
	}
	
	public void clickLogin() {
		getLoginButton().click();
	}
	public void login(String username, String password) {
		
		enterUserName(username);
		enterPassword(password);
		getLoginButton().click();
	}
	


}
