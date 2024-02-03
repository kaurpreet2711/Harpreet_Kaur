package learning_Manage_Method;

import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Fullscreen_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		//System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		//method to full screen the browser
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.close();
	}

}
