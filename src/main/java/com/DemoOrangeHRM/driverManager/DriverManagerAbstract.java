package com.DemoOrangeHRM.driverManager;

import org.openqa.selenium.WebDriver;

public abstract class DriverManagerAbstract {
WebDriver driver;
protected abstract void startDriver();
public WebDriver getDriver() {
	if (driver == null)
		startDriver();
		return driver;
	
}
public void closeDriver() {
	if(driver != null)
	driver.quit();	
	driver = null;
}

}
