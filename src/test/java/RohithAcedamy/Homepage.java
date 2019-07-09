package RohithAcedamy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Resources.base;

public class Homepage extends base {

	WebDriver driver;
	@Test
	public void performelogin() throws IOException
	{
		driver = Initializedriver();
		PageobjectHome ph = new PageobjectHome(driver);
		driver.get("http://www.qaclickacademy.com/");
		ph.login().click();
		//PageobjectLogin pl = new PageobjectLogin();
		PageobjectLogin pl = new PageobjectLogin(driver);
		pl.email().sendKeys("rohith");
		pl.pass().sendKeys("password1");
		pl.submit().click();
		System.out.println("Login sucessfully done");
	}
}
