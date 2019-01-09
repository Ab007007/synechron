package com.synechron.actitime.tests;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.synechron.actitime.utils.ActitimeUtils;
import com.synechron.actitime.utils.DriverUtils;

public class CreateCustomer {

	public static void main(String[] args) {
		
		WebDriver driver = DriverUtils.getMyDriver("ff");
		ActitimeUtils.launch(driver);
		ActitimeUtils.login(driver, "admin", "manager");
		ActitimeUtils.clickOnModule(driver, "Tasks");
		DriverUtils.validateAndClick(driver.findElement(By.linkText("Projects & Customers")));
		
				
	}
}
