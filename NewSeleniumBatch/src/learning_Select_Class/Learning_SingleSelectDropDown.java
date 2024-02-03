package learning_Select_Class;

import java.util.List;

import javax.swing.event.ListDataListener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_SingleSelectDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");

		WebElement countryDD = driver.findElement(By.name("country"));
		Select sel = new Select(countryDD); 
		
		sel.selectByIndex(30);
		Thread.sleep(1000);
		sel.selectByValue("AU");
		Thread.sleep(100);
		sel.selectByVisibleText("India");
		
			List<WebElement> allOptions = sel.getOptions();
//
//		for (int i = 0; i <=allOptions.size(); i++) {
//			sel.selectByIndex(i);
//			System.out.println(allOptions.get(i).getText());
//			
//		}
		
		
	}



}
