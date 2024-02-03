package launching_Empty_Browsers;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		new EdgeDriver();

	}

}
