package content;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageFactory.ContentPage;
import basic.BasicTestCase;

public class Headers extends BasicTestCase{
	private ContentPage obj = PageFactory.initElements(getWebDriver(), ContentPage.class);
	@Test(priority = 1, description="Проверяем ссылки на шапке <<Музыка>>")
	public void MusicHeader () throws Exception {
		driver.get(musicUrl);
		//music
		try {
		obj.Music.click();
	    assertEquals("МУЗЫКА",obj.Music.getText());
		}
	    catch (AssertionError e) { 
	    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
	    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
	    	throw new AssertionError ();
	    }
	    //new music
		try {
	    obj.NewMusic.isDisplayed();
	    assertEquals("Новинки",obj.NewMusic.getText());
		}
		catch (AssertionError e) { 
		    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
		    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
		    throw new AssertionError ();
		}
	    //kazahs music
		try {
	    obj.Kazahskaya.isDisplayed();
	    assertEquals("Казахская",obj.Kazahskaya.getText());
		}
		 catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
		    	throw new AssertionError ();
		    }
	    //my play list
		try {
	    obj.PlayList.isDisplayed();
	    assertEquals("Мой плейлист",obj.PlayList.getText());
		}
		 catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
		    	throw new AssertionError ();
		    }
		//upload
		try {
	    obj.Upload.isDisplayed();
	    assertEquals("Загрузить",obj.Upload.getText());
		}
		 catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
		    	throw new AssertionError ();
		    }
	}
	/*------------------------------------------------------------------------------------------------------------------------*/
		
		@Test(priority = 2, groups={"Header"}, description="Проверяем ссылки на шапке <<Новинки>>")
		public void NovinkiHeader () throws Exception {
			driver.get(novinkiUrl);
			//new music
			try {
		    obj.NewMusic.click();
		    assertEquals("Новинки",obj.NewMusic.getText());
			}
			catch (AssertionError e) { 
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			    throw new AssertionError ();
			}
			//music
			try {
			obj.Music.isDisplayed();
		    assertEquals("МУЗЫКА",obj.Music.getText());
			}
		    catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    	throw new AssertionError ();
		    }
		    
		    //kazahs music
			try {
		    obj.Kazahskaya.isDisplayed();
		    assertEquals("Казахская",obj.Kazahskaya.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    	throw new AssertionError ();
			    }
		    //my play list
			try {
		    obj.PlayList.isDisplayed();
		    assertEquals("Мой плейлист",obj.PlayList.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    	throw new AssertionError ();
			    }
			//upload
			try {
		    obj.Upload.isDisplayed();
		    assertEquals("Загрузить",obj.Upload.getText()); 
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    	throw new AssertionError ();
			    }
	}
		/*-------------------------------------------------------------------------------------------------------------------*/

		@Test(priority = 3, groups={"Header"}, description="Проверяем ссылки на шапке <<Казахская>>")
		public void KazahHeader () throws Exception {
			driver.get(kazahUrl);
		    //kazahs music
			try {
		    obj.Kazahskaya.click();
		    assertEquals("Казахская",obj.Kazahskaya.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    	throw new AssertionError ();
			    }
			//new music
			try {
		    obj.NewMusic.isDisplayed();
		    assertEquals("Новинки",obj.NewMusic.getText());
			}
			catch (AssertionError e) { 
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			    throw new AssertionError ();
			}
			//music
			try {
			obj.Music.isDisplayed();
		    assertEquals("МУЗЫКА",obj.Music.getText());
			}
		    catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    	throw new AssertionError ();
		    }
		    //my play list
			try {
		    obj.PlayList.isDisplayed();
		    assertEquals("Мой плейлист",obj.PlayList.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    	throw new AssertionError ();
			    }
			//upload
			try {
		    obj.Upload.isDisplayed();
		    assertEquals("Загрузить",obj.Upload.getText()); 
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    	throw new AssertionError ();
			    }
	}
/*--------------------------------------------------------------------------------------------------------------------------------*/
		
		@Test(priority = 4, groups={"Header"}, description="Проверяем ссылки на шапке <<Мой плейлист>>")
		public void PlaylistHeader () throws Exception {
			driver.get(playlistUrl);
			//my play list
			try {
		    obj.PlayList.click();
		    assertEquals("Мой плейлист",obj.PlayList.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    	throw new AssertionError ();
			    }
		    //kazahs music
			try {
		    obj.Kazahskaya.isDisplayed();
		    assertEquals("Казахская",obj.Kazahskaya.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    	throw new AssertionError ();
			    }
			//new music
			try {
		    obj.NewMusic.isDisplayed();
		    assertEquals("Новинки",obj.NewMusic.getText());
			}
			catch (AssertionError e) { 
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			    throw new AssertionError ();
			}
			//music
			try {
			obj.Music.isDisplayed();
		    assertEquals("МУЗЫКА",obj.Music.getText());
			}
		    catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    	throw new AssertionError ();
		    }
			//upload
			try {
		    obj.Upload.isDisplayed();
		    assertEquals("Загрузить",obj.Upload.getText()); 
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    	throw new AssertionError ();
			    }
	}
/*-----------------------------------------------------------------------------------------------------------------------*/

		@Test(priority = 4, groups={"Header"}, description="Проверяем ссылки на шапке <<Загрузить>>")
		public void UploadHeader () throws Exception {
			driver.get(playlistUrl);
			//upload
			try {
		    obj.Upload.click();
		    assertEquals("Загрузить",obj.Upload.getText()); 
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    	throw new AssertionError ();
			    }
			//my play list
			try {
		    obj.PlayList.isDisplayed();
		    assertEquals("Мой плейлист",obj.PlayList.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    	throw new AssertionError ();
			    }
		    //kazahs music
			try {
		    obj.Kazahskaya.isDisplayed();
		    assertEquals("Казахская",obj.Kazahskaya.getText());
			}
			 catch (AssertionError e) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    	throw new AssertionError ();
			    }
			//new music
			try {
		    obj.NewMusic.isDisplayed();
		    assertEquals("Новинки",obj.NewMusic.getText());
			}
			catch (AssertionError e) { 
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			    throw new AssertionError ();
			}
			//music
			try {
			obj.Music.isDisplayed();
		    assertEquals("МУЗЫКА",obj.Music.getText());
			}
		    catch (AssertionError e) { 
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    	throw new AssertionError ();
		    }
	}
}
		
		