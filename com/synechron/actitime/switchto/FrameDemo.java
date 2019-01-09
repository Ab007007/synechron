package com.synechron.actitime.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.actitime.utils.ActitimeUtils;
import com.synechron.actitime.utils.DriverUtils;

public class FrameDemo {

	public static void main(String[] args) {
		
		WebDriver driver=  DriverUtils.getMyDriver();
		ActitimeUtils.launch(driver, "https://www.w3schools.com/code/tryit.asp?filename=FVEZ1JEHSNQL");;
		DriverUtils.validateAndClick(driver.findElement(By.xpath
				("//button[contains(text(),'Run')]")));
		
		
		//driver.switchTo().frame("iframeResult");
		WebElement frameElement = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frameElement);
		
		DriverUtils.validateAndClick(driver.findElement(By.id("btnReset")));
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.className("content"))));
		System.out.println("Disappeared successfully");
		
		
		driver.switchTo().defaultContent();
		DriverUtils.validateAndClick(driver.findElement
				(By.xpath("//button[contains(text(),'Run')]")));
		frameElement = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frameElement);
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.invisibilityOf(driver.findElement(By.className("content"))));
		driver.switchTo().defaultContent();
		driver.close();
	}
}
