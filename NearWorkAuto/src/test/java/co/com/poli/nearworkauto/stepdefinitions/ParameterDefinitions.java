package co.com.poli.nearworkauto.stepdefinitions;

import co.com.poli.nearworkauto.models.UserCreateRequest;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class ParameterDefinitions {

    @DataTableType
    public UserCreateRequest userCreateRequest(Map<String, String> userCreate) {
        UserCreateRequest.setUserCreateRequest(
                new UserCreateRequest(userCreate.get("email").toString(),
                userCreate.get("password").toString(),
                userCreate.get("name").toString(),
                userCreate.get("lastName").toString(),
                userCreate.get("documentType").toString(),
                userCreate.get("documentNumber").toString(),
                Long.parseLong(userCreate.get("cellPhone").toString()),
                userCreate.get("address").toString(),
                userCreate.get("role").toString())
        );
        return UserCreateRequest.getUserCreateRequest();
    }
}
