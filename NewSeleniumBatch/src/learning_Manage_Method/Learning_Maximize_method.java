package learning_Manage_Method;

import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Maximize_method {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		 EdgeDriver driver = new EdgeDriver();  //Open the Edge driver
		 
		driver.get("https://www/google.com/");
		
//		Method to maximize browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.quit();
	}

	
	
}
