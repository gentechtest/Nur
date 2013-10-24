package content;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageFactory.ContentPage;
import basic.BasicTestCase;

public class Headers extends BasicTestCase{
	private ContentPage obj = PageFactory.initElements(getWebDriver(), ContentPage.class);
	@Test(priority = 1, groups={"Header"}, description="Проверяем ссылки на шапке <<Музыка>>")
	public void MusicHeader () throws Exception {
		driver.get(musicUrl);
		assertPage(musicUrl);
		//music
		try{
		obj.Music.click();
		assertPage(musicUrl);
		if (!obj.Music.getText().equals("МУЗЫКА")) {
			System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
	    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		}
	    //new music
	    obj.NewMusic.isDisplayed();
	    if(!obj.NewMusic.getText().equals("Новинки")){
	       System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
		   Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
		}
	    //kazahskaya music
	    obj.Kazahskaya.isDisplayed();
	    if(!obj.Kazahskaya.getText().equals("Казахская")){
	    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
	    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
		}
	    //my play list
	    obj.PlayList.isDisplayed();
	    if (!obj.PlayList.getText().equals("Мой плейлист")){
	    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
	    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
	    }
	    //upload
	    obj.Upload.isDisplayed();
	    if (!obj.Upload.getText().equals("Загрузить")){
	    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
	    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
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
		        System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
		    }
			//music
			obj.Music.isDisplayed();
		    if(!obj.Music.getText().equals("МУЗЫКА")){
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    }
		    
		    //kazahs music
			try {
		    obj.Kazahskaya.isDisplayed();
		    if (!obj.Kazahskaya.getText().equals("Казахская")){
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    }
		    //my play list
		    obj.PlayList.isDisplayed();
		    if (!obj.PlayList.getText().equals("Мой плейлист")){
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    }
			//upload
		    obj.Upload.isDisplayed();
		    if (!obj.Upload.getText().equals("Загрузить")) { 
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    }
			} catch (AssertionError e) {
				throw new AssertionError ();
			}
	}
		/*-------------------------------------------------------------------------------------------------------------------*/

		@Test(priority = 3, groups={"Header"}, description="Проверяем ссылки на шапке <<Казахская>>")
		public void KazahHeader () throws Exception {
			driver.get(kazahUrl);
			 assertPage(kazahUrl);
		    //kazahs music
			try {
		    obj.Kazahskaya.click();
		    assertPage(kazahUrl);
		    if (!obj.Kazahskaya.getText().equals("Казахская")){
			    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    }
			//new music
		    obj.NewMusic.isDisplayed();
		    if (!obj.NewMusic.getText().equals("Новинки")){
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			}
			//music
			obj.Music.isDisplayed();
		    if (!obj.Music.getText().equals("МУЗЫКА")){
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    }
		    //my play list
		    obj.PlayList.isDisplayed();
		    if (!obj.PlayList.getText().equals("Мой плейлист")){
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    }
			//upload
		    obj.Upload.isDisplayed();
		    if (!obj.Upload.getText().equals("Загрузить")){ 
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    }
		   }catch (AssertionError e){
			throw new AssertionError ();
		}
	}
/*--------------------------------------------------------------------------------------------------------------------------------*/
		
		@Test(priority = 4, groups={"Header"}, description="Проверяем ссылки на шапке <<Мой плейлист>>")
		public void PlaylistHeader () throws Exception {
			driver.get(playlistUrl);
			assertPage(playlistUrl);
			//my play list
			try {
		    obj.PlayList.click();
		    assertPage(playlistUrl);
		    if (!obj.PlayList.getText().equals("Мой плейлист")){ 
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    }
		    //kazahs music
		    obj.Kazahskaya.isDisplayed();
		    if (!obj.Kazahskaya.getText().equals("Казахская")){
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    }
			//new music
		    obj.NewMusic.isDisplayed();
		    if (!obj.NewMusic.getText().equals("Новинки")){
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			}
			//music
			obj.Music.isDisplayed();
		    if (!obj.Music.getText().equals("МУЗЫКА")){
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    }
			//upload
		    obj.Upload.isDisplayed();
		    if (!obj.Upload.getText().equals("Загрузить")){
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
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
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Загрузить>>");
			    }
			//my play list
		    obj.PlayList.isDisplayed();
		    if (!obj.PlayList.getText().equals("Мой плейлист")){
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Мой плейлист>>");
			    }
		    //kazahs music
		    obj.Kazahskaya.isDisplayed();
		    if (!obj.Kazahskaya.getText().equals("Казахская")){
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Казахская>>");
			    }
			//new music
		    obj.NewMusic.isDisplayed();
		    if (!obj.NewMusic.getText().equals("Новинки")){ 
			    System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			    Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Новинки>>");
			}
			//music
			obj.Music.isDisplayed();
		    if (!obj.Music.getText().equals("МУЗЫКА")){
		    	System.out.println("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    	Reporter.log("На странице "+driver.getCurrentUrl()+" неотображается линк <<Музыка>>");
		    }
		    }catch (AssertionError e){
		    throw new AssertionError ();
		    }
		}
}
		
		