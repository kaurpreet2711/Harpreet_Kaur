package laerning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ID_Locator_Learning {

	
	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		//System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
//		Thread.sleep(3000);
		
//		By by = By.id("small-searchterms");
//		WebElement searchTextField = driver.findElement(by);
//		searchTextField.sendKeys("Mobile");

		
//		Code optimization 
		
		driver.findElement(By.id("small-searchterms")).sendKeys("Books");
		//method to full screen the browser
//		https://demowebshop.tricentis.com/fiction
	}
}
