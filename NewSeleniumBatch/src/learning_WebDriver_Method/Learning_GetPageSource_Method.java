package learning_WebDriver_Method;

import org.openqa.selenium.edge.EdgeDriver;

public class Learning_GetPageSource_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
//		method to fetch the html source code
		String source = driver.getPageSource();
		System.out.println(source);
//		driver.close();
		driver.quit();
	}

}
