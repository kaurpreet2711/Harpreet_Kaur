package practice_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice_Frame {

	
	//https://www.hyrtutorials.com/p/frames-practice.html
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
//		driver.get("file:///C:/Users/kaur13966/Downloads/iframe.html");
		driver.get("https://jqueryui.com/datepicker/");
		
		
		driver.switchTo().frame("iframe");
		driver.findElement(By.id("datepicker")).sendKeys("Test");
//		WebElement byId = driver.findElement(By.id("datepicker"));
////		driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys("Test");
//		byId.click();
//		byId.sendKeys("Test");
	}
}
