package learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Loop_Program {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		
		driver.findElement(By.id("capitals"));
		Actions action = new Actions(driver);
		for(int i=1;i<=7;i++) {
			 action.dragAndDrop(driver.findElement(By.xpath("//div[@id='box"+i+"']")),(driver.findElement(By.xpath("//div[@id='box10"+i+"']")))).perform();
		
		}
		
		for(int i=1;i<=7;i++) {
			 action.dragAndDrop(driver.findElement(By.xpath("//div[@id='box"+i+"']")),(driver.findElement(By.xpath("//div[@id='box10"+i+"']")))).perform();

			
		}
		
	}
}
