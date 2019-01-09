package com.synechron.actitime.autosuggestions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionsDemo {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		Runtime.getRuntime().exec("TaskKill /F /IM chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWS\\SeleniumPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("synechron");
		Thread.sleep(2000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[@class='sbl1']"));
		
		System.out.println(autoSuggestions.size());
		
		for (WebElement suggestion : autoSuggestions) 
		{
			System.out.println(suggestion.getText());
			
		}
		
		
		
	} 
}
