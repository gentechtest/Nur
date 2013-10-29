package pageFactory;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import basic.BasicTestCase;

public class Download extends BasicTestCase {
	private ContentPage obj = PageFactory.initElements(getWebDriver(), ContentPage.class);
	@Test(dependsOnGroups={"Login"})
	public void downloadTrack () throws InterruptedException {
		String TrackTitle = obj.FirstTrack.getAttribute("audio_name");//gets name of track that will be download
		String a= TrackTitle.replace(" ", "+").replace("—", "-");//reconstruct track name
		String c= a+"(music.nur.kz)";//adds string
		File file = new File("C:\\Users\\Voice\\Downloads\\"+c+".mp3");
		driver.findElement(By.xpath("//*[@class='addthis control download download-track-counter']")).click();//download track
		driver.findElement(By.xpath("//*[@class='one-track-block']/a[1]")).click();
		
		//Нада добавить переход на другую вкладку
		
		//wait, while track doesn't download, but only 3 minutes 
		int i =0;//set timer to zero
		while (!file.canRead()) { //while file can't read file timer +1 second
		i++;
		Thread.sleep(1000);
		if (i>=180) { // max wait 180 seconds
			System.out.println("Timeout error!"); // if file downloading more than 180 seconds print error!!
		break; // out of "while"
					}
		}
	    if  (!file.exists())  throw new NullPointerException("No track found"); // check if file not existing print error
	    else file.delete(); // if exist delete file
	}

}
