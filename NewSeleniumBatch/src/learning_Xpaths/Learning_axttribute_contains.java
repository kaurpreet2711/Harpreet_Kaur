package learning_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_axttribute_contains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[contains(@class,'search-box-text')]")).sendKeys("Mobile");
		driver.findElement(By.xpath("(//input[contains(@class,'button-1')])[1]")).click();
		Thread.sleep(2000);
		driver.quit();

		
		
	}

}
