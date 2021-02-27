package RavinderPOM.RavinderPOM;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClaimsSubmissionTest extends BaseTest{
	
	//public  WebDriver driver;
Login obj1 = new Login(driver);
ClaimsSubmitForm obj4 = new ClaimsSubmitForm(driver);

	
	 // @Test
	  
	 @Test(priority=1) 
	  public void login() throws InterruptedException{
	  obj1.userLogin();
	  //driver.get("https://www.cigna.com/");
	  
	  }
	 
	

//@Test
@Test (priority=2)
public void claims() throws InterruptedException {
	
	 obj4.mouseHoverEvent(obj4.claimsHover);
	 Thread.sleep(1000);
	obj4.formsCenter.click();
	Thread.sleep(1000);
	obj4.submitaClaimOnline.click();
	Thread.sleep(1000);
	obj4.StartaSubmission.click();
	Thread.sleep(1000);
	obj4.startButton.click();
	Thread.sleep(1000);
	obj4.patientButton.click();
	Thread.sleep(1000);
	obj4.nextButton.click();
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
 obj4.cancelYourClaim.click();
	Thread.sleep(1000);
	}

		
}
	

