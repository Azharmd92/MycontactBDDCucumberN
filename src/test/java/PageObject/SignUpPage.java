package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	public WebDriver ldriver;
	
	public SignUpPage(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements( rdriver,this);
		
		}
	@FindBy(xpath="//a[normalize-space()='Sign Up For Free']")
	WebElement Lnkbutton;
	
	@FindBy(id="name")
	WebElement txtName;
	
	@FindBy(id="email")
	WebElement txtemail;
	
	@FindBy(id="user_signup")
	WebElement txtuserName;
	
	@FindBy(id="pass_signup")
	WebElement txtPassword;
	
	@FindBy(id="pass2")
	WebElement txtPassword2;
	
	@FindBy(xpath="//input[@id='useragree']")
	WebElement clickCheckbox;
	
	public void clickSignUp() {
		Lnkbutton.click();
		}
	public void setName(String name) {
		txtName.sendKeys(name);
		
	}
	public void setEmail(String email) {
		txtemail.sendKeys(email);
		
	}
     public void setUserName(String uname) {
    	 txtuserName.sendKeys(uname);
		
	}
     public void setPassword(String pass) {
    	 txtPassword.sendKeys(pass);

    }
     public void setPassword2(String pass2) {
    	 txtPassword2.sendKeys(pass2);
	
    }
     public void clickCheckbox() {
    	 clickCheckbox.click();
	
    }
}
