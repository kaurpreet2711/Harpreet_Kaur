package learning_Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Prompt_TextBox_Popup {
	
		public static void main(String[] args) throws InterruptedException {
			
			
			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			
			EdgeDriver driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://the-internet.herokuapp.com/javascript_alerts");
			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
			Thread.sleep(2000);
			Alert alert = driver.switchTo().alert();
			alert.sendKeys("Prompt Popup");
			Thread.sleep(2000);
			alert.accept();
	
		}

}
