package revision;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;


import org.openqa.selenium.edge.EdgeDriver;

public class Robot_Practice {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		
			Robot robot = new Robot();
			
			driver.findElement(By.name("q")).click();
			robot.keyPress(KeyEvent.VK_R);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_B);
			robot.keyPress(KeyEvent.VK_O);
			robot.keyPress(KeyEvent.VK_T);
			
			robot.keyRelease(KeyEvent.VK_R);
			robot.keyRelease(KeyEvent.VK_O);
			robot.keyRelease(KeyEvent.VK_B);
			robot.keyRelease(KeyEvent.VK_O);
			robot.keyRelease(KeyEvent.VK_T);
			
			driver.close();
			
	}

}
