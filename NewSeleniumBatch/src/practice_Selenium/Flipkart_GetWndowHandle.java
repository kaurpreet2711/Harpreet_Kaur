package practice_Selenium;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Flipkart_GetWndowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//span[@role='button']")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Midnight, 128 GB)']")).click();
		

		String parentWindowID = driver.getWindowHandle();
		Set<String> allWindowID = driver.getWindowHandles();

		allWindowID.remove(parentWindowID);
		for (String windowID : allWindowID) {
			driver.switchTo().window(windowID);

		}
		WebElement second = driver.findElement(By.xpath("//span[text() = 'APPLE iPhone 14 (Midnight, 128 GB)']"));
		System.out.println(driver.getTitle());
		String price = driver.findElement(By.xpath("//span[@class='B_NuCI']/../../../..//div[@class='_30jeq3 _16Jk6d']")).getText();
		System.out.println(price);
		String discount = driver.findElement(By.xpath("(//span[text()='17% off'])[1]")).getText();
		System.out.println(discount);
	}

}
