package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class base {
	WebDriver driver;
	public WebDriver Initializedriver() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\rcgc\\E2EFrameworkProject\\src\\main\\java\\Resources\\resource.properties");
		prop.load(file);
		String Browsername =prop.getProperty("browser");
		System.out.println(Browsername);
		if(Browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rcgc\\Documents\\rohith\\Chevron\\Automation Softwares\\Share Folder\\Share Folder\\LUBS-EC-AEM-AutomationTests\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		if(Browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\rcgc\\Documents\\rohith\\selenium Automation mars\\Selenium Testing\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	
}
