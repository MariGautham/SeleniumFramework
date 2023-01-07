package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryHomePage {
	@FindBy(xpath=" //div[@class='menu-right']/descendant::a[contains(.,'GEARS')]")
	private WebElement gearsTab;
	@FindBy(xpath=" //ul[@class='dropdown-menu gear_menu']/descendant::a[.=' SkillRary Demo APP']")
	private WebElement skillraryDemoApplink;
	@FindBy(name="q")
	private WebElement searchTextField;
	@FindBy(xpath=" //input[@value='go']")
	private WebElement searchButton;
	
	public SkillraryHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickGearsTab() {
		gearsTab.click();
	}
	public void clickSkillraryDemoApp() {
		skillraryDemoApplink.click();
	}
	public void passDataToSearchTextField(String data) {
		searchTextField.sendKeys(data);
	}
	public void clickSeacrhButton() {
		searchButton.click();
	}
	
}
