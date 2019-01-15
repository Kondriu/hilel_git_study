package serenity.steps.google;

import core.pages.GoogleTranslatePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class GoogleTranslateSteps extends ScenarioSteps {

    private GoogleTranslatePage googleTranslatePage;

    public GoogleTranslateSteps(final Pages pages) {
        this.googleTranslatePage = pages.getPage(GoogleTranslatePage.class);
    }

    @Step
    public void openGoogleTranslateSite(String url) {
        googleTranslatePage.openAt(url);

    }

    @Step
    public void selectSourceLanguage(String language) {
        googleTranslatePage.getTranslatePanel().selectSourceLanguage(language);

    }

    @Step
    public void selectTargectLanguage(String language) {
        googleTranslatePage.getTranslatePanel().selectTargetLanguage(language);

    }

    @Step
    public void typeTranslationInputWord(String translationWord) {
        googleTranslatePage.getTranslatePanel().typeTextTOTranslate(translationWord);

    }

    @Step
    public String getTranslatedWord() {
        return googleTranslatePage.getTranslatePanel().getTranslatedText();

    }
}
