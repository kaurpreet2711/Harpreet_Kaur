package learning_Interface_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Clear_Method {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://h-5cg2154sq6:8080/login.do");
		
		WebElement username1=driver.findElement(By.xpath("//input[@name='username']"));
		username1.sendKeys("admin");
		Thread.sleep(2000);
		username1.clear();
		driver.quit();		
	}

}
