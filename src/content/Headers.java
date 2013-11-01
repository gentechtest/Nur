package content;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageFactory.ContentPage;
import basic.BasicTestCase;

public class Headers extends BasicTestCase{
	private ContentPage obj = PageFactory.initElements(getWebDriver(), ContentPage.class);
	@Test(priority = 3, groups={"Header"}, description="Проверяем ссылки на шапке <<Казахская>>")
	public void KazahHeader () throws Exception {
		driver.get(kazahUrl);
		assertPage(kazahUrl);
	    //kazahs music
		try {
	    obj.Kazahskaya.click();
	    assertPage(kazahUrl);
	    if (!obj.Kazahskaya.getText().equals("Казахска")){
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>",true);
		    }
		//new music
	    obj.NewMusic.isDisplayed();
	    if (!obj.NewMusic.getText().equals("Новинки")){
		    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>",true);
		}
		//music
		obj.Music.isDisplayed();
	    if (!obj.Music.getText().equals("МУЗЫКА")){
	    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>",true);
	    }
	    //my play list
	    obj.PlayList.isDisplayed();
	    if (!obj.PlayList.getText().equals("Мой плейлист")){
		    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>",true);
		    }
		//upload
	    obj.Upload.isDisplayed();
	    if (!obj.Upload.getText().equals("Загрузить")){ 
		    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>",true);
		    }
	   }catch (AssertionError e){
		throw new AssertionError ();
	}
}
/*--------------------------------------------------------------------------------------------------------------------------------*/
		
		@Test(priority = 1, groups={"Header"}, description="Проверяем ссылки на шапке <<Музыка>>")
		public void MusicHeader () throws Exception {
			driver.get(musicUrl);
			assertPage(musicUrl);
			//music
			try{
			obj.Music.click();
			assertPage(musicUrl);
			if (!obj.Music.getText().equals("МУЗЫКА")) {
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>",true);
			}
		    //new music
		    obj.NewMusic.isDisplayed();
		    if(!obj.NewMusic.getText().equals("Новинки")){
			   Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>",true);
			}
		    //kazahskaya music
		    obj.Kazahskaya.isDisplayed();
		    if(!obj.Kazahskaya.getText().equals("Казахская")){
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>",true);
			}
		    //my play list
		    obj.PlayList.isDisplayed();
		    if (!obj.PlayList.getText().equals("Мой плейлист")){
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>",true);
		    }
		    //upload
		    obj.Upload.isDisplayed();
		    if (!obj.Upload.getText().equals("Загрузить")){
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>",true);
		    }
			} catch (AssertionError e) {
			  throw new AssertionError ();
			}    
}
		/*------------------------------------------------------------------------------------------------------------------------*/

		@Test(priority = 2, groups={"Header"}, description="Проверяем ссылки на шапке <<Новинки>>")
		public void NovinkiHeader () throws Exception {
			driver.get(novinkiUrl);
			 assertPage(novinkiUrl);
			//new music
			//try {
		    obj.NewMusic.click();
		    assertPage(novinkiUrl);
		    if(!obj.NewMusic.getText().equals("Новинки")){
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>",true);
		    }
			//music
			obj.Music.isDisplayed();
		    if(!obj.Music.getText().equals("МУЗЫКА")){
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>",true);
		    }
		    
		    //kazahs music
			try {
		    obj.Kazahskaya.isDisplayed();
		    if (!obj.Kazahskaya.getText().equals("Казахская")){
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>",true);
			    }
		    //my play list
		    obj.PlayList.isDisplayed();
		    if (!obj.PlayList.getText().equals("Мой плейлист")){
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>",true);
			    }
			//upload
		    obj.Upload.isDisplayed();
		    if (!obj.Upload.getText().equals("Загрузить")) { 
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>",true);
			    }
			} catch (AssertionError e) {
				throw new AssertionError ();
			}
	}
		/*-------------------------------------------------------------------------------------------------------------------*/
		
		@Test(priority = 4, groups={"Header"}, description="Проверяем ссылки на шапке <<Мой плейлист>>")
		public void PlaylistHeader () throws Exception {
			driver.get(playlistUrl);
			assertPage(playlistUrl);
			//my play list
			try {
		    obj.PlayList.click();
		    assertPage(playlistUrl);
		    if (!obj.PlayList.getText().equals("Мой плейлист")){ 
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>",true);
			    }
		    //kazahs music
		    obj.Kazahskaya.isDisplayed();
		    if (!obj.Kazahskaya.getText().equals("Казахская")){
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>",true);
			    }
			//new music
		    obj.NewMusic.isDisplayed();
		    if (!obj.NewMusic.getText().equals("Новинки")){
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>",true);
			}
			//music
			obj.Music.isDisplayed();
		    if (!obj.Music.getText().equals("МУЗЫКА")){
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>",true);
		    }
			//upload
		    obj.Upload.isDisplayed();
		    if (!obj.Upload.getText().equals("Загрузить")){
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>",true);
			    }
			}catch (AssertionError e){
				throw new AssertionError ();

			}
	}
/*-----------------------------------------------------------------------------------------------------------------------*/

		@Test(priority = 4, groups={"Header"}, description="Проверяем ссылки на шапке <<Загрузить>>")
		public void UploadHeader () throws Exception {
			driver.get(uploadUrl);
			assertPage(uploadUrl);
			//upload
		try{
		    obj.Upload.click();
		    assertPage(uploadUrl);
		    if (!obj.Upload.getText().equals("Загрузить")){ 
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>",true);
			    }
			//my play list
		    obj.PlayList.isDisplayed();
		    if (!obj.PlayList.getText().equals("Мой плейлист")){
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>",true);
			    }
		    //kazahs music
		    obj.Kazahskaya.isDisplayed();
		    if (!obj.Kazahskaya.getText().equals("Казахская")){
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>",true);
			    }
			//new music
		    obj.NewMusic.isDisplayed();
		    if (!obj.NewMusic.getText().equals("Новинки")){ 
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>",true);
			}
			//music
			obj.Music.isDisplayed();
		    if (!obj.Music.getText().equals("МУЗЫКА")){
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>",true);
		    }
		    }catch (AssertionError e){
		    throw new AssertionError ();
		    }
		}
}
		
		