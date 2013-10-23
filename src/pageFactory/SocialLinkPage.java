package pageFactory;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;


public class SocialLinkPage extends MethodsPage {
	 public SocialLinkPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	//Social network
	   @FindBy (xpath = "//*[@class='pluso-wrap']/a[1]") //link "Vkontakte"
	   public WebElement Vkontakte;

	   @FindBy (xpath = "//*[@class='pluso-wrap']/a[2]") //link "Odnoklasniki"
	   public WebElement Odnoklasniki;
	  
	   @FindBy (xpath = "//*[@class='pluso-wrap']/a[3]") // link "Facebook"
	   public WebElement Facebook;
	  
	   @FindBy (xpath = "//*[@class='pluso-wrap']/a[4]") // link "Twitter"
	   public WebElement Twitter;
	  
	   @FindBy (xpath = "//*[@class='pluso-wrap']/a[5]") // link "Google"
	   public WebElement Google;
	  
	   @FindBy (xpath = "//*[@class='pluso-wrap']/a[6]") // link "Live Journal"
	   public WebElement LiveJournal;
	   
	   @FindBy (xpath = "//*[@class='pluso-wrap']/a[7]") // link "Tumblr"
	   public WebElement Tumbler;
	  
	   @FindBy (xpath = "//*[@class='pluso-wrap']/a[8]") // link "Mailru"
	   public WebElement Mailru;
	  
	   @FindBy (xpath = "//*[@class='pluso-wrap']/a[9]") // ajax "Pluso"
	   public WebElement Pluso;
	/*-------------------------------------------------------------------------------------------------------*/
	   
	/*Check social links is present*/
	public void checkSocialLinks () throws Exception {
	try {
	Vkontakte.isDisplayed();
	Odnoklasniki.isDisplayed();
	Twitter.isDisplayed();
	Google.isDisplayed();
	LiveJournal.isDisplayed();
	Tumbler.isDisplayed();
	Mailru.isDisplayed();
	Pluso.isDisplayed();
	Facebook.isDisplayed();
	}
	catch (NoSuchElementException e) {
	String errorUrl = driver.getCurrentUrl();
	log("FAILED: by no such element error on page "+errorUrl);
	Reporter.log("FAILED: by no such elemnt on page "+errorUrl);
	throw new NoSuchElementException ();
		  }
	} 
}
