package com.DemoOrangeHRM.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected WebDriverWait wait;
	public BasePage(WebDriver driver) {
	wait = new WebDriverWait(driver, Duration.ofSeconds(15));
}
	public void waitShort(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
