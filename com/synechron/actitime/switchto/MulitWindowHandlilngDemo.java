package com.synechron.actitime.switchto;

import java.nio.file.WatchEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.synechron.actitime.utils.ActitimeUtils;
import com.synechron.actitime.utils.DriverUtils;

public class MulitWindowHandlilngDemo {

	public static void main(String[] args) {
		WebDriver driver =  DriverUtils.getMyDriver();
		ActitimeUtils.launch(driver, "http://localhost:9000/login.do");
		ActitimeUtils.login(driver, "admin", "manager");
		DriverUtils.validateAndClick(driver.findElement(By.id("supportMenuButton")));
		DriverUtils.validateAndClick(driver.findElement(By.xpath("//div[contains(text(),'User Guide')]")));
		
		Set<String> windowIDs = driver.getWindowHandles();
		
		Iterator<String> it  = windowIDs.iterator();
		String parentWinID = it.next();
		String childWinID = it.next();
		
		
		driver.switchTo().window(childWinID);
		
		System.out.println("Total number of links in child win " + driver.findElements(By.xpath("//a")).size());
		
		driver.close();
		driver.switchTo().window(parentWinID);
		DriverUtils.validateAndClick(driver.findElement(By.id("supportMenuButton")));
		driver.close();
	}
	
}
