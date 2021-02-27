package RavinderPOM.RavinderPOM;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;

/**
 * Hello world!
 *
 */
public class Login extends BasePage
{
	//public WebDriver driver;
	
	public Login(WebDriver driver)
	{
		super(driver);
	}
	
	//*[@id=\"1564310141627\"]/div/header/div[2]/nav[2]/div/ul/li[2]/a
 @FindBy(xpath="//li[@class='list-inline-item']//a[@class='btn btn-sm btn-primary' and text()='Log in to myCigna']")
	
 public WebElement loginToMyCigna;
 

@FindBy(id="username")
 public WebElement userName;
 
 @FindBy(id="password")
 public WebElement password;
 
 @FindBy(id="loginbutton")
 public WebElement loginButton;
 
 @FindBy(xpath="/html/body/div/div[2]/div[2]/cigna-modal-layout/footer/cigna-modal-layout-control[2]/button")
 public WebElement notNow;
 
public void userLogin() throws InterruptedException {
	
	loginToMyCigna.click();
	
	
	Thread.sleep(2000);
	
	String parent = driver.getWindowHandle();
	System.out.println(parent);
	 Set <String> Handles = driver.getWindowHandles();
	 int browsercount=Handles.size();
	 System.out.println(browsercount);
	 
	 for (String s1:Handles)
	 {
		 if (!s1.equals(parent))
		 {
			 driver.switchTo().window(s1);
			 System.out.println(driver.getCurrentUrl());
		 }
	 }
	 
	 
	 userName.sendKeys("prashanthi1985");
	 
		Thread.sleep(5000);
		password.sendKeys("D1@donuru");
		Thread.sleep(2000);
		loginButton.click();
		Thread.sleep(5000);
		notNow.click();
		Thread.sleep(2000);
		

}
 
 
}
