package com.synechron.actitime.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ActitimeUtils {

	public static void login(WebDriver driver,String username, String password)
	{
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}
	
	public static void launch(WebDriver driver, String url)
	{
		System.out.println("Launching applicaiton " + url);
		driver.get(url);
		
	}
	
	public static void launch(WebDriver driver)
	{
		System.out.println("Launching applicaiton " );
		driver.get("http://localhost:9000/login.do");
		
	}
	/**
	 * Function to select a Required Module in application 
	 * @author admin
	 * @param driver
	 * @param name - Tasks,Reports,Users,Work Schedule,Settings
	 */
	public static void clickOnModule(WebDriver driver,String name)
	{
		System.out.println("clicking on module - " + name);
		driver.findElement(By.xpath("//a[div[text()='"+name+"']]")).click();
		
	}
}
