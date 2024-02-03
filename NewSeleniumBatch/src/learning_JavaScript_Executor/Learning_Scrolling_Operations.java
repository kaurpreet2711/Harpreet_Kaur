package learning_JavaScript_Executor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Scrolling_Operations {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,200)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollBy(300)");
//		Thread.sleep(2000);
		
//		js.executeScript("window.scrollTo(0,200)");
//		Thread.sleep(2000);
//		js.executeScript("window.scrollTo(0,100)");
		Thread.sleep(2000);
		
		WebElement addToCart = driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]"));
		js.executeScript("arguments[0].scrollIntoView(false)", addToCart);

		
	}

}
