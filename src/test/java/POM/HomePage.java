package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    private String siteDescriptionString = "Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
    @FindBy(className = "site-description")
    private WebElement siteDescription;

    @FindBy(id = "menu-item-2008")
    private WebElement titleComicsLocator;

    /*public String getSiteDescriptionString() {
        return siteDescriptionString;
    }

    public By getSiteDescription() {
        return siteDescription;
    }

    public By getTitleComicsLocator() {
        return titleComicsLocator;
    }*/

    public HomePage(WebDriver driver){
        super(driver);
    }

    public boolean homePageIsDisplayed() throws Exception {
        return isDisplayed(siteDescription);
    }

    public void clickOnTitleComics() throws Exception {
        this.click(titleComicsLocator);
    }
}
