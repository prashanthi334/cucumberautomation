package RavinderPOM.RavinderPOM;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ClaimTest extends BaseTest{
	
	//public  WebDriver driver;
Login obj1 = new Login(driver);

	@Test
	public void test() throws InterruptedException {
	
		driver.get("https://www.cigna.com/");
		obj1.userLogin();
 

 Claims obj2 = new Claims(driver);
 obj2.mouseHoverEvent( obj2.claimsHover);
 obj2.claimsSubLink.click();
 
 Thread.sleep(3000);
 
 Logout obj3=new Logout(driver); 
 obj3.userLogout( obj3.profileHead);
 obj3.logout.click();
 

//	//obj1.loginToMyCigna.click();
//	Thread.sleep(2000);
//	
//	String parent = driver.getWindowHandle();
//	System.out.println(parent);
//	 Set <String> Handles = driver.getWindowHandles();
//	 int browsercount=Handles.size();
//	 System.out.println(browsercount);
//	 
//	 for (String s1:Handles)
//	 {
//		 if (!s1.equals(parent))
//		 {
//			 driver.switchTo().window(s1);
//			 System.out.println(driver.getCurrentUrl());
//		 }
//	 }
	 
	 // login
//	 obj1.userName.sendKeys("prashanthi1985");
//	 
//		Thread.sleep(5000);
//		obj1.password.sendKeys("D1@donuru");
//		Thread.sleep(2000);
//		obj1.loginButton.click();
//		Thread.sleep(5000);
//		obj1.notNow.click();
//		Thread.sleep(2000);
		
		
//		// claims
//		Claims obj2 = new Claims(driver);
//		
//		
//		
//		 Actions actions1 = new Actions(driver);
//		
//		 WebElement menuElement2 = obj2.claimsHover;
//			 actions1.moveToElement(menuElement2).build().perform();
//			 Thread.sleep(1000);
		
		
		// Logout
		
	
		 
		
	
		
}
	}

