package RestAssuredQuestionsNotes;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TokenManager {
    private static String token;
    private static long expiryTime;

    public static String getToken() {
        if (token == null || isExpired()) {
            refreshToken(); // call login API
        }
        return token;
    }

    private static boolean isExpired() {
        return System.currentTimeMillis() > expiryTime;
    }

    private static void refreshToken() {
        Response response = given()
                .formParam("username", "user")
                .formParam("password", "pass")
                .post("/auth/login");

        token = response.jsonPath().getString("access_token");
        int expiresIn = response.jsonPath().getInt("expires_in"); // e.g., 3600 sec
        expiryTime = System.currentTimeMillis() + expiresIn * 1000;
    }

    @Test
    void dis(){
        given()
                .header("Authorization", "Bearer " + TokenManager.getToken())
                .get("/api/secure/data")
                .then()
                .statusCode(200);

    }
}

//so the approach is to create the token in before then later it will be used in tests
