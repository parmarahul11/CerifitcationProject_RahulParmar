package EdurekaProject.EdurekaCertificationProject;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.xml.internal.TestNamesMatcher;

import Pages.HomePage;
import Pages.LoginPage;
import utility.BaseURL;
import utility.ExcelPath;
import utility.ExcelUtility;
import utility.TestNGFrameworkLogger;
import utility.WebdriverLaunch;

public class Login_Tests {
	RemoteWebDriver driver;
	@Test
	public void signIn() throws AWTException, IOException, InterruptedException
	{		TestNGFrameworkLogger.initLogger();
		 driver = WebdriverLaunch.getDriver("chrome");
			TestNGFrameworkLogger.startTestCase("Login_Test");
		driver.get(BaseURL.baseURL);
		TestNGFrameworkLogger.info("Website URL : " + BaseURL.baseURL);
		HomePage homepage = new HomePage(driver);
		
		homepage.hompageSignin();
		
		  Object[][] testData = ExcelUtility.excelReader(ExcelPath.excelPathLogin,ExcelPath.loginSheet);
		  LoginPage loginpage = new LoginPage(driver);
		  loginpage.signIN();
		  TestNGFrameworkLogger.info("User on Sign In Page");
		  Thread.sleep(10000);
		  TestNGFrameworkLogger.info("Entering Username : "+ testData[0][0].toString().trim());
		// loginpage.enterUserName(testData[0][0].toString().trim());
		  Thread.sleep(3000);
		  TestNGFrameworkLogger.info("Clicking on Continue Button");
		  loginpage.emailContinue();
		  TestNGFrameworkLogger.info("Entering Password : "+ testData[0][1].toString().trim());
		 // loginpage.enterPassword(testData[0][1].toString()); 
		  Thread.sleep(13000);
		  loginpage.submitSignIN();
		  TestNGFrameworkLogger.info("Clicking on Submit button");
		
		driver.quit();
		TestNGFrameworkLogger.endestCase("Login_Test");
		
	}

}
