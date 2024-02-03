package learning_Interface_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Is__Selected {
	
public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement select=driver.findElement(By.xpath("//li[@class='answer'][2]"));
		System.out.println(select.isSelected());
		
}

}
