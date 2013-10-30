package content;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basic.BasicTestCase;

public class PlayMusicOnLand extends BasicTestCase {
	 //Play music test
	   public void playMusic () throws Exception {
	   driver.findElement(By.xpath("//*[@class='row']/strong/a")).click();
	   driver.findElement(By.xpath("//*[@class='mainsection']//*[@class='advanced_playlist']/li/a[1]")).click();
	   String play = driver.findElement(By.xpath("//*[@class='mainsection']//*[@class='advanced_playlist']/li/a")).getAttribute("style");
	   if (play.equals("")) {
		   System.out.println("На странице "+driver.getCurrentUrl()+" не кликает на кнопку <<play>>");
		   Reporter.log("На странице "+driver.getCurrentUrl()+" не кликает на кнопку <<play>>");
		   throw new NullPointerException (); 
	   }
	   for(int i=0; i<=35; i++) {
	   String styl = driver.findElement(By.xpath(".//*[@id='progress_slider']/a")).getAttribute("style");   
	   if(styl.equals("left: 0%;")) {    
	   Thread.sleep(1000);
	   } else break;
	   if(i>=30) { //set how long wait
	    	System.out.println("На странице "+driver.getCurrentUrl()+" не играет трек");
		    Reporter.log("На странице "+driver.getCurrentUrl()+" не играет трек");
		    throw new NullPointerException ();
	   }   
	   }
	   }
	   //Play music on a page
	@Test(priority=1, description="Проверяет играет ли трек на странице скачки")
	public void PlayMusic () throws Exception {
	   driver.get(musicUrl);
	   assertPage(musicUrl);
	   playMusic();
}
}
