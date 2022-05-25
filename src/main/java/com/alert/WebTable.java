package com.alert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandhu\\eclipse-workspace\\ProjectClass\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();;
		
		WebElement table = driver.findElement(By.tagName("table"));
		List<WebElement> Totalrows = (List<WebElement>) table.findElement(By.tagName("tr"));
		
		for (int i = 0; i<Totalrows.size();i++) {
			WebElement rows = Totalrows.get(i) ;
			List<WebElement> RowData = rows.findElements(By.tagName("td"));
			for (int j = 0; j<RowData.size();j++)  {
				WebElement value = RowData.get(j) ;
				String text = value.getText();
				System.out.println(text);
			}
			
		}
		
		
		
	}
	
	
	
}
