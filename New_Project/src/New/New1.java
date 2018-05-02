package New;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class New1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver; 
System.setProperty("webdriver.gecko.driver", "C:\\Users\\E004213\\Downloads\\geckodriver.exe");
driver=new FirefoxDriver();
driver.get("https://phptravels.com/");	
		
	}
}
