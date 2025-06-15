package com.DemoOrangeHRM.driverManager;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManagerAbstract{
	
	protected void startDriver() {
	driver = new EdgeDriver();
	driver.manage().window().maximize();
		
	}

}
