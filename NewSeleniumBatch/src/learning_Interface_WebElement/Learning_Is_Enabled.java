package learning_Interface_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Is_Enabled {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://printila-vendor-blush.vercel.app/");
		
		WebElement button=driver.findElement(By.xpath("//button[text()='Start Selling']"));
		System.out.println(button.isEnabled());
		WebElement usname = driver.findElement(By.xpath("//input[@type='number']"));
		Thread.sleep(2000);
		usname.sendKeys("891828");
		Thread.sleep(2000);
		System.out.println(button.isEnabled());
		Thread.sleep(2000);
		usname.sendKeys("9982736473");
		System.out.println(button.isEnabled());
		driver.quit();
	}

}
