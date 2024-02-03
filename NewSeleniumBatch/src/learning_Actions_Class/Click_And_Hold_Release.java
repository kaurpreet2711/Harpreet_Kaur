package learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_And_Hold_Release {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(1000);

		Actions action = new Actions(driver);
		
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement usa = driver.findElement(By.id("box103"));
		
		action.clickAndHold(washington).click(usa).build().perform();
		action.release(usa).perform();
	}

}
