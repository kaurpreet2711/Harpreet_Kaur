package learning_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Visible_Text_xpath {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://h-5cg2154sq6:8080/login.do");

		
		driver.findElement(By.xpath("//label[text()='Keep me logged in unless I log out']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
