package laerning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Class_locator_learning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://h-5cg2154sq6:8080/login.do");
		driver.findElement(By.className("textField")).sendKeys("admin");
		
		driver.close();
	}

}
