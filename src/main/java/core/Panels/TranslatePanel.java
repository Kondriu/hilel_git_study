package core.Panels;

import core.pages.AbstractPage;
import net.serenitybdd.core.pages.WebElementFacade;

public class TranslatePanel extends AbstractPanel {


    private static final String SOURCE_LANG = "//div[@class='sl-wrap']//div[text()='%s']";
    private static final String TARGET_LANG = "//div[@class='tl-wrap']//div[text()='%s']";

    private static final String SOURCE_AREA = "//textarea[@id='source']";
    private static final String TARGET_AREA = "//span[@class='tlid-translation translation']//*";



    public TranslatePanel(final WebElementFacade panelLocator, final AbstractPage rootPage) {
        super(panelLocator, rootPage);
    }


    public void selectSourceLanguage(final String lang) {
        selectRequiredParameter(SOURCE_LANG, lang);

    }

    public void selectTargetLanguage(final String lang) {
        selectRequiredParameter(TARGET_LANG, lang);

    }

    public void typeTextTOTranslate(final String text) {
        getRootPage().findBy(SOURCE_AREA).then().type(text);

    }

    public String getTranslatedText() {
        return getRootPage().findBy(TARGET_AREA).then().getText();
    }



    private void selectRequiredParameter(final String shortPass, final String language) {
        final String fullPath = String.format(shortPass, language); // стринформат заменит %s в строке на заданную переменную
        getRootPage().findBy(fullPath).click();

    }

}
