package RavinderPOM.RavinderPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	public  WebDriver driver;
	
	public BaseTest() {
	

	System.setProperty("webdriver.chrome.driver","E:\\WebDriver\\Prashanthi\\drivers\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  driver.get("https://www.cigna.com/");
	
	}
}
