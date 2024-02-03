package learning_Interface_WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Learn_Is_Selected {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://h-5cg2154sq6:8080/login.do");
		
		WebElement select = driver.findElement(By.xpath("//div[@class='warning']"));
		boolean test= select.isDisplayed();
	System.out.println(test);
	driver.quit();

}
}
