package action_Class_Revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Right_Click_Revision {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
//		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		WebElement rcButton = driver.findElement(By.xpath("//span[text()='right click me']"));
		action.contextClick(rcButton).perform();
		WebElement copyButton = driver.findElement(By.xpath("//span[text()='Copy']"));
		action.click(copyButton).build().perform();
		driver.quit();
		
	}

}
