package com.synechron.actitime.waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.synechron.actitime.utils.ActitimeUtils;
import com.synechron.actitime.utils.DriverUtils;

public class FluentWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver = DriverUtils.getMyDriver();
		ActitimeUtils.launch(driver, "file:///C:/SeleniumWS/html/tiimeout.html");
		
		driver.findElement(By.xpath("//button[text()='Start']")).click();
		
		//Create Fluent Wait object
		FluentWait<WebElement> wait =  new FluentWait<WebElement>(driver.findElement(By.id("demo"))).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofMillis(100)).ignoring(NoSuchElementException.class).ignoring(Exception.class);
		
		// Create Function
		
		Function<WebElement, Boolean> fun = new Function<WebElement, Boolean>()
		{

			@Override
			public Boolean apply(WebElement ele) {
				if(ele.getText().equals("Hello"))
				{
					System.out.println("Found Hellooooooooooooooooooo");
					return true;
				}
				else
				{
					System.out.println("Waiting..!!!!!!!!!!!!!!!!!!!!!");
					return false;
				}
			}
			
			
		};
		
		wait.until(fun);
		
		String text = driver.findElement(By.id("demo")).getText();
		
		System.out.println(text);
		System.out.println("Program ended");
		
		
	}
}
