package com.vf.testScript;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.DemoOrangeHRM.pages.Dashboard;
import com.DemoOrangeHRM.pages.LoginPage;
import com.DemoOrangeHRM.utils.JacksonUtils;

public class JobCreationTest {
	LoginPage login;
	Dashboard dashboard;
@Test(dataProvider = "userCred")
public void jobCreationTest(String userName, String Password) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	login = new LoginPage(driver);
	login.enterUserName(userName).enterPassword(Password).clickLogin();
	
	
}
@DataProvider
public Object[][] userCred() throws IOException{
	List<Map<String, String>> data = JacksonUtils.deserializeJson();
	 Object[][] result = new Object[1][2]; // each row: username, password

	    for (int i = 0; i < data.size(); i++) {
	        Map<String, String> entry = data.get(i);
	        result[i][0] = entry.get("name");
	        result[i][1] = entry.get("password");
	    }

	    return result;
	
	
}
}
