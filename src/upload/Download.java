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
	
	String voicePC = "C:\\Users\\Voice\\Downloads\\"; //path to track on Voice PC
	String statsPC = "C:\\Users\\stats\\Downloads\\"; //path to track on Stats PC
	String filePath ; // if result
	
	

	@Test(description ="Проверяет скачку треков ")
	public void download () throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 180);
		driver.get(musicUrl);
		//click to download btn
		driver.findElement(By.xpath("//*[@class='addthis control download download-track-counter']")).click(); //click to download btn
		
		//Check PC
		double width =  Toolkit.getDefaultToolkit().getScreenSize().getWidth(); 
			if (width == 1366.0) {
			  filePath = voicePC;
			} else filePath = statsPC;
			
		//Switch to new window opened
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		// click on download link
	    try {  
	    	driver.findElement(By.xpath("//*[@class='one-track-block']/a[1]")).click(); 
	      	}
	    	catch (NoSuchElementException e) {
	    	  Reporter.log("На странице "+driver.getCurrentUrl()+ " неотображается ссылка <<Скачать песню>>",true);
	      	}
	       
	    	Thread.sleep(2000);
	    	driver.get("chrome://downloads/");
	    	
	    	while(!driver.findElement(By.xpath("//*[@class='status']")).getText().equals("")) {
	    		int i =+1;
	    		String status = driver.findElement(By.xpath("//*[@class='status']")).getText();
	    			if (!driver.findElement(By.xpath("//*[@class='status']")).getText().equals(status)){
	    				Reporter.log(status,true);
	    			}
	    			if (i>=180) {
	    				break;
	    			}
	    	}
	      try{
	        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='controls']/a[1]"))); 
	      }
	      catch (TimeoutException e) {
	    	  Reporter.log("Трек не скачался",true);
	    	  throw new NullPointerException ();
	      }

	      // getting name of downloaded track
	      String fileName = driver.findElement(By.xpath("//*[@class='title-area']/a")).getText();
	      // file path
	      File file = new File(filePath+fileName); 
	      
	      //check if file not existing print error
	      if  (!file.exists()) {
		    	Reporter.log("Файл не существует",true);
		    	throw new NullPointerException(); 
		    }    // if exist delete file   
		    	else file.delete();
	      		System.out.println("Трек успешно скачан, и был удален");
		}
	
}
