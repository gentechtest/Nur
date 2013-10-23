package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContentPage {
	
	//for head links
		@FindBy (xpath = "//*[@id='logo']/div/a") //site logo
		public WebElement Logo;
		   
		@FindBy (xpath = "//*[@class='base-menu']//a") //link "music"
		public WebElement Music;

		@FindBy (xpath = ".//*[@id='wrapper']/div[2]/ul/li[1]/a") //link "new music"
		public WebElement NewMusic;
		   
		@FindBy (xpath = ".//*[@id='wrapper']/div[2]/ul/li[2]/a") //link "kazahskaya"
		public WebElement Kazahskaya;

		@FindBy (xpath = ".//*[@id='wrapper']/div[2]/ul/li[3]/a") //link "play list"
		public WebElement PlayList;

		 @FindBy (xpath = ".//*[@id='wrapper']/div[2]/ul/li[4]/a") //link "download"
		public WebElement Upload;

		 @FindBy (xpath = ".//*[@id='wrapper']/div[2]/ul/li[5]/a") //link "karaoke"
		public WebElement Karaoke;

		 //for logo
		 @FindBy (xpath ="//*[class='left']/li[1]") //link "main page"
		 public WebElement MainPage;

		 @FindBy (xpath =".//*[@id='js-add-to-home-page']/a") //link "make start page"
		 public WebElement MakeStartPage;

		 @FindBy (xpath =".//*[@id='header-new']//li[3]/a") //link "kazah lang"
		 public WebElement KazahVers;  
		   
		   
		    //for play list
		    @FindBy (xpath = "//*[@class='row']/a[2]")
		    public WebElement DelTrack; // delete track from play list
		    
		    @FindBy (xpath = "//*[@class='advanced_playlist']/li[1]")// 1-track in block
		    public WebElement FirstTrack;
		    
		    @FindBy (xpath = "//*[@class='row']/a[1]") // add track to play list
		    public WebElement AddTrack;
		    
		    @FindBy (xpath = "//*[@class='left']//*[@class='advanced_playlist']/li[1]") // first track in play list
		    public WebElement FirstPlaylistTrack;
		    
		     //for search
		    @FindBy (xpath = "//*[@id='audio_search']") // search field
		    public WebElement SearchField;
		    
		    @FindBy (xpath = "//*[@class='w_100']")
		    public WebElement SearchSubmit;
		      

}
