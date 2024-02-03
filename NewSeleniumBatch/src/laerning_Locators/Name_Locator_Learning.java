package laerning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Name_Locator_Learning {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.name("q")).sendKeys("Name locator");
		

	}
}
