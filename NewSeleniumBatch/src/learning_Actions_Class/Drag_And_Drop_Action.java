package learning_Actions_Class;

import org.openqa.selenium.edge.EdgeDriver;

public class Drag_And_Drop_Action {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		
//		http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
	}

}
