	package stepDefinition;

import com.testPractice.CucumberPractice.BaseSetup;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseSetup{

	@Before("@MobileTest")
	public void beforeScenario() {
		System.out.println("Before Mobile Test - Hook");
	}
	@After("@MobileTest")
	public void AfterMobileValidation() {
		System.out.println("After Mobile Test");
	}
	@After
	public void AfterValidation() {
		System.out.println("After Selenium Test");
		driver.close(); 
	}
}
