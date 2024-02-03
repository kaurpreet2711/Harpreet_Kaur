package learning_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Axes_Xpath {

	
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mobile");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		String mname=driver.findElement(By.xpath("//div[text()='MOTOROLA g54 5G (Mint Green, 128 GB)']")).getText();
		String mobilename=driver.findElement(By.xpath("(//div[text()='vivo T2x 5G (Marine Blue, 128 GB)'])[1]/ancestor::div[@class='_2kHMtA']/descendant::div[@class='_30jeq3 _1_WHN1']")).getText();
		System.out.println(mobilename);
		System.out.println(mname);
		driver.quit();
	}		
}
