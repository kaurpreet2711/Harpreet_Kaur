package learning_Xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

	public class Learning_Logical_Operator {
	
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1' and @class='nav-line-1 nav-progressive-content']")).click();
		driver.findElement(By.xpath("//input[@type='email' or @class='a-input-text a-span12 auth-autofocus auth-required-field']")).sendKeys("884");
		driver.findElement(By.xpath("//input[@class='a-button-input' and @type='submit']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'a-input-text a') and @id='ap_password']")).sendKeys("Ha27");
		driver.findElement(By.xpath("//input[@id='signInSubmit' and @class='a-button-input']")).click();
	}

}
