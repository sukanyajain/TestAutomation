import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumwebdrivertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		
		
		driver.get("https://youtube.com");
//		driver.findElement(By.xpath("//*[@id=\"text\"]")).click();
		driver.findElement(By.name("search_query")).sendKeys("abc");
		driver.findElement(By.id("search-icon-legacy")).click();
		
		
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		driver.close();
		driver.quit();
		

	}

}
