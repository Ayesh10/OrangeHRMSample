package com.DemoOrangeHRM.pages.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.DemoOrangeHRM.pages.BasePage;

public class AddJobPage extends BasePage{
@FindBy(xpath = "//label[text()='Job Title']//parent::div"
		+ "//following-sibling::div/input")
private WebElement jobTitleInputBox;
@FindBy(xpath = "//label[text()='Job Description']//parent::div"
		+ "//following-sibling::div/textarea")
private WebElement enterJobDesc;
@FindBy(xpath = "//label[text()='Note']//parent::div"
		+ "//following-sibling::div/textarea")
private WebElement enterNote;
@FindBy(xpath = "//form//button[text()=' Cancel ']")
private WebElement cancelButton;
@FindBy(xpath = "//form//button[text()=' Save ']")
private WebElement saveButton;
WebDriver driver;

	
	public AddJobPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	public void enterJobTitle(String title) {
		wait.until(ExpectedConditions.visibilityOf(jobTitleInputBox));
		jobTitleInputBox.sendKeys(title);
	}
	public void enterJobDesc(String desc) {
		wait.until(ExpectedConditions.visibilityOf(enterJobDesc));
		enterJobDesc.sendKeys(desc);
		
	}
	public void enterNote(String note) {
		wait.until(ExpectedConditions.visibilityOf(enterNote));
		enterNote.sendKeys(note);
		
	}
	public JobTitlesPage clickSave() {
		wait.until(ExpectedConditions.visibilityOf(saveButton)).click();
		return new JobTitlesPage(driver);
	}
}
