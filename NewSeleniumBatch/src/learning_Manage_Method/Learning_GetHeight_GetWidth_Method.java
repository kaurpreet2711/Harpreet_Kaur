package learning_Manage_Method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_GetHeight_GetWidth_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		//System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
//		Method to fetch height
		
		 Options option = driver.manage();
		 Window window = option.window();
		 Dimension size = window.getSize();
		 int height = size.getHeight();
		 System.out.println(height);
		 
//		 Method to fetch Width
		 int width = size.getWidth();
		 
		 System.out.println(width);
		 Thread.sleep(3000);//		 driver.quit();
		 
//		 Method chaining
		 int height1 = driver.manage().window().getSize().getHeight();
		 System.out.println(height);

		 int width1 = driver.manage().window().getSize().getWidth();
		 System.out.println(width1);
		 
		 driver.manage().window().maximize();
		 System.out.println(height);
		 
//		 Method to fetch Width
		 
		 System.out.println(width);
		 Thread.sleep(3000);//		 driver.quit();
		 
//		 Method chaining
		 System.out.println(height);

		 System.out.println(width1);
		 
	
	}

}
