package serenity.steps.google;

import core.pages.GoogleMainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;
import org.yecht.Data;

public class GooglePageSteps extends ScenarioSteps {

    private GoogleMainPage googleMainPage;

    public GooglePageSteps (final Pages pages){
        googleMainPage = pages.getPage(GoogleMainPage.class);
    }

    @Step
    public String getOpenPageTitle(){
        return  googleMainPage.getCurrentTittle();
    }

    @Step
    public void typeSearchText(final String string){
        googleMainPage.typeSearchText(string);
    }

    @Step
    public void openGooglePage(final String link){
        googleMainPage.openAt(link);
    }
}
