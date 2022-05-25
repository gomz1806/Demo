package com.alert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;

public class FramesScreenshot {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandhu\\eclipse-workspace\\ProjectClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("gomathigoms1806@gmail.com");
		
		WebElement dropdown = driver.findElement(By.id("awf_field-91977689"));
		
		Select course = new Select(dropdown);
		course.selectByIndex(11);
		
		TakesScreenshot tss = (TakesScreenshot)driver;
		
		File src = tss.getScreenshotAs(OutputType.FILE);
		
		File ssFolder = new File("C:\\Users\\nandhu\\eclipse-workspace\\ProjectClass\\src\\main\\java\\Screenshot\\Email&Course.png");
		FileUtils.copyFile(src, ssFolder);
	
		driver.switchTo().frame("a077aa5e");
		
		WebElement img = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		img.click();
		
		String Parentwin = driver.getWindowHandle();
		
		Set<String> liveprjct = driver.getWindowHandles();
		
		List<String> windwhndle = new ArrayList<String>();
		windwhndle.addAll(liveprjct);
		driver.switchTo().window(windwhndle.get(1));
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement nxtwin = driver.findElement(By.xpath("//a[@class='button-liveproject']"));
			
		JavascriptExecutor scrolldown = (JavascriptExecutor)driver;
		scrolldown.executeScript("arguments[0].scrollIntoView(true)", nxtwin );
		
		
			
		
		}
	
	
	}
	
	
	





















