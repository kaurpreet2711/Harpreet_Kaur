package learning_Interface_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_cssAttribute_Learning {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);
		
		WebElement cssattributeofflipkasrt=driver.findElement(By.xpath("//img[@title='Flipkart']"));
		System.out.println(cssattributeofflipkasrt.getCssValue("color"));//Css property like color, font etc
		
	}


}
