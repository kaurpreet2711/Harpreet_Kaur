package launching_Empty_Browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class Launching_Empty_Edge_Browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		new EdgeDriver();
		
		

	}

}
