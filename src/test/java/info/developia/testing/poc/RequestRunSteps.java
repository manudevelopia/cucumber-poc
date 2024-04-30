package info.developia.testing.poc;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequestRunSteps {

    private String url;
    private Request request;
    private int responseStatusCode;

    @Before
    private void init() {
        url = "";
    }

    @Given("^url (-?\\w+)$")
    public void initializeCalculator(String url) throws Throwable {
        this.url = url;
    }

    @When("^method (-?\\w+)")
    public void testAdd(String method) throws Throwable {
        responseStatusCode = 200;
    }

    @Then("^status (-?\\d+)$")
    public void validateResult(int result) throws Throwable {
        assert responseStatusCode == result;
    }
}
