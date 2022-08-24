package com.bdd.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebdriverUtils {
	
	public static WebDriver driver;
	
public static WebDriver getDriver() {
	System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/msedgedriver.exe");
	driver=new EdgeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
	driver.manage().window().maximize();
	return driver;
}
}
