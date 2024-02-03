package learning_Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_Hidden_Division_Popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://h-5cg2154sq6:8080/tasks/otasklist.do");
		
		Actions action = new Actions(driver);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@class='textField'])[2]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
//		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Task Test']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Delete This Task']")).click();
		Thread.sleep(2000);
		 WebElement popup = driver.findElement(By.id("deleteButton"));
		 popup.click();
//		 popup.isDisplayed();
//		action.click().perform();
		
	}

}
