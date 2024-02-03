package action_Class_Revision;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;

public class Iframe_Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		driver.get("file:///C:/Users/kaur13966/Downloads/iframe.html");
		driver.switchTo().frame(0);
		driver.switchTo().frame("FR1");
		

	}

}
