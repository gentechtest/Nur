package content;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.SocialLinkPage;
import basic.BasicTestCase;

public class SocialLinks extends BasicTestCase {
	private SocialLinkPage function = PageFactory.initElements(getWebDriver(), SocialLinkPage.class);

	 /*-----------------------------------------------------------------------------------------------------*/
	 @Test(priority=3,groups={"Soclinks"}, description="Проверяет отображение блока соц сетей на  <<Казахстанская>>")
	 public void socialOnKazah () throws Exception {
		 driver.get(kazahUrl);
		 assertPage(kazahUrl);
		 function.checkSocialLinks();
}
@Test(priority=1,groups={"Soclinks"}, description="Проверяет отображение блока соц сетей на  <<Музыка>>")
	 public void socialOnMusic () throws Exception {
		 driver.get(musicUrl);
		 assertPage(musicUrl);
		 function.checkSocialLinks();
	 	}
/*----------------------------------------------------------------------------------------------------*/
	 @Test(priority=2,groups={"Soclinks"}, description="Проверяет отображение блока соц сетей на  <<Новинки>>")
	 public void socialOnNovinki () throws Exception {
		 driver.get(novinkiUrl);
		 assertPage(novinkiUrl);
		 function.checkSocialLinks();
		 }
/*------------------------------------------------------------------------------------------------------*/
	 @Test(priority=4,groups={"Soclinks"}, description="Проверяет отображение блока соц сетей на  <<Мой плейлист>>")
	 public void socialOnPlaylist () throws Exception {
		 driver.get(playlistUrl);
		 assertPage(playlistUrl);
		 function.checkSocialLinks();
}
/*------------------------------------------------------------------------------------------------------*/
}