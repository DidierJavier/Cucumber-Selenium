package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComicsPage extends BasePage{

    @FindBy(className = "page-title")
    private WebElement pageTitleLocator;

    private String titlePage = "Category: comics";

    /*public By getPageTitleLocator() {
        return pageTitleLocator;
    }

    public String getTitlePage() {
        return titlePage;
    }*/

    public ComicsPage(WebDriver driver){
        super(driver);
    }

    public boolean isTitleComicsDisplayed() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePage);
    }
}
