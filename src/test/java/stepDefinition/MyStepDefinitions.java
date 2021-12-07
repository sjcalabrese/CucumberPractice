package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.testPractice.CucumberPractice.BaseSetup;
import com.testPractice.CucumberPractice.PageObjects.HomePage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefinitions {

	public WebDriver driver;
	HomePage hp;
	
	@Given("^User is on GreenKart landing page$")
	public void user_is_on_greenkart_landing_page() throws Throwable {
		
		driver = BaseSetup.getDriver();		
	}

	@When("^User searched for (.+) vegetable$")
	public void user_searched_for_something_vegetable(String strArg1) throws Throwable {

		hp = new HomePage(driver);
		hp.getSearch().sendKeys(strArg1);
		Thread.sleep(3000);
	}

	@Then("^\"([^\"]*)\" results are displayed$")
	public void something_results_are_displayed(String strArg1) throws Throwable {

		Assert.assertTrue((driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1)));

	}

	@And("^Added items to cart$")
	public void added_items_to_cart() throws Throwable {
		driver.findElement(By.cssSelector("a.increment")).click();
		driver.findElement(By.xpath("//button[contains(text(), 'ADD TO CART')]")).click();
	}

	@And("^Proceed to checkout$")
	public void proceed_to_checkout() throws Throwable {
		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
	}

	@Then("^Verify selected (.+) items are displayed in check out page$")
	public void verify_selected_something_items_are_displayed_in_check_out_page(String strArg1) throws Throwable {
		Thread.sleep(3000);
		Assert.assertTrue((driver.findElement(By.cssSelector("p.product-name")).getText().contains(strArg1)));
	}

}
