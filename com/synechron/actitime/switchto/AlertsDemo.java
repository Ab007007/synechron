package com.synechron.actitime.switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.synechron.actitime.utils.ActitimeUtils;
import com.synechron.actitime.utils.DriverUtils;

public class AlertsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  DriverUtils.getMyDriver("ff");

		ActitimeUtils.launch(driver);
		ActitimeUtils.login(driver, "admin", "manager");
		DriverUtils.validateAndClick(driver.findElement
				(By.xpath("//a[div[text()='Tasks']]")));
		DriverUtils.validateAndClick(driver.findElement
				(By.xpath("//input[@type='button' and @value='Create New Tasks']")));
		
		driver.findElement(By.name("task[0].name")).sendKeys("dummyText");
		DriverUtils.validateAndClick(driver.findElement
				(By.xpath("//input[contains(@onclick,'cancelTasksCreation();')]")));
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		DriverUtils.validateAndClick(driver.findElement
				(By.xpath("//input[contains(@onclick,'cancelTasksCreation();')]")));
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	}
}
