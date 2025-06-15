package com.DemoOrangeHRM.pages.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.DemoOrangeHRM.pages.BasePage;

public class JobTitlesPage extends BasePage{
	@FindBy(xpath = "//input[@placeholder='Job Title']") 
	private WebElement jobTitlePage;
	@FindBy(xpath = "//button") 
	private WebElement addButton;


	public JobTitlesPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	} 
	public String getPageText() {
		return wait.until(ExpectedConditions.visibilityOf(jobTitlePage)).getText();
	}
	public AddJobPage addJobTitle(WebDriver driver) {
		wait.until(ExpectedConditions.visibilityOf(addButton)).click();
		return new AddJobPage(driver);
	}
}
