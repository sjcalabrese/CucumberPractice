package stepDefinition;

import java.util.List;

import org.junit.runner.RunWith;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	@Given("^User is on landing page$")
	public void user_is_on_landing_page() throws Throwable {
		System.out.println("Navigated to login landing page");
	}

	@When("User logs in to application with {string} and {string}")
	public void user_logs_in_to_application_with_and(String userId, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Loging with userid: " + userId + " Password: " + password);
	}

	public void user_logs_in_to_application_with_username_and_password() throws Throwable {
		System.out.println("Logged in");
	}

	@Then("^Home page is displayed$")
	public void home_page_is_displayed() throws Throwable {
		System.out.println("Made it to home page");

	}

	@And("^Cards are displayed$")
	public void cards_are_displayed() throws Throwable {
		System.out.println("Validated Cards");
	}

	@Then("Cards are not  displayed")
	public void cards_are_not_displayed() {
		System.out.println("Cards are not displayed for John");
	}

	@When("^User signs up with following details$")
	public void user_signs_up_with_following_details(DataTable data) throws Throwable {
		List<String> dataObj = data.asList();
		System.out.println(dataObj.get(0));
		System.out.println(dataObj.get(1));
		System.out.println(dataObj.get(2));
		System.out.println(dataObj.get(3));
		System.out.println(dataObj.get(4));

	}

	// using parameterized scenario

	@When("^User logs into application with (.+) and (.+)$")
	public void userLogsIntoApplicationUsingUserAndPasswordParameters(String username, String password)
			throws Throwable {
		System.out.println(username);
		System.out.println(password);
	}

	@Given("^validate the browser$")
	public void validate_the_browser() throws Throwable {
		System.out.println("Browser if available");
	}

	@When("^browser is triggered$")
	public void browser_is_triggered() throws Throwable {
		System.out.println("Browser is triggered");
	}

	@Then("^check if browser is started$")
	public void check_if_browser_is_started() throws Throwable {
		System.out.println("Browser Started");
	}
}
