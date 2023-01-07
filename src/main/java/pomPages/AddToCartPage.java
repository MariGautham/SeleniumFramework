package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class AddToCartPage {
	@FindBy(id="add")
	private WebElement plusButton;
	@FindBy(xpath="//button[contains(.,'Add to Cart')]")
	private WebElement addToCartButton;
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void doubleClickPlusButton(WebDriverUtility webdriver) {
		webdriver.doubleClickonElement(plusButton);
	}
	public void clickAddToCart() {
		addToCartButton.click();
	}

}
