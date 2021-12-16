package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToSF {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Zapcom\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		
		driver.findElement(By.id("username")).sendKeys("shiva");
		driver.findElement(By.id("password")).sendKeys("test");
		driver.findElement(By.id("rememberUn")).click();


		Thread.sleep(6500);
		driver.quit();

	}

}
