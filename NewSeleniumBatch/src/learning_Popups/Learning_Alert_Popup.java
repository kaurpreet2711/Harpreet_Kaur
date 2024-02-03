package learning_Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Alert_Popup {
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			
			EdgeDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");

			driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']")).click();
			Thread.sleep(2000);
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();

		}
	}

