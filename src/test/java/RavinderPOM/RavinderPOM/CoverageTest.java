package RavinderPOM.RavinderPOM;

import org.testng.annotations.Test;

public class CoverageTest extends BaseTest {
	
	Login obj1 = new Login(driver);
	Coverage obj2=new Coverage(driver);
	Logout obj3=new Logout(driver);
		
	
	@Test
	public void coverTest() throws InterruptedException {
		
	obj1.userLogin();
	obj2.coverageMouseHover(obj2.coverage);
	obj2.coverageSubMenuMedical.click();
	obj2.coverageDropdown();
	obj3.userLogout(obj3.profileHead);
	obj3.logout.click();
	driver.quit();
	
	
	
	}
}
