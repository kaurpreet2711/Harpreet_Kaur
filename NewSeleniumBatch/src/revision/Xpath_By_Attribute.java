package revision;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Xpath_By_Attribute {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("realme mobile");
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
//		 String mname1 = driver.findElement(By.xpath("//span[text()='realme narzo N53 (Feather Black, 4GB+64GB) 33W Segment Fastest Charging | Slim Smartphone | 90 Hz Smooth Display']")).getText();
//		String mobile = driver.findElement(By.xpath("//span[text()='realme narzo N53 (Feather Black, 4GB+64GB) 33W Segment Fastest Charging | Slim Smartphone | 90 Hz Smooth Display']/../../../../../..")).getText();
//		
//		System.out.println(mname1);
//		System.out.println(mobile);
		
		//Logical Xpath
		
		driver.findElement(By.xpath("//span[@class='nav-line-1' and text()='Returns']")).click();
	}

}
