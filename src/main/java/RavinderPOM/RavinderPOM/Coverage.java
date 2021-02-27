package RavinderPOM.RavinderPOM;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Coverage extends BasePage {
	
	
	
	public Coverage(WebDriver driver) {
		super(driver);
		
	}

	
	 @FindBy(xpath="//a[text()= ' Coverage' and @class='nav-link-focus-label ng-star-inserted']")
	 public  WebElement coverage;
	 
	 @FindBy(xpath="//a[text()=' Medical ']")
	 public  WebElement coverageSubMenuMedical;
	 
	 @FindBy(xpath="//span[contains(text(),' Prashanthi (Subscriber) ')]")
	 public WebElement coverageDetailsDropdown1;
	 
	 @FindBy(xpath="//span[contains(text(),' Ravinder (Spouse/Partner)')]")
	 public  WebElement ravinder;
	 
	 @FindBy(xpath="//span[contains(text(),' In-Network ')]")
	 public  WebElement coverageDetailsDropdown2;
	 
	 @FindBy(xpath="//span[contains(text(),' Out-of-Network')]")
	 public  WebElement outofNetwork;
	 
	public void coverageMouseHover(WebElement element) throws InterruptedException {
	
		Actions action = new Actions(driver);
		action.moveToElement(coverage).build().perform();
		Thread.sleep(1000);
	}

	
public void coverageDropdown() throws InterruptedException {
coverageDetailsDropdown1.click();
Thread.sleep(1000);
ravinder.click();
coverageDetailsDropdown2.click();
Thread.sleep(1000);
outofNetwork.click();

//Select dropdown=new Select(driver);


	}

}
