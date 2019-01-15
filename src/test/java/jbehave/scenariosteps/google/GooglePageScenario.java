package jbehave.scenariosteps.google;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.junit.Assert;
import serenity.steps.google.GooglePageSteps;

public class GooglePageScenario {

    @Steps
    private GooglePageSteps googlePageSteps;

    @Given("user opened Google page, using following link: '$link'")
    public void openGooglePage(final String url) {
        googlePageSteps.openGooglePage(url);

    }

    @Then("the page should be opened")
    public void idGooglePageOpened() {
        final String expectedTitle = "Google";
        Assert.assertEquals("incorrect titile",
                expectedTitle, googlePageSteps.getOpenPageTitle());

    }
}
