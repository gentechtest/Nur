package user;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.LoginPage;
import basic.BasicTestCase;
public class Login extends BasicTestCase {
	private LoginPage loginPage = PageFactory.initElements(getWebDriver(), LoginPage.class);
	@Test(priority=1, groups={"Login"}, description="Тестируем логин")
	public void LogIn () throws Exception {
	driver.get(baseUrl);
	loginPage.loginAs(user);
	assertTrue(loginPage.isLogedIn());
	}
}

