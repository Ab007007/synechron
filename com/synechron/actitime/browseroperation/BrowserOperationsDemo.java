package com.synechron.actitime.browseroperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.synechron.actitime.utils.ActitimeUtils;
import com.synechron.actitime.utils.DriverUtils;

public class BrowserOperationsDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch(driver, "http://localhost:9000/login.do");
		ActitimeUtils.login(driver, "admin", "manager");
		driver.findElement(By.xpath("//a[div[text()='Tasks']]")).click();
		System.out.println(driver.getCurrentUrl());
		//click on browser back button
		driver.navigate().back();
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		//click on forward button
		driver.navigate().forward();
		Thread.sleep(2000);
		//refresh
		driver.navigate().refresh();
		Thread.sleep(2000);
		//maximize
		driver.manage().window().maximize();
		
		//driver.close();
		driver.quit();
		
		
	}
}
