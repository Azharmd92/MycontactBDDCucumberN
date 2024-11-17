package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import PageObject.LoginPage;
import PageObject.SignUpPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;






public class Steps {

	public WebDriver driver;
	public LoginPage lp;
	public SignUpPage sp;

	@Given("user open chrome browser")
	public void user_open_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C://Users//mdazh//Downloads//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--remote-allow-origin=*");
		driver=new ChromeDriver(co);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
		sp=new SignUpPage(driver);	

	}


	@When("user open URL{string}")
	public void user_open_URL(String url) {
		driver.get(url);
	}


	@When("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String username, String password) throws InterruptedException {
		lp.setUserName(username);
		lp.setpassWord(password);
		//Thread.sleep(3000);

	}


	@When("click the login button")
	public void click_the_login_button() throws InterruptedException, IOException {
		lp.clickLogin();
		//Thread.sleep(3000);


		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File Trg= new File(".\\Screenshots\\Homepage.png");
		FileUtils.copyFile(src, Trg);
    }
	@When("click the logout button")
	public void click_the_logout_button() throws InterruptedException {
		lp.clickLogout();
		//Thread.sleep(3000);
	} 
	@When("user click on SignUp Link")
	public void user_click_on_sign_up_link() {
		sp.clickSignUp();

	}

	@When("user enter name as {string}")
	public void user_enter_name_as(String name) {
		sp.setName(name);

	}

	@When("user enter email as {string}")
	public void user_enter_email_as(String email) {
		sp.setEmail(email);

	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String username) {

		sp.setUserName(username);




	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String pass) {
		sp.setPassword(pass);


	}

	@When("user enter Password2 as {string}")
	public void user_enter_password2_as(String pass2) {

		sp.setPassword2(pass2);
	}


    @Then("click on checkBox")
	public void click_on_check_box() {
		sp.clickCheckbox();


	}
    @Then("close browser")
	public void close_browser() {

		driver.quit();
	}

	@AfterStep
	public void addScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}


	@Before
	public void setup() {
		System.out.println("Setup..!");
	}

	@After
	public void tearDown() {
		System.out.println("Successful Test is complteted");
		driver.quit();
	}
}

