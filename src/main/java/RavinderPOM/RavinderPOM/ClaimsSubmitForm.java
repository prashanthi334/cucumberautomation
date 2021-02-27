package RavinderPOM.RavinderPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class ClaimsSubmitForm extends BasePage
{
	//public WebDriver driver;
	
	public ClaimsSubmitForm(WebDriver driver)
	{
		super(driver);
	}
	
	
 @FindBy(xpath="//a[text()=' Claims']")
public  WebElement claimsHover;
 

@FindBy(xpath="//a[contains(text(),' Forms Center ')]")
 public WebElement formsCenter;

@FindBy(xpath="//a[contains(text(),' Submit a Claim Online ')]")
public WebElement submitaClaimOnline;


@FindBy(xpath="//div[@class='single-product-card ng-star-inserted']//button[contains(text(),' Start a Submission ')]")
public WebElement StartaSubmission;

@FindBy(xpath="//*[contains(text(),' Start ')]")
public WebElement startButton;

@FindBy(xpath= "(//a[@class='patient-button'])[2]")
public WebElement patientButton;

@FindBy(xpath="//*[text()=' Next ']")
public WebElement nextButton;


@FindBy(xpath="//*[text()=' Cancel Your Claim ']")
public WebElement cancelYourClaim;






public void mouseHoverEvent(WebElement element) throws InterruptedException {
Actions action = new Actions(driver);
action.moveToElement(claimsHover).build().perform();
//Action mouseOver =action.moveToElement(claimsHover).build();
//mouseOver.perform();
Thread.sleep(3000);
}



}





















/*
//claims clikc
Actions actions1 = new Actions(driver);
WebElement menuElement1 = driver.findElement(By.xpath("/html/body/cigna-root/cigna-layout/cigna-header/header/cigna-site-navigation/nav/div[3]/cigna-nav-link/a"));
//WebElement menuElement1 = driver.findElement(By.xpath("//cigna-nav-link[@class='top-link extra-padded active']//a[contains(text(),' Claims') and @class='nav-link-focus-label ng-star-inserted']"));


Thread.sleep(3000);
actions1.moveToElement(menuElement1).build().perform();
//   //a[@class='nav-link-focus-label ng-star-inserted' and text()=' Claims ']
   driver.findElement(By.xpath("/html/body/cigna-root/cigna-layout/cigna-header/header/cigna-site-navigation/nav/div[3]/cigna-link-container/cigna-nav-link[1]/a")).click();
  
  Thread.sleep(3000);
  //select radio butotn --//i[@class='custom-radio']//parent::label[@class='radio-holder']//input[@data-test-id='rdbYeartoDate']
   driver.findElement(By.xpath("/html/body/cigna-root/cigna-layout/main/cigna-summary-page/div/section/cigna-summary-side-bar/aside/cigna-radio-group[1]/div/fieldset/cigna-radio-option[2]/div/label/input")).click();
   
   
   driver.findElement(By.xpath("/html/body/cigna-root/cigna-layout/main/cigna-summary-page/div/section/cigna-summary-side-bar/aside/cigna-radio-group[2]/div/fieldset/cigna-radio-option[1]/div/label/input")).click();
   
	 Thread.sleep(3000);
	 
	 //view deatils 2  --  //(//a[@class='claim__footer__right__link viewDetails'])[2]
  driver.findElement(By.xpath("(//a[@class='claim__footer__right__link viewDetails'])[2]")).click();
   
 Thread.sleep(3000);
 



 */
 

