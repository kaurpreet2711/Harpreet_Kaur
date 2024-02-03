package learning_Manage_Method;

import org.openqa.selenium.edge.EdgeDriver;

public class Learning_GetX_GetY_Method {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		
		//Method to fetch x_axis
		int x_axis = driver.manage().window().getPosition().getX();
		System.out.println(x_axis);
		
		//Method to fetch y_axis
		int y_axis = driver.manage().window().getPosition().getY();
		System.out.println(y_axis);
		driver.quit();
	}
	
	

}
