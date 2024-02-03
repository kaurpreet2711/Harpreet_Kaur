package learning_WebDriver_Method;

import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Close_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		//System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		
		//Method to close the browser
		driver.close();
		
		
	}

}
