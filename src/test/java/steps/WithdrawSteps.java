package steps;

import org.junit.Assert;

import cucumberTM.cucumberTM.Bank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class WithdrawSteps {
	
	Bank bank;
	
	@Given("I have the same bank account with {int} amount")
	public void i_have_the_same_bank_account_with_amount(Integer init) {
	    bank = new Bank(init);

	}

	@When("I withdraw {int} amount from my account.")
	public void i_withdraw_amount_from_my_account(Integer some) {
		bank.withdraw(some);

	}

	@Then("I again verify the expected {int} in my account.")
	public void i_again_verify_the_expected_in_my_account(Integer expectedBalance) {
		int actualBalance = bank.getBalance();
		int expectedBal = Integer.parseInt("" + expectedBalance);
		Assert.assertEquals(expectedBal, actualBalance);
		
		
		
		

	}

}
