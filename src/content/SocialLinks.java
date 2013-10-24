package content;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageFactory.SocialLinkPage;
import basic.BasicTestCase;

public class SocialLinks extends BasicTestCase {
	private SocialLinkPage function = PageFactory.initElements(getWebDriver(), SocialLinkPage.class);

	 @Test(priority=1,groups={"Soclinks"}, description="Проверяет отображение блока соц сетей на  <<Музыка>>")
	 public void socialOnMusic () throws Exception {
		 driver.get(musicUrl);
		 function.checkSocialLinks();
	 	}
/*----------------------------------------------------------------------------------------------------*/
	 @Test(priority=2,groups={"Soclinks"}, description="Проверяет отображение блока соц сетей на  <<Новинки>>")
	 public void socialOnNovinki () throws Exception {
		 driver.get(novinkiUrl);
		 function.checkSocialLinks();
		 }
/*-----------------------------------------------------------------------------------------------------*/
	 @Test(priority=3,groups={"Soclinks"}, description="Проверяет отображение блока соц сетей на  <<Азербайджанская>>")
	 public void socialOnAzer () throws Exception {
		 driver.get(kazahUrl);
		 function.checkSocialLinks();
}
/*------------------------------------------------------------------------------------------------------*/
	 @Test(priority=4,groups={"Soclinks"}, description="Проверяет отображение блока соц сетей на  <<Мой плейлист>>")
	 public void socialOnPlaylist () throws Exception {
		 driver.get(playlistUrl);
		 function.checkSocialLinks();
}
/*------------------------------------------------------------------------------------------------------*/
}