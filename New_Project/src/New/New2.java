package New;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver", "C:\\Users\\E004213\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();	

	driver.get("https://phptravels.com/");
//driver.findElement(By.xpath("//a[@class='login']")).click();
/*try {
WebDriverWait wait=new WebDriverWait(driver,100);
wait.until(ExpectedConditions.alertIsPresent());
Alert alert=driver.switchTo().alert();
alert.dismiss();
}
catch(TimeoutException e) {
System.out.println(e.getMessage());	
}*/
//public boolean confirmAlert() {
/*	try {
		driver.switchTo().alert().accept();
	} catch (NoAlertPresentException e) {
		// Mean that the alert is not present
		return false;
	}
	return true;
}*/

WebElement sendIssue =(WebElement)new WebDriverWait(driver,10).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='login']")));
sendIssue.click();
	}

}
