package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
	@FindBy(name="name")
	private WebElement nameTextField;
	@FindBy(name="sender")
	private WebElement emailTextField;
	@FindBy(name="subject")
	private WebElement subjectTextField;
	@FindBy(name="message")
	private WebElement messageTextField;
	@FindBy(xpath="//button[.='Send us mail']")
	private WebElement sendUsMailButton;
	
	public ContactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setFullname(String name) {
		nameTextField.sendKeys(name);
	}
    public void setEmail(String email) {
    	emailTextField.sendKeys(email);
    }
    public void setSubject(String subject) {
    	subjectTextField.sendKeys(subject);
    }
    public void setMessage(String message) {
    	messageTextField.sendKeys(message);
    }
    public void clickSendUsMail() {
    	sendUsMailButton.click();
    }
}
