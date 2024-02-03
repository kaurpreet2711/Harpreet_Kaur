package learning_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.HttpChannel.Listener;

public class Learning_Multi_Select_DD {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		Thread.sleep(1000);
		
		WebElement monthDD = driver.findElement(By.name("Month"));
		Select sel=new Select(monthDD); 
		
		System.out.println(sel.isMultiple());
		
		Thread.sleep(2000);
		sel.selectByIndex(12);

		
		
		sel.deselectAll();
		
		List<WebElement> allselected = sel.getOptions();
		
		for (int i = 1; i <allselected.size(); i++) {
			sel.selectByIndex(i);
			System.out.println(allselected.get(i).getText());			
		}
		for (WebElement webElement : allselected) {
			System.out.println(webElement.getText());
			
		}
		
	}

}
