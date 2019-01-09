package com.synechron.actitime.waits;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.synechron.actitime.utils.DriverUtils;

public class AutoSuggestionsDemo {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver = DriverUtils.getMyDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("synechron");
		
		WebDriverWait wait  = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(
				driver.findElement(By.xpath("//ul[@class='erkvQe']"))));
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//div[@class='sbl1']"));
		
		System.out.println(autoSuggestions.size());
		
		for (WebElement suggestion : autoSuggestions) 
		{
			if(suggestion.getText().equals("synechron careers"))
			{
				System.out.println("selecing synechron carrers....");
				suggestion.click();
				break;
			}
			
		}
		
		
		
	} 
}
