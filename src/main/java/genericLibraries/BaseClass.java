package genericLibraries;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pomPages.AddToCartPage;
import pomPages.ContactPage;
import pomPages.CoreJavaForSeleniumPage;
import pomPages.CoreJavaVideoPage;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryHomePage;
import pomPages.TestingPage;

public class BaseClass {
	public ExcelUtility excel;
	public PropertyFileUtility property;
	public WebDriverUtility webdriver;
	public WebDriver driver;
	public SkillraryHomePage home;
	public SkillraryDemoApp demoApp;
	public AddToCartPage addToCart;
	public ContactPage contact;
	public CoreJavaForSeleniumPage coreJava;
	public CoreJavaVideoPage video;
	public TestingPage testing;
	
	//@BeforeSuite
	@BeforeTest
	public void testSetup() {
		excel=new ExcelUtility();
		property=new PropertyFileUtility();
		webdriver=new WebDriverUtility();
		
	}
	@BeforeClass
	public void classSetup() throws EncryptedDocumentException, IOException {
		excel.excelInitialization();
		property.propertyFileInitialization();
	}
	
	@BeforeMethod
	public void methodSetup() throws IOException  {
		String url=property.fetchDataFromPropetyFile("url");
		String time=property.fetchDataFromPropetyFile("timeouts");
			long timeout= Long.parseLong(time);
			
			driver=webdriver.OpenBrowserandNavigateApp(url, timeout);
			home=new SkillraryHomePage(driver);
			demoApp=new SkillraryDemoApp(driver);
			addToCart= new AddToCartPage(driver);
			contact=new ContactPage(driver);
			coreJava=new CoreJavaForSeleniumPage(driver);
			video=new CoreJavaVideoPage(driver);
			testing=new TestingPage(driver);
					
	}
	
	@AfterMethod
	public void methodTeardown() {
		webdriver.closeBrowser();
	}
	@AfterClass
	public void classTeardown() throws IOException {
		excel.closeExcel();
	}
	//@AfterTest
	//@AfterSuite

}
