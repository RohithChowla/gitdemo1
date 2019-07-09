package RohithAcedamy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageobjectHome {

	public WebDriver driver;
		
		By Login = By.xpath("//span[contains(text(),'Login')]");
		
		public PageobjectHome(WebDriver driver)
		{
			this.driver = driver;
			
		}

		public WebElement login()
		{
			return driver.findElement(Login);
		}
	
}
