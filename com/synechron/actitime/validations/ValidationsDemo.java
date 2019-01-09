package com.synechron.actitime.validations;

import java.rmi.activation.ActivationSystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.synechron.actitime.utils.ActitimeUtils;
import com.synechron.actitime.utils.DriverUtils;

public class ValidationsDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch(driver, "http://localhost:9000/login.do");
		Thread.sleep(5000);
		WebElement checkBox = driver.findElement(By.id("keepLoggedInCheckBox"));
		if(checkBox.isSelected())
		{
			System.out.println("Already selected");
		}
		else
		{
			System.out.println("clicking on checkbox");
			checkBox.click();
		}
		
	
	}

}
