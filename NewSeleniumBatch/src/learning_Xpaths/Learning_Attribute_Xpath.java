package learning_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Attribute_Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://h-5cg2154sq6:8080/login.do");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@class='textField'])[2]")).sendKeys("manager");
		driver.findElement(By.xpath("//a[@id='loginButton']")).click();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
