package testScripts;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class TestCase2 extends BaseClass {
	@Test
	public void secondTest() {
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		webdriver.switchToWindow();
		demoApp.selectCategoryDropDown(webdriver, 1);
		testing.DragJunitToMyCart(webdriver);
		webdriver.scrollPage(testing.getFacebookIcon());
		testing.facebookIcon();
	}

}
