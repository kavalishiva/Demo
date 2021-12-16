package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Zapcom\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/account/general?ru=");
		WebElement dd=driver.findElement(By.id("rpp"));
		
		Select s1 = new Select(dd);
//		s1.selectByIndex(1);
//		s1.selectByValue("30");
		
		List<WebElement>options=s1.getOptions();
		System.out.println("total elements are : " +options.size());
		
		for(int i=0;i<options.size();i++) {
			String objText=options.get(i).getText();
			System.out.println(objText);
		}
		
		Thread.sleep(6500);
		driver.quit();

	}

}
