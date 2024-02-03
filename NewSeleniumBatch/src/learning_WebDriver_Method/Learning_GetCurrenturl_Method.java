package learning_WebDriver_Method;

import org.openqa.selenium.edge.EdgeDriver;

public class Learning_GetCurrenturl_Method {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		String url = driver.getCurrentUrl(); //method to fetch the url
		System.out.println(url);
//		driver.close();
		driver.quit();
	}
}
