package laerning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Partial_Link_Text_locator_Learning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://h-5cg2154sq6:8080/login.do");
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("License for using")).click();
		Thread.sleep(2000);
		driver.quit();;

	}

}
