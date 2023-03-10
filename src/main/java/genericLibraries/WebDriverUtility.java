package genericLibraries;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {
	WebDriver driver;
	public WebDriver OpenBrowserandNavigateApp(String url, long time) {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time))	;
		return driver;
			
	}
	public void mouseHoverToElement(WebElement element) {
		Actions a =new Actions(driver);
		a.moveToElement(element).perform();	
	}
	public void doubleClickonElement(WebElement element) {
		Actions a =new Actions(driver);
		a.doubleClick(element).perform();
	}
	public void dragandDropElement(WebElement source, WebElement target) {
		Actions a =new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}
	public void dropdown(WebElement element, int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public void switchToFrame() {
		driver.switchTo().frame(0);
	}
	public void switchBackfromFrame() {
		driver.switchTo().defaultContent();
	}
	public void alertPopup() {
		driver.switchTo().alert().accept();
	}
	public void scrollPage(WebElement element) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	    jse.executeScript("arguments[0].scrollIntoView(true)",element);
	}
	public void switchToWindow() {
		Set<String> windows= driver.getWindowHandles();
		for(String windowID:windows) {
			driver.switchTo().window(windowID);
		}
	}
	public void closeBrowser() {
		driver.quit();
		
	}

}
