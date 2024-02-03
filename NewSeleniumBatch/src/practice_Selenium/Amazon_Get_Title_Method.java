package practice_Selenium;

import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_Get_Title_Method {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		
		String amazon = driver.getTitle(); //method to fetch the title
		System.out.println(amazon);
		
		String url = driver.getCurrentUrl();
		System.out.println(url);

		Thread.sleep(3000);
		
//		Method to fetch the html source code
		String amazon1 = driver.getPageSource();
		System.out.println(amazon1);
		 int height = driver.manage().window().getSize().getHeight();
		 System.out.println(height);

		 int width = driver.manage().window().getSize().getWidth();
		 System.out.println(width);
		 
		int x_axis = driver.manage().window().getPosition().getX();
			System.out.println(x_axis);
			
			int y_axis = driver.manage().window().getPosition().getY();
			System.out.println(y_axis);
		driver.manage().window().fullscreen();
		
		driver.manage().window().maximize(); 	
		 int height1 = driver.manage().window().getSize().getHeight();
		 System.out.println("Fullscreen window height="+height1);

		 int width1 = driver.manage().window().getSize().getWidth();
		 System.out.println("Fullscreen window width ="+width1);
		 
		int x1_axis = driver.manage().window().getPosition().getX();
			System.out.println("Fullscreen window="+x1_axis);
			
			int y1_axis = driver.manage().window().getPosition().getY();
			System.out.println("Fullscreen window="+y1_axis);
			driver.quit();

	}

}
