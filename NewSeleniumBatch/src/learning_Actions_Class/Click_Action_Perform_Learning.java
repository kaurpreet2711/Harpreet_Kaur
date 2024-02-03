package learning_Actions_Class;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_Action_Perform_Learning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://h-5cg2154sq6:8080/login.do");
		Thread.sleep(1000);

		Actions action = new Actions(driver);
		WebElement act = driver.findElement(By.xpath("//a[@id='loginButton']"));
		action.click(act).perform();
		driver.quit();

	}

}
