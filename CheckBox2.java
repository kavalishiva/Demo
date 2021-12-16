package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Zapcom\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/account/general?ru=");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("enAS")).click();
		Thread.sleep(6500);

		
		boolean status=driver.findElement(By.id("enAS")).isSelected();
		System.out.println(status);
		
		if(status) {
			System.out.println("checkbox already checked");
		}else {
			driver.findElement(By.id("enAS")).click();
			System.out.println("successfully checked the box");
		}
		Thread.sleep(6500);
		driver.quit();


	}

}
