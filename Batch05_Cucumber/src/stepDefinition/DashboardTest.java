package stepDefinition;

import cucumber.api.java.en.Then;

public class DashboardTest {
	@Then("^I should see the Accounts link$")
	public void I_should_see_the_Accounts_link() {
	   System.out.println("I should see the Accounts link");
	}

	@Then("^I should see the Home link$")
	public void I_should_see_the_Home_link() {
	   System.out.println("I should see the Home link");
	}

	@Then("^I should see the Opportunity link$")
	public void I_should_see_the_Opportunity_link() {
	  System.out.println("I should see the Opportunity link");
	}
}
