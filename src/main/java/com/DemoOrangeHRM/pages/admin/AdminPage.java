package com.DemoOrangeHRM.pages.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.DemoOrangeHRM.pages.BasePage;



public class AdminPage extends BasePage{
	WebDriver driver;

	@FindBy(xpath = "//button[text()=' Add ']")
private WebElement addBtn;
	@FindBy(xpath = "//span[text()='Job ']")
	private WebElement job;
	@FindBy(xpath = "//span[text()='Organization ']")
	private WebElement organization;
	@FindBy(xpath = "//span[text()='Qualifications ']")
	private WebElement qualification;
	@FindBy(xpath = "//a[text()='Nationalities']")
	private WebElement nationalities;
	@FindBy(xpath = "//a[text()='Corporate Branding']")
	private WebElement corporateBranding;
	@FindBy(xpath = "//a[text()='Configuration ']")
	private WebElement configuration;
	@FindBy(xpath="//a[text()='Job Titles']")
private WebElement jobTitles;
	@FindBy(xpath="//a[text()='Pay Grades']")
private WebElement payGrades;
	@FindBy(xpath="//a[text()='Employment Status']")
private WebElement employmentStatus;
	@FindBy(xpath="//a[text()='Job Categories']")
private WebElement jobCategories;
	@FindBy(xpath="//a[text()='Work Shifts']")
private WebElement workShift;
	@FindBy(xpath="//h6[text()='Job Titles']")
	private WebElement JobTitlesPage;

public AdminPage(WebDriver driver) {
	super(driver);
	PageFactory.initElements(driver, this);
	this.driver=driver;
}

public JobTitlesPage selectJobTitles() {
wait.until(ExpectedConditions.visibilityOf(jobTitles));
job.click();
jobTitles.click();
return new JobTitlesPage(driver);
}
public void selectPayGrades() {
	wait.until(ExpectedConditions.visibilityOf(payGrades)).click();
}
public void selectEmploymentStatus() {
	wait.until(ExpectedConditions.visibilityOf(employmentStatus)).click();
}
public void selectJobCategories() {
	wait.until(ExpectedConditions.visibilityOf(jobCategories)).click();
}
public void selectWorkShift() {
	wait.until(ExpectedConditions.visibilityOf(workShift)).click();
}



}
