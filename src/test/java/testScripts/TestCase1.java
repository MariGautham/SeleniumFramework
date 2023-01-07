package testScripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class TestCase1 extends BaseClass {
	@Test
	public void firstTest() {
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		demoApp.mouseHoverOnCourseTab(webdriver);
		webdriver.switchToWindow();
		demoApp.clickSeleniumTesting();
		addToCart.doubleClickPlusButton(webdriver);
		addToCart.clickAddToCart();
		webdriver.alertPopup();
	}

}
