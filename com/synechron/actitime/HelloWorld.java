package com.synechron.actitime;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.synechron.actitime.utils.ActitimeUtils;

public class HelloWorld
{
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("welcome to Selenium Automation...");
	
		Runtime.getRuntime().exec("TaskKill /F /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWS\\SeleniumPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:9000");
		
		ActitimeUtils.login(driver,"admin","manager");

	//	driver.findElement(By.linkText("Logout")).click();
	}

	

}
