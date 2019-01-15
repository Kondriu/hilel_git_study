package core.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage extends PageObject {

    public AbstractPage(final WebDriver driver) {
        super(driver); //мы передали контсрутору super элемент driver который получили в параметрах
        // и поэтому уже работаем с драйвером через метод getDriver() . т.к. он в кла
        getDriver().manage().window().maximize();
    }

}
