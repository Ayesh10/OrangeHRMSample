package com.DemoOrangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Dashboard extends BasePage{
	@FindBy(xpath = "//h6[normalize-space()='Dashboard']")
	private WebElement dashboardPage;
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	private WebElement userName;
	@FindBy(xpath = "//span[normalize-space()='Admin']")
	private WebElement adminModule;
	@FindBy(xpath = "//span[normalize-space()='PIM']")
	private WebElement pIMModule;
	@FindBy(xpath = "//span[text()='Leave']//parent::a")
	private WebElement leaveModule;
	@FindBy(xpath = "//span[text()='Time']//parent::a")
	private WebElement timeModule;
	@FindBy(xpath = "//p[normalize-space()='My Actions']")
	private WebElement MyActionCard;
	@FindBy(xpath = "//p[normalize-space()='Quick Launch']")
	private WebElement QuickLaunchCard;
	@FindBy(xpath = "//p[normalize-space()='Buzz Latest Posts']")
	private WebElement buzzLatestPostsCard;
	@FindBy(xpath = "//p[normalize-space()='Employees on Leave Today']")
	private WebElement employeeOnLeaveTodayCard;
	@FindBy(xpath = "//p[normalize-space()='Employee Distribution by Sub Unit']")
	private WebElement employeeDistributionbySubUnitCard;
	@FindBy(xpath = "//p[normalize-space()='Employee Distribution by Location']")
	private WebElement employeeDistributionbyLocationCard;
	@FindBy(xpath = "//span[normalize-space()='Recruitment']")
	private WebElement recruirmentModule;
	@FindBy(xpath = "//p[normalize-space()='Time at Work']")
	private WebElement timeAtWorkCard;

	public Dashboard(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public WebElement getDashboardPage() {
		return wait.until(ExpectedConditions.visibilityOf(dashboardPage));
	}

	public WebElement getUserName() {
		return wait.until(ExpectedConditions.visibilityOf(userName));
	}

	public WebElement getAdminModule() {
		return wait.until(ExpectedConditions.visibilityOf(adminModule));
	}

	public WebElement getpIMModule() {
		return wait.until(ExpectedConditions.visibilityOf(pIMModule));
	}

	public WebElement getLeaveModule() {
		return wait.until(ExpectedConditions.visibilityOf(leaveModule));
	}

	public WebElement getTimeModule() {
		return wait.until(ExpectedConditions.visibilityOf(timeModule));
	}

	public WebElement getMyActionCard() {
		return wait.until(ExpectedConditions.visibilityOf(MyActionCard));
	}

	public WebElement getQuickLaunchCard() {
		return wait.until(ExpectedConditions.visibilityOf(QuickLaunchCard));
	}

	public WebElement getBuzzLatestPostsCard() {
		return wait.until(ExpectedConditions.visibilityOf(buzzLatestPostsCard));
	}

	public WebElement getEmployeeOnLeaveTodayCard() {
		return wait.until(ExpectedConditions.visibilityOf(employeeOnLeaveTodayCard));
	}

	public WebElement getEmployeeDistributionbySubUnitCard() {
		return wait.until(ExpectedConditions.visibilityOf(employeeDistributionbySubUnitCard));
	}

	public WebElement getEmployeeDistributionbyLocationCard() {
		return wait.until(ExpectedConditions.visibilityOf(employeeDistributionbyLocationCard));
	}

	public WebElement getRecruirmentModule() {
		return wait.until(ExpectedConditions.visibilityOf(recruirmentModule));
	}

	public WebElement getTimeAtWorkCard() {
		return wait.until(ExpectedConditions.visibilityOf(timeAtWorkCard));
	}
	public boolean verifyCardPresent() {
		if(getTimeAtWorkCard().isDisplayed()&
				getEmployeeDistributionbyLocationCard().isDisplayed() &
				getEmployeeDistributionbySubUnitCard().isDisplayed() &
				getMyActionCard().isDisplayed() &
				getQuickLaunchCard().isDisplayed() &
				getBuzzLatestPostsCard().isDisplayed() &
				getEmployeeOnLeaveTodayCard().isDisplayed()) 
			return true;
		else
			return false;
	}
	
}

