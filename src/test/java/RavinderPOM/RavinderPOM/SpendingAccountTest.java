package RavinderPOM.RavinderPOM;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SpendingAccountTest extends BaseTest{
	
	//public  WebDriver driver;
Login obj1 = new Login(driver);
SpendingAccounts obj2 = new SpendingAccounts(driver);

	
	 // @Test
	  
	 @Test(priority=1) 
	  public void login() throws InterruptedException{
	  obj1.userLogin();
	  //driver.get("https://www.cigna.com/");
	  
	  }
	 
	

//@Test
@Test (priority=2)
public void spendingaccounts() throws InterruptedException {
	
	 obj2.mouseHoverEvent(obj2.spendingAccountHover);
	 Thread.sleep(1000);
	obj2.MRA.click();
	Thread.sleep(1000);
	obj2.viewYourWellnessFunds.click();
	Thread.sleep(1000);
	 obj2.viewRecentActivity("Ravinder");
	
	Thread.sleep(1000);
	 obj2.programPeriodDropdown("Motivate Me");
	Thread.sleep(1000);
	
		
	}

	//
//@Test	
@Test (priority=3)
	public void logout() throws InterruptedException {
 
 Logout obj3=new Logout(driver); 
 obj3.userLogout( obj3.profileHead);
 obj3.logout.click();
 Thread.sleep(1000);
 
	
	}

		
}
	

