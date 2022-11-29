package co.com.poli.nearworkauto.stepdefinitions;

import co.com.poli.nearworkauto.models.UserCreateRequest;
import co.com.poli.nearworkauto.tasks.Create;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.poli.nearworkauto.utils.Variables.ENV_URL;
import static co.com.poli.nearworkauto.utils.Variables.loadEnvironmentVariables;
import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UserStepDefinitions {

    @Before
    public void setTheStage() {
        loadEnvironmentVariables();
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) needs to consume the api$")
    public void someoneNeedsToConsumeTheApi(String actor) {
        theActorCalled(actor).whoCan(CallAnApi.at(ENV_URL));
    }

    @When("he creates a user")
    public void heCreatesAUser(UserCreateRequest userCreateRequest) {
        theActorInTheSpotlight().attemptsTo(Create.anUser(userCreateRequest));
    }

    @Then("he should get the status code {int}")
    public void heShouldGetTheStatusCode(Integer statusCode) {
        theActorInTheSpotlight().attemptsTo(Ensure.that(lastResponse().getStatusCode()).isEqualTo(statusCode));
    }
}
