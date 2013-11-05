package upload;

import java.awt.Toolkit;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basic.BasicTestCase;

public class Download extends BasicTestCase {
	
	@Test(description ="Проверяет скачку треков ")
	public void download () throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		driver.get(musicUrl);
		driver.findElement(By.xpath("//*[@class='addthis control download download-track-counter']")).click();//download track
		
		//Check PC
		System.out.println(Toolkit.getDefaultToolkit().getScreenSize()); 
		
		//Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
	      try {  
	     driver.findElement(By.xpath("//*[@class='one-track-block']/a[1]")).click(); // click on download link
	      }
	      catch (NoSuchElementException e) {
	    	  Reporter.log("На странице "+driver.getCurrentUrl()+ " неотображается ссылка <<Скачать песню>>",true);
	      }
	      Thread.sleep(2000);
	      driver.get("chrome://downloads/");
	      String stats= driver.findElement(By.xpath("//*[@class='status']")).getText();
	      System.out.println(stats);
	      try {
	      wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='controls']/a[1]")));
	      }
	      catch (TimeoutException e) {
	    	  Reporter.log("Трек не скачался",true);
	    	  throw new NullPointerException ();
	      }
	      String fileName = driver.findElement(By.xpath("//*[@class='title-area']/a")).getText();
	      File file = new File("C:\\Users\\Voice\\Downloads\\"+fileName); // file path
	      System.out.println(file);
	      if  (!file.exists()) {
		    	System.out.println("Трек не найден");
		    	Reporter.log("Трек не нейден");
		    	throw new NullPointerException(); // check if file not existing print error
		    }    // if exist delete file   
		    	else file.delete();
	      		System.out.println("Трек успешно скачан, и был удален");
	      
	   
	 
	
	}
	public void  DownloadSpeed () {  
		
		 String starts= driver.findElement(By.xpath("//*[@class='status']")).getText();
	      if(starts.contains("–")) {
	    	  	
	    	  int end = starts.indexOf("–");
		      int start = 0;
		      char buf[] = new char[end - start];
		      starts.getChars(start, end, buf, 0);
		      System.out.println(buf);
	      }
	      else if (starts.contains("-")) {
	    	  
	    	  int end = starts.indexOf("–");
		      int start = 0;
		      char buf[] = new char[end - start];
		      starts.getChars(start, end, buf, 0);
		      System.out.println(buf);
	      }
	
	}
	      public void DownloadedSize () {
	    	 
	    	  String stats= driver.findElement(By.xpath("//*[@class='status']")).getText();
	    	  if(stats.contains("–")) {
	    	  	
	    	  int start = stats.indexOf("–")+2;
		      int end = stats.lastIndexOf("из");
		      char buf[] = new char[end - start];
		      stats.getChars(start, end, buf, 0);
		      System.out.println(buf);
	      }
	      else if (stats.contains("-")) {
	    	  
	    	  int start = stats.indexOf("–")+2;
		      int end = stats.lastIndexOf("из");
		      char buf[] = new char[end - start];
		      stats.getChars(start, end, buf, 0);
		      System.out.println(buf);
	      }
	     }
	      public void FileSize() {
	    	  String stats= driver.findElement(By.xpath("//*[@class='status']")).getText();
	    	  if(stats.contains("–")) {
	    	  	
	    	  int start = stats.indexOf("з")+2;
		      int end = stats.lastIndexOf("МБ")+2;
		      char buf[] = new char[end - start];
		      stats.getChars(start, end, buf, 0);
		      System.out.println(buf);
	      }
	      else if (stats.contains("-")) {
	    	  
	    	  int start = stats.indexOf("з")+2;
		      int end = stats.lastIndexOf("МБ")+2;
		      char buf[] = new char[end - start];
		      stats.getChars(start, end, buf, 0);
		      System.out.println(buf);
	      }
	      }
	    
}
