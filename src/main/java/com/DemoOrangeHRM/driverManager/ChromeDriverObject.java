package com.DemoOrangeHRM.driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverObject extends DriverManagerAbstract{

	public void startDriver() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	
	}
}
