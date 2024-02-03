package learning_Actions_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Release_Action {
	
	//While
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement stockholm = driver.findElement(By.id("box2"));
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement copehn = driver.findElement(By.id("box4"));
		WebElement seoul = driver.findElement(By.id("box5"));
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement madrid = driver.findElement(By.id("box7"));
		
		WebElement italyrome = driver.findElement(By.xpath("//div[text()='Italy']"));
		WebElement madridspain = driver.findElement(By.xpath("//div[text()='Spain']"));
		WebElement oslonorway = driver.findElement(By.xpath("//div[text()='Norway']"));
		WebElement copenhagendenmark = driver.findElement(By.xpath("//div[text()='Denmark']"));
		WebElement seoulCapital = driver.findElement(By.xpath("//div[text()='South Korea']"));
		WebElement stockholmSweden = driver.findElement(By.xpath("//div[text()='Sweden']"));
		WebElement washingtonUS = driver.findElement(By.xpath("//div[text()='United States']"));
		
		{
			
			
		}
		
	}
}