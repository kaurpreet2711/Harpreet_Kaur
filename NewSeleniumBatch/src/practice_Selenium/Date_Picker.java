package practice_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Date_Picker {
	
	public static void main(String[] args) {
		
		//https://jqueryui.com/datepicker/
		
		
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

			EdgeDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/datepicker/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.switchTo().frame(0);
			
//			driver.findElement(By.id("datepicker")).sendKeys("31/12/2024");
//			Thread.sleep(2000);
			WebElement date = driver.findElement(By.xpath("//input[@id='datepicker']"));
			date.click();
			date.sendKeys("01/10/2024");
			
			//https://www.hystutorials.com/p/calender
	}

}
