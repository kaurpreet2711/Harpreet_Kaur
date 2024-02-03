package laerning_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Link_text_learning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://h-5cg2154sq6:8080/login.do");
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("License for using this software")).click();
		Thread.sleep(2000);
		driver.quit();

	}

}
