package com.synechron.actitime.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.synechron.actitime.utils.ActitimeUtils;
import com.synechron.actitime.utils.DriverUtils;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  DriverUtils.getMyDriver();
		ActitimeUtils.launch(driver, "file:///C:/SeleniumWS/html/dropDown.html");
		
		WebElement dropDown = driver.findElement(By.xpath("//select[@id='buses']"));
		
		Select sel  = new Select(dropDown);
		
		sel.selectByIndex(2);
		
		Thread.sleep(2000);
		
		sel.selectByValue("audi");
		Thread.sleep(2000);
		
		sel.selectByVisibleText("Volvo");
		
		Thread.sleep(2000);
		sel.deselectByIndex(2);
		Thread.sleep(2000);
		sel.deselectByValue("audi");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Volvo");
		
		
		
		
		
		
		
		
	}
}
