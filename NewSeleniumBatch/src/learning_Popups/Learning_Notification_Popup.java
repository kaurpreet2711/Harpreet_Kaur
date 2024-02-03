package learning_Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Notification_Popup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.easemytrip.com/");
		
		

	}

}
