package practice_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Login_Practice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("Admin", Keys.TAB,"admin123",Keys.ENTER);
//		Thread.sleep(2000);
//		driver.findElement(By.name("password")).sendKeys("admin123"
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
//		Thread.sleep(2000);
//		driver.quit();
		
		
	}

}
