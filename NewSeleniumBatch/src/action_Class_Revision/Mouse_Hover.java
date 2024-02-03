package action_Class_Revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;

public class Mouse_Hover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");

//		System.setProperty("webdriver.egde.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		Actions action = new Actions(driver);
		WebElement drop = driver.findElement(By.xpath("(//span[@class='nav-icon nav-arrow'])[1]"));
		action.moveToElement(drop).click().perform();
		driver.quit();

	}

}
