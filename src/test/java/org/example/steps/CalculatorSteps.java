package org.example.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.Calculator;

import org.example.MyCalculator;
import org.example.OtherCalculator;
import org.example.domain.Request;
import org.example.domain.Response;
import org.junit.Assert;

public class CalculatorSteps {

    private Calculator myCalculator;
    private Calculator otherCalculator;

    private Response myResponse;
    private Response otherResponse;

    @Given("^I have two calculators$")
    public void initializeCalculator() throws Throwable {
        myCalculator = new MyCalculator();
        otherCalculator = new OtherCalculator();
    }

    @When("^I add (-?\\d+) and (-?\\d+) using my calculator$")
    public void testMyCalculatorAdd(int num1, int num2) throws Throwable {
        myResponse = myCalculator.add(new Request(num1, num2));
    }

    @And("^I add (-?\\d+) and (-?\\d+) using other calculator$")
    public void testOtherCalculatorAdd(int num1, int num2) throws Throwable {
        otherResponse = otherCalculator.add(new Request(num1, num2));
    }

    @Then("^the result of my calculator should be (-?\\d+)$")
    public void validateMyCalculatorResult(int result) throws Throwable {
        Assert.assertEquals(myResponse.getResult(), result);
    }

    @And("^the result of other calculator should be (-?\\d+)$")
    public void validateOtherCalculatorResult(int result) throws Throwable {
        Assert.assertEquals(otherResponse.getResult(), result);
    }
}
