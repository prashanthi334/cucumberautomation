package RavinderPOM.RavinderPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Logout extends BasePage{

	public Logout(WebDriver driver)
	{
		super(driver);
	}
	
	 
	 @FindBy(xpath="//a[text()=' Log Out ']")
	 public WebElement logout;
	 
	 @FindBy(xpath="//div[contains(text(),'Hi,')]")
	 public WebElement profileHead;
	 
	 public void userLogout(WebElement element) throws InterruptedException {
		 Actions action = new Actions(driver);
		 action.moveToElement(profileHead).build().perform();
	 
		/*
		 * Actions actions1 = new Actions(driver); //WebElement menuElement1 =
		 * driver.findElement(By.xpath(
		 * "/html/body/cigna-root/cigna-layout/cigna-header/header/cigna-site-navigation/nav/div[3]/cigna-nav-link/a"
		 * )); WebElement menuElement1 = obj.profileHead;
		 * actions1.moveToElement(menuElement1).build().perform(); Thread.sleep(1000);
		 * obj1.Logout.click();
		 */
	
		 
	 Thread.sleep(3000);
	 }	
}
