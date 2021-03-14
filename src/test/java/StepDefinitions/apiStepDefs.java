package StepDefinitions;

import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

import static io.restassured.RestAssured.given;

public class apiStepDefs {
    protected static RequestSpecification requestSpec;
    protected static ResponseSpecification responseSpec;

    @When("I call GET I have a response")
    public void iCallGETIHaveAResponse() {
        requestSpec = new RequestSpecBuilder().
                setBaseUri("https://petstore.swagger.io/v2").
                build();
        Response response = given().
                spec(requestSpec).
                when().
                get("/entries?category=animals&https=true");
        //System.out.println(response.asString());
    }

    @When("I call Get Catagories I have a response")
    public void iCallGetCatagoriesIHaveAResponse() {
        requestSpec = new RequestSpecBuilder().
                setBaseUri("https://api.publicapis.org/").
                build();
        Response response = given().
                spec(requestSpec).
                when().
                get("/random?auth=null").
                then().assertThat().extract().response();
        //System.out.println(response.asString());
        System.out.println(response.then().extract().body().jsonPath().prettify());
        System.out.println(response.then().extract().body().path("entries.API").toString());

        requestSpec = new RequestSpecBuilder().
                setBaseUri("https://api.publicapis.org/").
                build();
        Response response2 = given().
                spec(requestSpec).
                when().
                get("/categories").
                then().assertThat().extract().response();
        //System.out.println(response.asString());
        System.out.println(response2.then().extract().body().jsonPath().prettify());
        //System.out.println(response2.then().extract().body().path("entries.API").toString());
    }
}
