import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserTest {

	
	public static void main(String[] args) throws InterruptedException {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		
		System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
//		
//		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/geckodriver/chromedriver");
//		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		
		driver.get("https://payperuse2.1stmain.dev/1stmain");
		
//		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("abcd");
//		
//		List<WebElement> listOfInputElements = driver.findElements(By.xpath("//input"));
//		
//		int count = listOfInputElements.size();
//		
//		System.out.println("Count of Input elemtns : "+count);
//		
//		Thread.sleep(3000);
//		
		WebElement loginbutton = driver.findElement(By.xpath("//span[contains(text(), 'Login')]"));
        System.out.println("Clicking on the login element in the main page");
        loginbutton.click();
 
        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
    
        WebElement username=driver.findElement(By.xpath("//input[@name= 'email']"));
        WebElement password=driver.findElement(By.xpath("//input[@name= 'password']"));
        WebElement login=driver.findElement(By.xpath("//button[@name='submit']"));
    
        username.sendKeys("radhika@1stmain.co");
        password.sendKeys("admin@123");
        login.click();
        
        WebElement hamburg = driver.findElement( By.xpath("//div[@id='menu-toggle'])[2]"));
        
        hamburg.click();
       

		driver.close();
		driver.quit();
		
	}
	
}
