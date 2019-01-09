package com.synechron.actitime.validations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.synechron.actitime.utils.ActitimeUtils;
import com.synechron.actitime.utils.DriverUtils;

public class FormyValidation {
	public static void main(String[] args) {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch(driver, "http://formy-project.herokuapp.com/enabled");
		WebElement disabledTextBox = driver.findElement(By.id("disabledInput"));
		WebElement enabledTextBox = driver.findElement(By.id("input"));

		DriverUtils.validateAndType(disabledTextBox,"Junk123");
		DriverUtils.validateAndType(enabledTextBox,"Junk123");
			
	}

	

}
