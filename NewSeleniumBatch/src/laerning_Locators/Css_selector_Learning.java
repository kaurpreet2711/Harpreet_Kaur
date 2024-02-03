package laerning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import net.bytebuddy.description.modifier.SynchronizationState;

public class Css_selector_Learning {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://h-5cg2154sq6:8080/login.do");
		
		driver.findElement(By.cssSelector("[type= 'text']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[type='password']")).sendKeys("manager");
		Thread.sleep(2000);
//		tagname uses
		driver.findElement(By.cssSelector("a[onclick='login(document.forms[0]); return false;']")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
