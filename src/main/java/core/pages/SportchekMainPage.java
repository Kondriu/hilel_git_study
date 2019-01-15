package core.pages;

import core.Panels.ShopCategoriesPanel;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SportchekMainPage extends AbstractPage {

    private static final String SHOP_CATEGORIES_PANEL_LOCATOR = "//nav[@class='page-nav ']";
    private static final String EXPAND_SHOP_CATEGORIES_PANEL_BUTTON = "//button[@class = 'menu-toggle']";

    public SportchekMainPage(final WebDriver driver) {
        super(driver);
    }

    public ShopCategoriesPanel getShopCategoriesPanel() {
        return new ShopCategoriesPanel(findBy(SHOP_CATEGORIES_PANEL_LOCATOR), this);
    }

    public void expandShopCategoriesPanel(){
        findBy(EXPAND_SHOP_CATEGORIES_PANEL_BUTTON).then().click();  //можно и без then(), но он потом надо чтобы краиво было в репортах

    }

}
