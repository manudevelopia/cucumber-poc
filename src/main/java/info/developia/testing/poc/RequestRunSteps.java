package info.developia.testing.poc;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class RequestRunSteps {

    private String url;
    private String path;

    private Request request;
    private int statusCode;
    private HttpResponse<JsonNode> response;

    @Before
    private void init() {
        url = "";
    }

    @Given("^url (.*)$")
    public void setUrl(String url) {
        this.url = url;
    }

    @Given("^path (.*)$")
    public void setPath(String path) {
        this.path = path;
    }

    @When("^method (-?\\w+)")
    public void testAdd(String method) throws Throwable {
        response = Unirest.get(url + path).asJson();
        statusCode = response.getStatus();
    }

    @Then("^status (-?\\d+)$")
    public void validateResult(int statusCode) throws Throwable {
        assert this.statusCode == statusCode : "ooooohhhh " + this.statusCode;
    }

    @Then("^response (.*) (.*)$")
    public void validateResult(String name, String value) throws Throwable {
        response.getBody();
        var received = response.getBody().getObject().optString(name);
        assert received.equals(value) : "Expected " + value + " but received " + received;
    }

    @Then("^match (.*)$")
    public void matchPattern(String pattern) throws Throwable {
        response.getBody();
    }
}
