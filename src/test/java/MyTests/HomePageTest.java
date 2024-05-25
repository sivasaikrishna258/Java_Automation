package MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.qa.CRM.Mypages.HomePage;
import com.qa.CRM.Mypages.LoginPage;

public class HomePageTest extends BaseTest{
	
	@Test
	public void clickOnCalendarLink() {
		LoginPage loginpage=new LoginPage(driver);
		HomePage homepage=new HomePage(driver);
		 homepage=loginpage.doLoginByClickOnLoginBtn("sivasaikrishna258@gmail.com", "Sivasai@123");
		homepage.clickonCalendarlink();
	}

}
