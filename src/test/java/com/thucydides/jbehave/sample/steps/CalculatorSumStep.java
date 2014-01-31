package com.thucydides.jbehave.sample.steps;

import net.thucydides.core.annotations.Steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.thucydides.jbehave.sample.mediator.CalculatorMediator;

public class CalculatorSumStep {

	@Steps
	private CalculatorMediator calculatorMediator;

	@Given("number $n1 and number $n2")
	public void givenTwoNumbers(String n1, String n2) {
		calculatorMediator.setNumberOne(Integer.valueOf(n1));
		calculatorMediator.setNumberTwo(Integer.valueOf(n2));
	}
	
	@When("I perform the sum")
	public void whenIPerformTheSum() {
		calculatorMediator.sum();
	}
	
	@Then("the result is $result")
	public void thenTheResultIs(String result) {
		calculatorMediator.assertSumResult(Integer.valueOf(result));
	}
	
}
