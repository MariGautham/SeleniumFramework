package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaForSeleniumPage {
	@FindBy(xpath="//a[.=' Core Java For Selenium Trainin']")
	private WebElement coreJavaImage;
	public  CoreJavaForSeleniumPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public void clickCoreJavaImage() {
		coreJavaImage.click();
	}

}
