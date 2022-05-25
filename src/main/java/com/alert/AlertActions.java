package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertActions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandhu\\eclipse-workspace\\ProjectClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		Thread.sleep(50000);
		
		WebElement secure = driver.findElement(By.id("details-button"));
		secure.click();
		
		WebElement link = driver.findElement(By.id("proceed-link"));
		link.click();
		
		WebElement clkMe = driver.findElement(By.xpath("//button[@id='alertButton']"));
		clkMe.click();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		WebElement OnBtn = driver.findElement(By.id("timerAlertButton"));
		OnBtn.click();
		
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.alertIsPresent());
		
		WebElement cnfrm = driver.findElement(By.id("confirmButton"));
		cnfrm.click();
		
		WebElement prompt = driver.findElement(By.id("promtButton"));
		prompt.sendKeys("Gomathi");
		prompt.click();
		
		
		
		
		
		

	
	
	
}
	
}
