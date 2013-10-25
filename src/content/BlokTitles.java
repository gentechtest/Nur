package content;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basic.BasicTestCase;

public class BlokTitles extends BasicTestCase {
	 //Check title on a block
		@Test(priority=1, description="Проверяет отображение имени блока на <<Музыка>>")
		public void MusicTitles () throws Exception {
			  driver.get(musicUrl);
			  	try{
			  		driver.findElement(By.xpath("//h3[contains(text(),'Топ-исполнители')]")).isDisplayed();
		  		}
				  catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается имя блока  <<Топ-исполнители>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается имя блока  <<Топ-исполнители>>");
				  		throw new NoSuchElementException ("");
				   		}
			  	try{
			  		driver.findElement(By.xpath("//h3[contains(text(),'Топ-10 треков за неделю')]")).isDisplayed();
				}
				  catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+"неотображается имя блока <<Топ-10 треков за неделю>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+"неотображается имя блока <<Топ-10 треков за неделю>>");
				  		throw new NoSuchElementException ("");
				   		}
			  	try{
			  		driver.findElement(By.xpath("//h3[contains(text(),'Популярные жанры')]")).isDisplayed();
			  	}
			  		 catch (NoSuchElementException e) {
						    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Популярные жанры>>");
					    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Популярные жанры>>");
					  		throw new NoSuchElementException ("");
					   		}
	}
/*--------------------------------------------------------------------------------------------------------------------------------------------*/
		
		 @Test(priority=2, description="Проверяет отображение имен блоков на  <<Новинки>>")
		 public void NovinkiTitles () throws Exception {
			 driver.get(novinkiUrl);
			 try {
			 driver.findElement(By.xpath("//h3[contains(text(),'Новые популярные исполнители')]")).isDisplayed();
			 } catch (NoSuchElementException e) {
				    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Новые популярные исполнители>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Новые популярные исполнители>>");
			  		throw new NoSuchElementException (""); 
			 }
		 }
/*----------------------------------------------------------------------------------------------------------------------------------------------*/
		 @Test(priority=3, description="Проверяет отображение имен блоков на  <<Казахстанская>>")
		 public void KazahTitles () throws Exception {
			 driver.get(kazahUrl);
			 try{
				 driver.findElement(By.xpath("//h3[contains(text(),'Топ-Исполнители Казахстана')]")).isDisplayed();
			 }
				 catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Топ-Исполнители Казахстана>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Топ-Исполнители Казахстана>>");
				  		throw new NoSuchElementException (""); 
				 }
			 try{
				 driver.findElement(By.xpath("//h3[contains(text(),'Популярные жанры')]")).isDisplayed();
		 			}
				 catch (NoSuchElementException e) {
					    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Популярные жанры>>");
				    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается имя блока <<Популярные жанры>>");
				  		throw new NoSuchElementException (""); 
				 }
			 try{
				 driver.findElement(By.xpath("//h3[contains(text(),'Топ-10 казахских песен за неделю')]")).isDisplayed();
			   	}
			 catch (NoSuchElementException e) {
				    System.out.println("На странице "+driver.getCurrentUrl()+" неторображается имя блока <<Топ-10 казахских песен за неделю>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неторображается имя блока <<Топ-10 казахских песен за неделю>>");
			  		throw new NoSuchElementException (""); 
			 }
		   
		
	}
}
