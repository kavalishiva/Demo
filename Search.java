package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Zapcom\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("instagram");
		driver.findElement(By.xpath("//label[@for='sb_form_go']")).click();
		
		
		
		Thread.sleep(6500);
		driver.quit();

	}

}
