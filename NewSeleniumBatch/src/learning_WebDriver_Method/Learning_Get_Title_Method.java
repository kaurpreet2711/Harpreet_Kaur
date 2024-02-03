package learning_WebDriver_Method;

import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Get_Title_Method {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		String title = driver.getTitle(); //method to fetch the title
		System.out.println(title);
	}

}
