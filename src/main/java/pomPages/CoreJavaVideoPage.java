package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaVideoPage {
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement closeCookiesIcon;
	
	@FindBy(xpath=" //button[.='Play']")
	private WebElement playButton;
	@FindBy(xpath=" //button[.='Pause']")
	private WebElement pauseButton;
	@FindBy(xpath="//span[.='Add To Wishlist']")
	private WebElement addToWhishlistLink;
	
	public CoreJavaVideoPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickCloseCookies() {
		closeCookiesIcon.click();
	}
	public void playButton() {
		playButton.click();
	}
	public void pauseButton() {
		pauseButton.click();
	}
	public void clickAddtoWhishListLink() {
		addToWhishlistLink.click();
	}

}
