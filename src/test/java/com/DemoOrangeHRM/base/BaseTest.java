package com.DemoOrangeHRM.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.DemoOrangeHRM.driverManager.DriverManagerAbstract;
import com.DemoOrangeHRM.driverManager.DriverManagerFactory;
import com.DemoOrangeHRM.enums.DriverType;
import com.DemoOrangeHRM.utils.PropertyUtils;

public class BaseTest {
	private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	private ThreadLocal<DriverManagerAbstract> driverManager = new ThreadLocal<>();
	protected WebDriver getDriver() {
		return driver.get();
	}

	private void setDriver(WebDriver driver) {
		this.driver.set(driver);
	}

	protected DriverManagerAbstract getDriverManager() {
		return driverManager.get();
	}

	private void setDriverManager(DriverManagerAbstract driverManager) {
		this.driverManager.set(driverManager);
	}
	@Parameters("browser")
	@BeforeMethod
	public void startDriver(@Optional String browser) 
			throws FileNotFoundException, IOException{
		if(browser == null || browser.isBlank()) {
			String path = File.separator+"src"+ File.separator+"main"+
					File.separator+"java"+File.separator+"com"+
					File.separator+"DemoOrangeHRM"+File.separator+"config"+
					File.separator+"credential.property";
					
			browser = PropertyUtils.getPropertyData
			(path, "browser");
		}
		setDriverManager( DriverManagerFactory.
				setDriver(DriverType.valueOf(browser.toUpperCase())));
		setDriver(getDriverManager().getDriver());
	}
	
	@AfterMethod
	public void teardown() {
		getDriverManager().closeDriver();
	}
}
