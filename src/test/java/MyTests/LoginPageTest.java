package MyTests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.qa.CRM.Mypages.LoginPage;

public class LoginPageTest extends BaseTest {
	
	@Test
	public void loginFnTest() {
		LoginPage loginpage=  new LoginPage(driver);
		loginpage.doLoginByClickOnLoginBtn("siva", "sai");
		
	}

}
