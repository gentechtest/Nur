package upload;

import java.io.File;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageFactory.ContentPage;
import basic.BasicTestCase;

public class Download extends BasicTestCase {
	private ContentPage obj = PageFactory.initElements(getWebDriver(), ContentPage.class);
	
	@Test(description ="Проверяет скачку треков ")
	public void download () throws Exception {
		driver.get(musicUrl);
		String TrackTitle = obj.FirstTrack.getAttribute("audio_name");//gets name of track that will be download
		String a= TrackTitle.replace(" ", "+").replace("—", "-");//reconstruct track name
		String c= a+"(music.nur.kz)";//adds string
		File file = new File("C:\\Users\\Voice\\Download\\"+c+".mp3"); // file path
	    //Switch to new window
		final Set<String> oldWindowsSet = driver.getWindowHandles();
        
		driver.findElement(By.xpath("//*[@class='addthis control download download-track-counter']")).click();//download track	
		WebDriver driver = BasicTestCase.getWebDriver();
		String newWindow = (new WebDriverWait(driver, 10))
	            .until(new ExpectedCondition<String>() {
	                public String apply(WebDriver driver) {
	                    Set<String> newWindowsSet = driver.getWindowHandles();
	                    newWindowsSet.removeAll(oldWindowsSet);
	                    return newWindowsSet.size() > 0 ? 
	                                 newWindowsSet.iterator().next() : null;
	                  }
	                }
	            );
	     driver.switchTo().window(newWindow);
	      try {  
	     driver.findElement(By.xpath("//*[@class='one-track-block']/a[1]")).click(); // click on download link
	      }
	      catch (NoSuchElementException e) {
	    	  System.out.println("На странице "+driver.getCurrentUrl()+ " неотображается ссылка <<Скачать песню>>");
	      }
		//wait, while track doesn't download, but only 3 minutes 
		int i =0;//set timer to zero
		while (!file.canRead()) { //while file can't read file timer +1 second
		i++;
		Thread.sleep(1000);
		if (i>=120) { // max wait 180 seconds
			System.out.println("Время ожидания загрузки истекло "); // if file downloading more than 180 seconds print error!!
			Reporter.log("Время ожидания загрузки истекло");
		break; // out of "while"
			}
		}
	    if  (!file.exists()) {
	    	System.out.println("Трек не найден");
	    	Reporter.log("Трек не нейден");
	    	throw new NullPointerException(); // check if file not existing print error
	    }
	    	else file.delete(); // if exist delete file
	    
}
}
