package revision;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice_Confirmation {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("https://demo.seleniumeasy.com/javascript-alert-box-demo.html")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		System.out.println(alert.getText());
		
	}

}
