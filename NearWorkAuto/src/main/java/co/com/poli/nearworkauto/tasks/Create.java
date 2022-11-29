package co.com.poli.nearworkauto.tasks;

import co.com.poli.nearworkauto.models.UserCreateRequest;
import com.google.gson.Gson;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class Create implements Task {

    private final UserCreateRequest userCreateRequest;

    public Create(UserCreateRequest userCreateRequest) {
        this.userCreateRequest = userCreateRequest;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Post.to("/auth/create").with(
                        request ->
                                request.header("Content-Type", "application/json")
                                        .body(new Gson().toJson(userCreateRequest))));
       // UserCreateResponse.setUserCreateResponse(lastResponse().jsonPath().getObject("",UserCreateResponse.class));
    }

    public static Create anUser(UserCreateRequest userCreateRequest) {
        return Tasks.instrumented(Create.class, userCreateRequest);
    }

}
