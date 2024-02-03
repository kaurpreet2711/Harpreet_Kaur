package learning_JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;

public class Performing_Action_On_Hidden_WE {
	//https://www.rahulshettyacademy.com/AutomationPractice/
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//legend[text()='Element Displayed Example']")));
		
		driver.findElement(By.id("hide-textbox")).click();
		js.executeScript("arguments[0].value='Harpreet'", driver.findElement(By.id("displayed-text")));
		
		driver.findElement(By.id("show-textbox")).click();
		
		
		
	}
}
