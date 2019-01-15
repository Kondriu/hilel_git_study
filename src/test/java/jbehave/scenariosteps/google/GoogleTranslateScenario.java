package jbehave.scenariosteps.google;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import serenity.steps.google.GoogleTranslateSteps;

public class GoogleTranslateScenario {


    @Steps
    private GoogleTranslateSteps googleTranslateSteps;

    @Given("open site '$link'")
    public void openGoogleTranslatePage(final String url) {

        googleTranslateSteps.openGoogleTranslateSite(url);
    }

    @When("user choose following language '$sourceLanguage' as source")
    public void typeSourceLanguage(final String language) {
        googleTranslateSteps.selectSourceLanguage(language);
    }

    @When("user choose following language '$targetLanguage' as target")
    public void typeTargetLanguage(final String language) {

        googleTranslateSteps.selectTargectLanguage(language);
    }

    @When("user type word '$inputWord'")
    public void typeTranslationInputWord(final String translationWord) {
        googleTranslateSteps.typeTranslationInputWord(translationWord);

    }

    @Then("user should see next translated word '$translatedResult'")
    public void isWordTranslatedCorrectly(final String expectedResult) {
        final String actula = googleTranslateSteps.getTranslatedWord();
        Assert.assertEquals("incorrect translation", expectedResult, actula);

    }
}
