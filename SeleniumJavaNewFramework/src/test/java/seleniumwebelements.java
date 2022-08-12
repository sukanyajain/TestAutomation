import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class seleniumwebelements {

	public static void main(String[] args) {
		
		
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
		
         driver.get("http://google.com/");
		
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
		 
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			driver.close();
			driver.quit();
		
		
	}

}
