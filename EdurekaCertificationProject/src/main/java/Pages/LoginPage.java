package Pages;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(RemoteWebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	

	@FindBy(id = "ap_email")
	WebElement email;

	@FindBy(xpath = "(//*[@id=\"continue\"])[1]")
	WebElement continueBtn;

	@FindBy(id = "ap_password")
	WebElement password;
	@FindBy(id = "signInSubmit")
	WebElement submit;

	@FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	WebElement signBtn;
public void signIN() throws AWTException
{

	signBtn.click();
}
	public void enterUserName(String usename) {
		email.sendKeys(usename);
	}

	public void emailContinue() {
		continueBtn.click();
	}

	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void submitSignIN() {
		submit.click();
	}
}
