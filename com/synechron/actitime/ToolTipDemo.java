package com.synechron.actitime;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipDemo {
	public static void main(String[] args) throws IOException
	{
		String expectedToolTip ="Google apps";
		System.out.println("welcome to Selenium Automation...");
	
		Runtime.getRuntime().exec("TaskKill /F /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWS\\SeleniumPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		
		String actualToolTip = driver.findElement
				(By.xpath("//a[@class='gb_b gb_rc']")).
				getAttribute("title");
		
		System.out.println(actualToolTip);
		if(actualToolTip.equals(expectedToolTip))
		{
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
		
	}

}
