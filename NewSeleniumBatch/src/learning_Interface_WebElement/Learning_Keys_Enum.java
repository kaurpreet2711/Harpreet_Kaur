package learning_Interface_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Keys_Enum {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://h-5cg2154sq6:8080/login.do");
		
		WebElement usname=driver.findElement(By.xpath("//input[@name='username']"));
		usname.sendKeys("admin",Keys.TAB);
//		usname.sendKeys(Keys.TAB);
//		Thread.sleep(2000);
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("manager",Keys.TAB,Keys.ENTER);
//		pass.sendKeys(Keys.TAB);
		Thread.sleep(2000);
//		usname.sendKeys(Keys.ENTER);
		driver.quit();
	}

}
