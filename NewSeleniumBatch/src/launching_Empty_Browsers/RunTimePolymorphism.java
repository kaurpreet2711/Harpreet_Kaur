package launching_Empty_Browsers;

import java.util.Scanner;

import org.openqa.selenium.edge.EdgeDriver;

public class RunTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println("1 for edge");
		
			Scanner sc = new Scanner(System.in);
			int br = sc.nextInt();
			
			if (br ==1){
				System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
				new EdgeDriver();
			}
			else {
				System.out.println("incorrect input");
			}
	}

}
