package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase {

	// Web Elemnets
	@FindBy(name ="username")
	private WebElement username_txt;

	@FindBy(name = "password")
	private WebElement password_txt;

	@FindBy(xpath = "")
	private WebElement forgotPassword_lnk;

	@FindBy(xpath = "")
	private WebElement createanAccount_lnk;

	@FindBy(name = "submit")
	private WebElement login_btn;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	// page actions
	public void enterUserName(String userName) {
		username_txt.sendKeys(userName);
	}

	public void enterPassword(String password) {
		password_txt.sendKeys(password);
	}

	public void clickOnLogin() {
		login_btn.click();
	}
	public void clickonForgotPasswordlink() {
		forgotPassword_lnk.click();
	}
}
