package steps;

import org.junit.Assert;

import cucumberTM.cucumberTM.Bank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DepositSteps {
	
	Bank bank;
	
	@Given("I have a bank account with {int} amount")
	public void i_have_a_bank_account_with_amount(Integer init) {
	    bank = new Bank(init);

	}

	@When("I deposit {int} amount to my account.")
	public void i_deposit_amount_to_my_account(Integer some) {
		bank.deposit(some);

	}

	@Then("I verify the expected {int} in my account.")
	public void i_verify_the_expected_in_my_account(Integer expectedBalance) {
		int actualBalance = bank.getBalance();
		int expectedBal = Integer.parseInt("" + expectedBalance);
		Assert.assertEquals(expectedBal, actualBalance);
		
		
		
		

	}

}
