package Pages;

import java.awt.AWTException;
import org.openqa.selenium.Point;
import java.awt.Robot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	Robot robot;
	Point pointer;

	public HomePage(RemoteWebDriver driver) throws AWTException {
		PageFactory.initElements(driver, this);
		robot = new Robot();
	}

	// Locators of Login Page
	@FindBy(id = "nav-link-accountList")
	WebElement accountList;
	@FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	WebElement signBtn;
	// Functionality of page

	public void hompageSignin() {
		pointer = accountList.getLocation();
		robot.mouseMove(pointer.x + 10, pointer.y + 130);
		// accountList.click();
	

	}

}
