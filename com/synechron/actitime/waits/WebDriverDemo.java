package com.synechron.actitime.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.actitime.utils.ActitimeUtils;
import com.synechron.actitime.utils.DriverUtils;

public class WebDriverDemo {

	public static void main(String[] args) {
		
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch(driver, "file:///C:/SeleniumWS/html/tiimeout.html");
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 3);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("demo"))));
		String text = driver.findElement(By.id("demo")).getText();
		
		System.out.println(text);
		System.out.println("Program ended");
		
		
	}
}
