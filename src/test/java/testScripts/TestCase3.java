package testScripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class TestCase3 extends BaseClass {
	@Test
	public void thirdTest() throws InterruptedException {
		home.passDataToSearchTextField("core java for selenium");
		home.clickSeacrhButton();
		coreJava.clickCoreJavaImage();
		video.clickCloseCookies();
		webdriver.switchToFrame();
		video.playButton();
		Thread.sleep(10000);
		video.pauseButton();
		webdriver.switchBackfromFrame();
		video.clickAddtoWhishListLink();
		
	}

}
