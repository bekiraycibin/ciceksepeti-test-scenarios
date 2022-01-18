import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.CoreMatchers.containsString;



public class SignUp_api_test {
    String baseURI = "https://bootcampapi.techcs.io/api/fe/v1/authorization/signup";

    @Test
    public void userAlreadyExist() {
        String nameBody = "{\"email\":\"1234@gmail.com\",\"password\":\"12345678\"\n}";

        given()
                .contentType(ContentType.JSON)
                .body(nameBody)
                .when()
                .post(baseURI)
                .then()
                .statusCode(409)
                .body("message", equalTo("User already exist!"));
    }

    @Test
    public void PasswordShouldBeLongerThan8Char() {
        String nameBody = "{\"email\":\"1234@gmail.com\",\"password\":\"1234567\"\n}";

        given()
                .contentType(ContentType.JSON)
                .body(nameBody)
                .when()
                .post(baseURI)
                .then()
                .statusCode(400)
                .body(containsString("password must be longer than or equal to 8 characters"));
    }
    @Test
    public void PasswordShouldBeShorterThan20Char() {
        String nameBody = "{\"email\":\"1234@gmail.com\",\"password\":\"1234567897649678345869\"\n}";

        given()
                .contentType(ContentType.JSON)
                .body(nameBody)
                .when()
                .post(baseURI)
                .then()
                .statusCode(400)
                .body(containsString("password must be shorter than or equal to 20 characters"));
    }

    @Test
    public void unValidEmail() {
        String nameBody = "{\"email\":\"1234\",\"password\":\"12345678\"\n}";

        given()
                .contentType(ContentType.JSON)
                .body(nameBody)
                .when()
                .post(baseURI)
                .then()
                .statusCode(400)
                .body(containsString("email must be an email"));

    }
    @Test
    public void successSignUp(){
        String nameBody = "{\"email\":\"abc685@gmail.com\",\"password\":\"12345678\"\n}";
        given()
                .contentType(ContentType.JSON)
                .body(nameBody)
                .when()
                .post(baseURI)
                .then()
                .statusCode(201)
                .body(containsString("access_token"));
    }
}
