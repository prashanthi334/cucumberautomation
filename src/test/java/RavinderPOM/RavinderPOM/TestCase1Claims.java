package RavinderPOM.RavinderPOM;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestCase1Claims extends BaseTest{
	
	//public  WebDriver driver;
Login obj1 = new Login(driver);

	
	 // @Test
	  
	 @Test(priority=1) 
	  public void login() throws InterruptedException{
	  obj1.userLogin();
	  //driver.get("https://www.cigna.com/");
	  
	  }
	 

//@Test	
@Test(priority=2)
public void claimsEOB() throws InterruptedException {
	//obj1.userLogin();
 ClaimsEOB obj2 = new ClaimsEOB(driver);
 Thread.sleep(1000);
 obj2.mouseHoverEvent(obj2.claimsHover);
 Thread.sleep(1000);
 //obj2.claimsSubLink.click();
 obj2.ExplanationofBenifitsSubLink.click();
 Thread.sleep(1000);
 obj2.selectEOB("PRASHANTHI");
 Thread.sleep(1000);
 obj2.SelectDateRangeDropdown.click();
 Thread.sleep(1000);
 obj2.SelectDateRange.click();
 obj2.EOBbutton.click();
 
 Thread.sleep(1000);
	}
//@Test
@Test (priority=3)
public void claims() throws InterruptedException {
	Claims obj4 = new Claims(driver);
	 obj4.mouseHoverEvent(obj4.claimsHover);
	 Thread.sleep(1000);
	obj4.claimsSubLink.click();
	Thread.sleep(1000);
	obj4.PriorYearClaims.click();
	Thread.sleep(1000);
	obj4.ClaimsForPrashanthi.click();
	Thread.sleep(1000);
	obj4.ViewDetails.click();
	Thread.sleep(1000);
	obj4.BacktoClaims.click();
	Thread.sleep(1000);
	}

	//
//@Test	
@Test (priority=4)
	public void logout() throws InterruptedException {
 
 Logout obj3=new Logout(driver); 
 obj3.userLogout( obj3.profileHead);
 obj3.logout.click();
	}

		
}
	

