package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(id = "user")
	WebElement txtuserName;

	@FindBy(id = "pass")
	WebElement txtpassWord;

	@FindBy(name = "btnSubmit")
	WebElement btnLogin;

	@FindBy(xpath = "//a[text()='Logout']")
	WebElement btnLogout;

	public void setUserName(String uname) {
		txtuserName.sendKeys(uname);
	}

	public void setpassWord(String pass) {
		txtpassWord.sendKeys(pass);
	}

	public void clickLogin() {
		btnLogin.click();
	}

	public void clickLogout() {
		btnLogout.click();
		;
	}
}
