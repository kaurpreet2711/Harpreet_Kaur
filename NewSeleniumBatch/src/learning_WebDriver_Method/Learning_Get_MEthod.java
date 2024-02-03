package learning_WebDriver_Method;

import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Get_MEthod {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		//Method to launch web application
		driver.get("https://www.google.com/");
	}

}
