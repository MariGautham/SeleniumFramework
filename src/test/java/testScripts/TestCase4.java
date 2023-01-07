package testScripts;

import java.util.Map;

import org.testng.annotations.Test;

import genericLibraries.BaseClass;

public class TestCase4 extends BaseClass{
	@Test
	public void fourthTest() {
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		webdriver.switchToWindow();
		webdriver.scrollPage(demoApp.getContactUsLink());
		demoApp.clickContactUs();
		Map<String, String> map=excel.fetchDataFromExcel("Sheet1");
		contact.setFullname(map.get("Fullname"));
		contact.setEmail(map.get("Email"));
		contact.setSubject(map.get("Subject"));
		contact.setMessage(map.get("Message"));
		contact.clickSendUsMail();
	

}
}
