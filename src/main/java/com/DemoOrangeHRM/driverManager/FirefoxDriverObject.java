package com.DemoOrangeHRM.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverObject extends DriverManagerAbstract {

	public void startDriver() {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
	}



}
