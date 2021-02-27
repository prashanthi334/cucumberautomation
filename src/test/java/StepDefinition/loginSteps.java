package StepDefinition;


import static org.testng.Assert.assertTrue;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import RavinderPOM.RavinderPOM.BasePage;
import RavinderPOM.RavinderPOM.BaseTest;
import RavinderPOM.RavinderPOM.Login;
import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginSteps{



WebDriver driver;

@Given("^User is on Home Page$")
public void user_is_on_Home_Page() throws Throwable {
	System.setProperty("webdriver.chrome.driver","E:\\WebDriver\\Prashanthi\\drivers\\chromedriver.exe");
	 driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://www.cigna.com/");
    // Write code here that turns the phrase above into concrete actions
}

@When("^User Navigate to LogIn Page$")
public void user_Navigate_to_LogIn_Page() throws Throwable {
   driver.findElement(By.xpath("//li[@class='list-inline-item']//a[@class='btn btn-sm btn-primary' and text()='Log in to myCigna']")).click();
   Thread.sleep(5000);
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
}

@When("^User enters \"(.*)\" and \"(.*)\"$")
public void user_enters_and(String UserName, String Password) {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UserName);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
}

@Then("^Error Messages are displayed$")
public void error_messages_are_displayed() {
   boolean usernameerrDislayed = driver.findElement(By.xpath("//*[contains(text(),'Username required.')]")).isDisplayed();
   boolean passworderrDislayed =driver.findElement(By.xpath("//*[contains(text(),'Password required.')]")).isDisplayed();
  assertTrue(usernameerrDislayed);
  assertTrue(passworderrDislayed);
}



@When("^User enters <UserName> and <Password>$")
public void user_enters_UserName_and_Password(String UserName,String Password ) throws Throwable {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys(UserName);
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Password);
	driver.findElement(By.xpath("//input[@id='loginbutton']")).click();
}

@Then("click on popup message")
public void click_on_popup_message() throws InterruptedException {
	Thread.sleep(2000);	
	driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/cigna-modal-layout/footer/cigna-modal-layout-control[2]/button")).click();
    
}

@Then("^Message displayed Login Successfully$")
public void message_displayed_Login_Successfully() throws Throwable {
	boolean successfulLogin = driver.findElement(By.xpath("//*[contains(text(),' Welcome, Prashanthi! ')]")).isDisplayed();
	assertTrue(successfulLogin);
}

@Then("^User LogOut from the Application$")
public void user_LogOut_from_the_Application() throws Throwable {
	Thread.sleep(2000);	 
	Actions action = new Actions(driver);
		 WebElement profileHead= driver.findElement(By.xpath("//div[contains(text(),'Hi,')]"));
		 action.moveToElement(profileHead).build().perform();
		 driver.findElement(By.xpath("//*[contains(text(),'Log Out')]")).click();
    
 }

@Then("^Message displayed LogOut Successfully$")
public void message_displayed_LogOut_Successfully() throws Throwable {
	Thread.sleep(2000);	 
	boolean successfulLogout = driver.findElement(By.xpath("//*[text()=' Log in for important information and to assess your COVID-19 risk.']")).isDisplayed();
	assertTrue(successfulLogout);
     
    throw new PendingException();
}

	
	
	
}
