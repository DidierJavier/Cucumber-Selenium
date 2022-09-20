package seleniumgluecode;

import POM.ComicsPage;
import POM.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {

    protected final WebDriver driver = Hooks.getDriver();

    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    protected ComicsPage comicsPage = PageFactory.initElements(driver, ComicsPage.class);
}
