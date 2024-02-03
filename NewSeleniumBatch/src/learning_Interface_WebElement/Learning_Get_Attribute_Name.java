package learning_Interface_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Get_Attribute_Name {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(2000);
		WebElement attributevalue=driver.findElement(By.xpath("//a[@title='Cart'][2]"));
		System.out.println(attributevalue.getAttribute("title"));
//		driver.quit(); 
		WebElement flipkart = driver.findElement(By.xpath("//img[@title='Flipkart']"));
		System.out.println(flipkart.getAttribute("flipkart"));
		
	}

}
