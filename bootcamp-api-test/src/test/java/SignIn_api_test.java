import io.restassured.http.ContentType;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;



public class SignIn_api_test {
    String baseURI = "https://bootcampapi.techcs.io/api/fe/v1/authorization/signin";

    @Test
    public void successSignIn() {
        String nameBody = "{\"email\":\"1234@gmail.com\",\"password\":\"12345678\"\n}";

        given()
                .contentType(ContentType.JSON)
                .body(nameBody)
                .when()
                .post(baseURI)
                .then()
                .statusCode(201)
                .body(containsString("access_token"));
    }

    @Test
    public void Unauthorized() {
        String nameBody = "{\"email\":\"1234@gmail.com\",\"password\":\"1234567\"\n}";

        given()
                .contentType(ContentType.JSON)
                .body(nameBody)
                .when()
                .post(baseURI)
                .then()
                .statusCode(401)
                .body(containsString("Unauthorized"));
    }
}
