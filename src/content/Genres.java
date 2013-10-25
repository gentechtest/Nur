package content;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import basic.BasicTestCase;

public class Genres extends BasicTestCase {
	@Test(priority=1, description="Проверяет отображение жанров на  <<Музыка>>")
	public void MusicGenres () throws Exception {
	driver.get(musicUrl);
	assertPage(musicUrl);
	checkGenres(24);
	}
	@Test(priority=2, description="Проверяет отображение жанров на <<Казахстанская>>")
	public void KazahGenres () throws Exception {
	driver.get(kazahUrl);
	assertPage(kazahUrl);
	checkGenres(24);
	}


//check genre tags is present
public void checkGenres (int expected_numb_genres) throws Exception {
 int real_numb_genres = driver.findElements(By.xpath (".//*[@class='popular-genres']/li")).size();
 for (int i=1; i<=real_numb_genres; i++) {
  driver.findElement(By.xpath (".//*[@class='popular-genres']/li["+i+"]")).isDisplayed();
 }
 if (expected_numb_genres !=real_numb_genres) {
  System.out.println("На странице "+driver.getCurrentUrl()+" неотображаются жанры");
  Reporter.log("На странице "+driver.getCurrentUrl()+" неотображаются жанры");
  throw new NullPointerException();
 }
}
}
