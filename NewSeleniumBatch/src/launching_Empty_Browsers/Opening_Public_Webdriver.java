package launching_Empty_Browsers;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Opening_Public_Webdriver {
	
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		// TODO Auto-generated method stub
		
			System.out.println("1 for edge");
			System.out.println("2 for chrome");
			System.out.println("2 for chrome");
		
			Scanner sc = new Scanner(System.in);
			int br = sc.nextInt();
			
			if (br ==1){
				System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
				driver = new EdgeDriver();
				driver.get("https://www.google.com/");
			}
			else if(br==2) {
				System.setProperty("webdriver.chrome.driver","./drivers/chrome.exe");
				new ChromeDriver();
			}				
			else {
				System.out.println("incorrect input");
			}
	}

}
