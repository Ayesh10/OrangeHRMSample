package com.DemoOrangeHRM.driverManager;

import com.DemoOrangeHRM.enums.DriverType;

public class DriverManagerFactory {
	

public static DriverManagerAbstract setDriver(DriverType driver) {
	switch(driver) { 
	case CHROME: return new ChromeDriverObject();
	case EDGE : return new FirefoxDriverObject(); 
	case FIREFOX : return new FirefoxDriverObject(); 
	default:throw new IllegalArgumentException("browser not found"+driver);
	}
}
}
