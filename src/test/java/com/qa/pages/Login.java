package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {	
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "F://Downloads//chromedriver801.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	   driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("TestAutomation");
	   System.out.println("Entered text is searched");    
		driver.quit();

	}	

}
