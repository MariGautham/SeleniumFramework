package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class SkillraryDemoApp {
	@FindBy(id="course")
	private WebElement courseTab;
	@FindBy(xpath="//div[@class='dropdown-content']/descendant::a[.='Selenium Training']")
	private WebElement seleniumTrainingTab;
	@FindBy(name="addresstype")
	private WebElement categoryDropdown;
	@FindBy(xpath="//a[.='Contact Us']")
	private WebElement contactUsLink;
	
	
	public SkillraryDemoApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void mouseHoverOnCourseTab(WebDriverUtility webdriver) {
		webdriver.mouseHoverToElement(courseTab);
	}
	public void clickSeleniumTesting() {
		seleniumTrainingTab.click();
	}
	public void selectCategoryDropDown(WebDriverUtility webdriver, int index){
		webdriver.dropdown(categoryDropdown, index);
	}
	public void clickContactUs() {
		contactUsLink.click();
	}
	public WebElement getContactUsLink() {
		return contactUsLink;
	}
	
}
