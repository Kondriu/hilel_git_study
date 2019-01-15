package jbehave.scenariosteps.sportcheck;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import serenity.steps.sportcheck.SportcheckPageSteps;

import java.util.List;

public class SportcheckMainPageScenario {

    @Steps //не путать со @Step -
    private SportcheckPageSteps sportcheckPageSteps; // укажзываем где лежат степы

    @Given("user is opened Sportcheck main page, using url: '$link'")
    public void openSportcheckMainPage(final String urlLink) {
        sportcheckPageSteps.openPage(urlLink);
    }


    @When("User click 'shop categories' button")
    public void clickCategoryButton() {

        sportcheckPageSteps.expandShopCategories();
    }

    @Then("next categories should be displayed: '$categoriesList'")
    public void verifyListString(final List<String> expectedShopCategories) {
        final List<String>  actualShopCategories = sportcheckPageSteps.getShopCategoriesList();
        Assert.assertArrayEquals("wrong categories list", expectedShopCategories.toArray(), actualShopCategories.toArray());

    }

    //лист джейбихейв сам будет разруливать как разбить. у него есть набор разделителей по кторым парсит (, ; : пробел ?)
    // чтобы не разбило по нужному в строке символу то строку надо взять в одинарные кавычки 'cat:balck' - так не будет разбито на два обьекта массива


}

