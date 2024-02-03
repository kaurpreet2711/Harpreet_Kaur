package revision;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Revision {
	
	public static void main(String[] args) {
		
//		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
		driver.switchTo().frame("iframeResult");
		WebElement dd = driver.findElement(By.xpath("//select[@name='cars']"));
		Select sel=new Select(dd);
//		sel.selectByVisibleText("Saab");
//		dd.click();
//		sel.selectByIndex(0);
		
		List<WebElement> options=sel.getOptions();
		for(int i=0;i<options.size();i++) {
			sel.selectByIndex(i);
			System.out.println(options.get(i).getText());
			
		}
		
		driver.quit();
	}

}
