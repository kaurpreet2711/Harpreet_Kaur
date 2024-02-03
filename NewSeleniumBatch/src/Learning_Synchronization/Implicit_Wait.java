package Learning_Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Implicit_Wait {
	
	public static void main(String[] args) {
			
	System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
	
	EdgeDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	driver.findElement(By.name("username")).sendKeys("Admin", Keys.TAB,"admin123",Keys.ENTER);


}
}
