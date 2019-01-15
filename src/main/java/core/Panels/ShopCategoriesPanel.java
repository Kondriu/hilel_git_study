package core.Panels;

import core.pages.AbstractPage;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.stream.Collectors;

public class ShopCategoriesPanel extends AbstractPanel {


    private static final String CATEGORIES = ".//span[@class='main-menu__text']"; // . перед двумя слешами - значит взять "всех" от указанного родителя

    public ShopCategoriesPanel(final WebElementFacade panelLocator, final AbstractPage rootPage) {
        super(panelLocator, rootPage);
    }

    public List<String> getCategoriesText() {
        final List<WebElementFacade> shopCategoriesITems = getRootPage().findAll(CATEGORIES); // findAll это как аннтация FindBys и вернел list
        return shopCategoriesITems.stream() //выбросили все элементы в потк
                .map(item -> item.getText())  // метод мап прошелся по всем и вынул текст как бы в цикле
                .collect(Collectors.toList()); // и сложидли в коллекцияю
        // и весб этот метод ввернет коллекцию в виде листа содержащую вынутый текст
    }


}
