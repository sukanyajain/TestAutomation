package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public  LoginPage(WebDriver rdriver)
	{
		
		driver=rdriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="Email")
	WebElement txtemail;
	
	
	@FindBy(id="password")
	WebElement paswd;
	
	@FindBy(xpath="//input[@value='log in']")
	WebElement btnlogin;
	
	@FindBy(linkText="Logout")
	WebElement logout;
	
    public void setUsername(String uname) {
	txtemail.clear();
	txtemail.sendKeys(uname);
}
	
    public void setPaswrd(String pswd) {
	paswd.clear();
	paswd.sendKeys(pswd);
}
    public void ClickLogin() {
    	btnlogin.click();
    }
	
    public void logout() {
    	logout.click();
    }
	

	
	
	
	

}
