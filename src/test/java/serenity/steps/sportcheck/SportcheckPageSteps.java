package serenity.steps.sportcheck;

import core.Panels.ShopCategoriesPanel;
import core.pages.SportchekMainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

import java.util.List;

public class SportcheckPageSteps {

    private SportchekMainPage sportchekMainPage; // обявили но не проинициализровано. при обращении будет нулПоинтерЭсепшен. надо обявить в конструкторе

    public SportcheckPageSteps (final Pages pages){
        // здесь мы обращаемся к классу(файлу класса, не *.java , а к *.class, кторый БУДЕТ СКОМПИЛИРОВАН после запуска
        this.sportchekMainPage = pages.getPage(SportchekMainPage.class);
    }

    @Step
    public void openPage(String urlLink) {
        sportchekMainPage.openAt(urlLink);
    }

    @Step
    public void expandShopCategories() {
        sportchekMainPage.expandShopCategoriesPanel();
    }

    @Step
    public List<String> getShopCategoriesList() {
        final ShopCategoriesPanel shopCategoriesPanel = sportchekMainPage.getShopCategoriesPanel();
        return shopCategoriesPanel.getCategoriesText();
    }
}
