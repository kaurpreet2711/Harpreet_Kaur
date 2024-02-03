package learning_Popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Window_Popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://h-5cg2154sq6:8080/login.do");
		
		
		driver.findElement(By.xpath("//a[text()='License for using this software']")).click();
		String parentWindowID = driver.getWindowHandle();
		Set<String> allWindowID = driver.getWindowHandles();
		
		System.out.println(parentWindowID);
		System.out.println(allWindowID);
		
		allWindowID.remove(parentWindowID);
		for (String windowID : allWindowID) {
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			driver.close();
			Thread.sleep(2000);
			
		}
		driver.switchTo().window(parentWindowID);
		Thread.sleep(2000);
		driver.close();
		
	}

}
