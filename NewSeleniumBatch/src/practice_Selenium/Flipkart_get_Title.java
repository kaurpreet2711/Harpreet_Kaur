package practice_Selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart_get_Title {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		//Set Properties
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		//Open Edge browser
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		
		String flipkart = driver.getTitle(); //method to fetch the title
		System.out.println(flipkart);
		
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
		
		Thread.sleep(3000);
//		Method to fetch the html source code
				String f11 = driver.getPageSource();
				System.out.println(f11);
				
				 int height = driver.manage().window().getSize().getHeight();
				 System.out.println(height);
		
				 int width = driver.manage().window().getSize().getWidth();
				 System.out.println(width);
				 
				int x_axis = driver.manage().window().getPosition().getX();
					System.out.println(x_axis);
					
			//Method to fetch y_axis
					int y_axis = driver.manage().window().getPosition().getY();
					System.out.println(y_axis);
					
			//maximize window
					driver.manage().window().maximize(); 	
					 int height1 = driver.manage().window().getSize().getHeight();
					 System.out.println("Maximized window height="+height1);
			
					 int width1 = driver.manage().window().getSize().getWidth();
					 System.out.println("Maximized window width ="+width1);
					 
					int x1_axis = driver.manage().window().getPosition().getX();
						System.out.println("Maximized window="+x1_axis);
						
						int y1_axis = driver.manage().window().getPosition().getY();
						System.out.println("Maximized window="+y1_axis);
		 
						//		driver.close();
		driver.quit();
	}

}
