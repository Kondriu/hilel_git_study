package jbehave.scenariosteps.jsonserver;

import dto.PostDTO;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.model.ExamplesTable;
import org.springframework.aop.aspectj.annotation.ReflectiveAspectJAdvisorFactory;
import org.unitils.reflectionassert.ReflectionAssert;
import serenity.steps.jsonServer.JsonServerWebServiceSteps;

public class JsonServerApiScenario {

    @Steps
    private JsonServerWebServiceSteps webServiceSteps;

    @Given("user creates new post with following details: $details")
    public void createNewPostWithDetails(final ExamplesTable detail){
        final PostDTO postDTO = detail.getRowsAs(PostDTO.class).get(0);
        webServiceSteps.createNewPost(postDTO);
    }

    @Then("reated post with id '2' should be available with next details: $details")
    public void isCreatedPostAvailable(final ExamplesTable details){
        final PostDTO postDTO = details.getRowsAs(PostDTO.class).get(0);
        final PostDTO actualPostDetails = webServiceSteps.getCreatedResource();

    }
}
