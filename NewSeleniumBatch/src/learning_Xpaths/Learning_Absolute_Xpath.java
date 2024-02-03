package learning_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Absolute_Xpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body//div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[2]/input")).sendKeys("harpree@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body//div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[3]")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("html/body//div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]")).click();
	
		Thread.sleep(2000);
	}

}
