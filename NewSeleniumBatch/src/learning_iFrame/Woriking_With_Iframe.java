package learning_iFrame;

import java.awt.Window;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Woriking_With_Iframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/kaur13966/Downloads/iframe.html");

		driver.switchTo().frame(0);	//By index
		driver.switchTo().frame("frame1"); //By name/id
	
		//switchTo frame by WebElement
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@name='frame1']"));
		driver.switchTo().frame(frame1); 
		driver.findElement(By.name("q")).sendKeys("mobile");
		
		//switch to main webpage
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Google")).click();
		
	}

}
