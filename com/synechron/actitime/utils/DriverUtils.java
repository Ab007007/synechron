package com.synechron.actitime.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverUtils {

	static WebDriver driver = null;
	
	public static void validateAndType(WebElement textBox,String text) {
		System.out.println("********* validating and typing on an Element *****************");
		if(textBox.isDisplayed())
		{
			System.out.println("element is present in DOM");
			if(textBox.isEnabled())
			{
				System.out.println("element is Present And Enabled.. perforom type operation");
				textBox.clear();
				textBox.sendKeys(text);
			}
			else
			{
				System.out.println("Element is not Enabled...,Cant perfrom type operation");
			}
		}
		else
		{
			System.out.println("Element is not found in the DOM");
		}
		
		System.out.println("****Validation completed*******************");
	}
	/**
	 * verify the element exist and enabled before performing Click
	 * @param textBox
	 * @author admin
	 */
	public static void validateAndClick(WebElement textBox) {
		System.out.println("********* validating and typing on an Element *****************");
		if(textBox.isDisplayed())
		{
			System.out.println("element is present in DOM");
			if(textBox.isEnabled())
			{
				System.out.println("element is Present And Enabled.. perforom type operation");
				textBox.click();
			}
			else
			{
				System.out.println("Element is not Enabled...,Cant perfrom type operation");
			}
		}
		else
		{
			System.out.println("Element is not found in the DOM");
		}
		
		System.out.println("****Validation completed*******************");
	}
	
	/**
	 * method to return chrome driver
	 * @return
	 */
	public static WebDriver getMyDriver() 
	{
		try {
			Runtime.getRuntime().exec("TaskKill /F /IM chromedriver.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWS\\SeleniumPractice\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
		
	}
	/**
	 * @author aravind
	 * @param type - ff,chrome,ie
	 * @return - retruns the driver object for user choice
	 */
	public static WebDriver getMyDriver(String type)
	{
		System.out.println("Creating a driver for " + type);
		
		switch (type) 
		{
			case "ff":
				try {
					Runtime.getRuntime().exec("TaskKill /F /IM geckodriver.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.setProperty("webdriver.gecko.driver", "driver\\geckodriver.exe");
        		 driver =  new FirefoxDriver();	
		  		break;
			case "chrome":
				try {
					Runtime.getRuntime().exec("TaskKill /F /IM chromedriver.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWS\\SeleniumPractice\\driver\\chromedriver.exe");
				driver = new ChromeDriver();
				
				break;
			case "ie":
				try {
					Runtime.getRuntime().exec("TaskKill /F /IM IEDriverServer.exe");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.setProperty("webdriver.ie.driver", "driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				break;

		default:
			System.out.println("please pass only ff,chrome,ie");
			break;
			
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
		
	}
	
}
