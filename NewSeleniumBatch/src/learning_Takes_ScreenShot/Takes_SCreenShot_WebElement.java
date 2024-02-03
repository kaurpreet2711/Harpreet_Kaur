package learning_Takes_ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takes_SCreenShot_WebElement {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");


		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://h-5cg2154sq6:8080/login.do");

		WebElement loginButton = driver.findElement(By.id("loginButton"));
		File source = loginButton.getScreenshotAs(OutputType.FILE);
		File destination = new File("./screenshots/WebElements.png");
		FileHandler.copy(source, destination);
		
		//https://jqueryui.com/datepicker/
	
	}

}
