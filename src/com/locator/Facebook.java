package com.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\FacebookSelenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement userbox = driver.findElement(By.id("email"));
		userbox.sendKeys("sathishplayboy@gmail.com");
		WebElement passbox = driver.findElement(By.name("pass"));
		passbox.sendKeys("420420420");
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name='login']"));
		loginbtn.click();
		driver.quit();
	}

}
