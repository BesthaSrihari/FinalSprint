package bigbasket1.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps1 {
	WebDriver driver;
		@Given("As a user i want to open browser,")
		public void as_a_user_i_want_to_open_browser() {
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		}

		@When("I want to open url {string}")
		public void i_want_to_open_url(String Url) {
		    driver.get(Url);
		}

		@When("click on signup\\/signin")
		public void click_on_signup_signin() {
			driver.findElement(By.xpath("(//a[@qa='loginLink'])[2]")).click();
		}

		@When("Enter valid mobile number and OTP {string}")
		public void enter_valid_mobile_number_and_OTP(String string) throws Exception {
			driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys(string);
			
			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();	
			
			Thread.sleep(15000);
		}

		@When("Click on verify and continue")
		public void click_on_verify_and_continue() {
			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		}

		@When("print sigin\\/signup is successful message")
		public void print_sigin_signup_is_successful_message() {
		    System.out.println("you succeffully signin/signup to bigbasket website");
		}
}