package com.thucydides.jbehave.sample.mediator;

import org.junit.Assert;

import net.thucydides.core.annotations.Step;

public class CalculatorMediator {

	private Integer number1;
	private Integer number2;
	private Integer sum;
	
	@Step
	public void setNumberOne(Integer number) {
		this.number1 = number;
	}
	
	@Step
	public void setNumberTwo(Integer number) {
		this.number2 = number;
	}

	@Step
	public void sum() {
		sum = number1 + number2;
	}

	@Step
	public void assertSumResult(Integer result) {
		Assert.fail();
		Assert.assertEquals(sum, result);
	}

}
