package RavinderPOM.RavinderPOM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class BasePage {
	
	public  WebDriver driver;
	private static final int TIMEOUT=5;
	private static final int POLLING = 100;
	
	
	public BasePage(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver","E:\\WebDriver\\Prashanthi\\drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("https://www.cigna.com/");
	
this.driver=driver;
PageFactory.initElements(new AjaxElementLocatorFactory(driver,TIMEOUT), this);
	
	}
}
