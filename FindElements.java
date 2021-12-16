package scripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Zapcom\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<links.size();i++) {
			boolean status=links.get(i).isDisplayed();
			if(status) {
				String linkText=links.get(i).getText();
				System.out.println(linkText);
				links.get(i).sendKeys(Keys.TAB);
			}
		}
		
		Thread.sleep(6500);
		driver.quit();

	}

}
