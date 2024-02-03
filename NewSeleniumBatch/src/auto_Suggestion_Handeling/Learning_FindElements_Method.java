package auto_Suggestion_Handeling;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_FindElements_Method {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Narendra modi");
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='eIPGRd']"));
		Thread.sleep(2000);
		
		for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
			
		}

		for (WebElement suggestion : suggestions) {
			if (suggestion.getText().equalsIgnoreCase("narendra modi stadium capacity"))
					{
				Thread.sleep(2000);
				suggestion.click();
				break;
				
			}
		}
	}

}
