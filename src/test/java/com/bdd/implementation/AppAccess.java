package com.bdd.implementation;
import static com.bdd.utils.WebdriverUtils.getDriver;
import static com.bdd.variables.GlobalVariables.*;
public class AppAccess {
public static void accessApp() {
	if(cdriver==null||cdriver.toString().contains("null")) {
		cdriver= getDriver();	
			}	
	openUrl();
	}
public static void openUrl() {
	cdriver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
}
}
