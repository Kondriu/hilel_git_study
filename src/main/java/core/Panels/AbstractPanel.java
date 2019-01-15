package core.Panels;

import core.WebDriverAdaptor;
import core.pages.AbstractPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.locators.SmartElementLocatorFactory;
import net.thucydides.core.annotations.locators.SmartFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;

public abstract class AbstractPanel {

    private long waitForTimeoutMilliSeconds; // просетится из пропертей серенити     из проперти файла

    private AbstractPage rootPage;

    private WebDriverAdaptor panelLocator;


// мы всегда обращаясь к любой панели любого класса будет вызываться контрукторкласса и будети инициализоровать ее только при обращении
    public AbstractPanel(final WebElementFacade panelLocator, final AbstractPage rootPage) {

        this.rootPage = rootPage;
        this.panelLocator = new WebDriverAdaptor(panelLocator, rootPage.getDriver());
        initPanel();
    }

    public AbstractPage getRootPage() {
        //метод для созданных панелей.
        // чтобы они могли получить доступ к рут пейдж (кторая абстракт пейдж). а уже сама пейджа настледует класс пейджобджект
        return rootPage;
    }


    private void initPanel() { // самый важный метод - инициализирует панельку
        final ElementLocatorFactory finder = new SmartElementLocatorFactory(panelLocator, null, (int) waitForTimeoutMilliSeconds);
        final FieldDecorator decorator = new SmartFieldDecorator(finder, rootPage.getDriver(), rootPage);
        PageFactory.initElements(decorator, this); // передаем уже не драйвер, а пеерписанный серенити декотратор


    }

}
