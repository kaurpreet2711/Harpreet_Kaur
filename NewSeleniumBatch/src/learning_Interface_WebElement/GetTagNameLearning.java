package learning_Interface_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTagNameLearning {
	
		public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement attributeofflipkasrt=driver.findElement(By.xpath("//img[@title='Flipkart']"));
		System.out.println(attributeofflipkasrt.getTagName());
		
	}

}
