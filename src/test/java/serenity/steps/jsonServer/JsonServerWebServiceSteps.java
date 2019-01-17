package serenity.steps.jsonServer;

import core.ws.AbstractWsConfiguration;
import dto.PostDTO;
import io.restassured.http.ContentType;
import net.thucydides.core.annotations.Step;
import utils.JsonUtils;

import static io.restassured.RestAssured.given;

public class JsonServerWebServiceSteps extends AbstractWsConfiguration {

    private static final String JSON_LOCALHOST_SERVER_URL = "http://localhost:3000";
    private static final String POST_API_PATH = "/posts";
    private static final String COMMENTS_API_PATH = "/comments";
    private static final String PROFILE_API_PATH = "/profile";

    @Step
    public void createNewPost(final PostDTO postDTO){
        //final PostDTO postDTO = new PostDTO();
        //postDTO.setAuthor("author hhhh");
        //postDTO.setTitle("title ssss");
        final String postDtoJson = JsonUtils.toJson(postDTO);
        given().baseUri(JSON_LOCALHOST_SERVER_URL)
                .contentType(ContentType.JSON)
                .body(postDtoJson)
                .post(POST_API_PATH);

    }

    @Step
    public PostDTO getCreatedResource(){
        final String createPostApiPath = String.format("%s%s", POST_API_PATH, "/2"); //POST_API_PATH + "?id=2";
        return given().baseUri(JSON_LOCALHOST_SERVER_URL)
                .contentType(ContentType.JSON)
                .get(createPostApiPath).as(PostDTO.class);
    }

//    public static void main(String[] args) {
//        final JsonServerWebServiceSteps steps = new JsonServerWebServiceSteps();
//        steps.createNewPost();
//        final PostDTO createdResource = steps.getCreatedResource();
//
//    }
}
