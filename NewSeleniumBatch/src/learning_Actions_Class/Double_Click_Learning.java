package learning_Actions_Class;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click_Learning {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement doubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(doubleClick).build().perform();
		driver.quit();
		
		
	}

}
