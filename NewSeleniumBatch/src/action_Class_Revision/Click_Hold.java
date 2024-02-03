package action_Class_Revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Hold {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		Actions action = new Actions(driver);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement italy = driver.findElement(By.xpath("//div[text()='Italy']"));
//		action.clickAndHold(oslo).click(italy).build().perform();
		action.dragAndDrop(oslo, italy).build().perform();
		
		
		
	}

}
