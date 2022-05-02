package parallel;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on login page")
	public void user_is_on_login_page() {

		DriverFactory.getDriver()
				.get("https://www.flipkart.com/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getLoginPageTitle();
		System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}



	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() throws InterruptedException {
		loginPage.clickOnLogin();
		Thread.sleep(5000);
	}


	@Given("user enters username")
	public void userEntersUsername() {
		loginPage.enterUserName("alfotech512@gmail.com");
	}

	@Given("user enters password")
	public void userEntersPassword() throws InterruptedException {
		loginPage.enterPassword("Test123!");
		//loginPage.doLogin("alfotech512@gmail.com","Test123!");
		//Thread.sleep(3000);loggenin_user
	}

	@Then("validate the logged in user")
	public void validateTheLoggedInUser() {
		loginPage.is_displayed(loginPage.loggenin_user);
	}
}
