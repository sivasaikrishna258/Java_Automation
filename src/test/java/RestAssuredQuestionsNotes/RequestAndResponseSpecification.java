package RestAssuredQuestionsNotes;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;
public class RequestAndResponseSpecification {
    public static void main(String[] args) {


        RequestSpecification requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://reqres.in")
                .setBasePath("/api")
                .addHeader("Content-Type", "application/json")
                .addHeader("Authorization", "Bearer your_token_here")
                .build(); //← this returns a RequestSpecification object

        given()
                .spec(requestSpec)
                .body("{ \"name\": \"morpheus\", \"job\": \"leader\" }")
                .when()
                .post("/users")
                .then()
                .statusCode(201);




        ResponseSpecification responseSpec = new ResponseSpecBuilder()

                .expectStatusCode(201)
                .expectContentType("application/json")
                .build(); //← this returns a ResponseSpecification object

        given()
                .spec(requestSpec)
                .body("{ \"name\": \"morpheus\", \"job\": \"leader\" }")
                .when()
                .post("/users")
                .then()
                .spec(responseSpec);




    }

    /**
     * ✅ In Simple Terms:
     * RequestSpecBuilder → like a form you fill out
     *
     * .build() → submits the form and gives you the result (RequestSpecification)
     *
     *
     🧠 Without .build()?
     You’d only have a partially configured builder object — not the actual usable RequestSpecification.


     🧪 Applies to:
     RequestSpecBuilder → .build() → RequestSpecification

     ResponseSpecBuilder → .build() → ResponseSpecification
     */
}
