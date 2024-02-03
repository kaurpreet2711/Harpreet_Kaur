package action_Class_Revision;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takes_ScreenShot {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement ts = driver.findElement(By.id("mainContainer"));
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("screenshots/TestingRevision.jpeg");
		FileHandler.copy(source, destination);
		
	}

}
