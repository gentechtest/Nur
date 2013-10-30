package basic;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import data.UserData;

//import data.UserData;

public class BasicTestCase {
	 public String baseUrl = ("http://music.nur.kz/");
	 protected String searchWord = "Armin";
	 protected static WebDriver driver;
	 @BeforeTest
	 protected static WebDriver getWebDriver() {
	  if (driver == null) {
	   System.setProperty("webdriver.chrome.driver", "C:/chromedriver.exe");
	   driver = new ChromeDriver();
	  //driver = new FirefoxDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  }
	  return driver;
	 }
	 public UserData user = new UserData("testpasswordx", "test2_nur");
	 protected String musicUrl = "http://music.nur.kz/";
	 protected String kazahUrl = "http://music.nur.kz/audio_kz";
	 protected String novinkiUrl = "http://music.nur.kz/new";
	 protected String playlistUrl = "http://music.nur.kz/user-4130233";
	 protected String uploadUrl = "http://music.nur.kz/upload";
	 public void assertPage(String yourPage) throws Exception {
		 if(!yourPage.equals(driver.getCurrentUrl())){
		 System.out.println("Неудалось перейти на "+yourPage);
	     Reporter.log("Неудалось перейти на "+yourPage);
	     throw new AssertionError ();
		 }
	 }
	 @AfterTest
	 public void thearDown() throws Exception {
	        driver.quit();
	  }
	
	 
}
