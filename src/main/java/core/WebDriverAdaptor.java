package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class WebDriverAdaptor implements WebDriver {

    // чтобы подружить панель и старницу то надо создать "мостик" в виде этог

    private WebElement panel;
    //  суко локатор панельки

    private WebDriver rootPage;
    // для работы вебэлемента нужен вебдрайвер. вебрайвер у нас есть на рут странице (в конструкторе)
    //и мы инициализируем поле типа WebDriver в виде страницы рутовой. кторая имеет драйвер (кторый получили в праметре  при обра щенни к классу)
    //далее мы это буде м скармливать серенити и оно будет "дружить" панель со старницей
    // будет брать страницу и искать хедер, кторый будет чалдом для пейджы, а потом будет вызывть элемеент на пример инпута. кторый будет чалдом хедера

    public WebDriverAdaptor(final WebElement panel, final WebDriver rootPage) {
        this.panel = panel;
        this.rootPage = rootPage;
    }


    @Override
    public void get(String s) {
        rootPage.get(s);
    }

    @Override
    public String getCurrentUrl() {
        return rootPage.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return rootPage.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return rootPage.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return rootPage.findElement(by);
    }

    @Override
    public String getPageSource() {
        return rootPage.getPageSource();
    }

    @Override
    public void close() {
        rootPage.close();
    }

    @Override
    public void quit() {
        rootPage.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return rootPage.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return rootPage.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return rootPage.switchTo();
    }

    @Override
    public Navigation navigate() {
        return rootPage.navigate();
    }

    @Override
    public Options manage() {
        return rootPage.manage();
    }
}
