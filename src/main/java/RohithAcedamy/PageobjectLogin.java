package RohithAcedamy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.base;

public class PageobjectLogin extends base {

	WebDriver driver;
	public PageobjectLogin(WebDriver driver)
	{
	this.driver = driver;	
	}
	By username = By.cssSelector("#user_email");
	By password = By.cssSelector("#user_password");
	By submit = By.xpath("//input[@value='Log In']");
	
	public WebElement email()
	{
		//driver = Initializedriver();
		return driver.findElement(username);
	}
	public WebElement pass()
	{
		return driver.findElement(password);
	}
	public WebElement submit()
	{
		return driver.findElement(submit);
	}
}
