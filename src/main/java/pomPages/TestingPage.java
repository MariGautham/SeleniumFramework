package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class TestingPage {
	@FindBy(id="munit testing ")
	private WebElement junitImage;
	@FindBy(id="cartArea")
	private WebElement myCartArea;
	@FindBy(xpath="//ul[@class='list-socialicons']/li[2]")
	private WebElement facebookIcon;
	
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void DragJunitToMyCart(WebDriverUtility webdriver) {
		webdriver.dragandDropElement(junitImage, myCartArea);
	}
	public void facebookIcon() {
		facebookIcon.click();
	}
	public WebElement getFacebookIcon() {
		return facebookIcon;
	}


}
