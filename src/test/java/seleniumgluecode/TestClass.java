package seleniumgluecode;

import POM.HomePage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestClass extends TestBase{
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    @Dado("^que el usuario se encuentra en el home de imalittletsrs$")
    public void que_el_usuario_se_encuentra_en_el_home_de_imalittletsrs() throws Exception {

        wait.until(WebDriver::getTitle);
        //WebElement siteDescription = driver.findElement(homePage.getSiteDescription());
        Assert.assertTrue(homePage.homePageIsDisplayed());
    }

    @Cuando("^hace click sobre el boton de little tester comics$")
    public void hace_click_sobre_el_boton_de_little_tester_comics() throws Exception {
        //WebElement titleComicsLocator = driver.findElement(homePage.getTitleComicsLocator());
        homePage.clickOnTitleComics();
    }

    @Entonces("^se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Exception {
        //WebElement pageTitleLocator = driver.findElement(comicsPage.getPageTitleLocator());
        //Assert.assertTrue("No se redireccionó correctamentamenta a la página de comics",
          //      pageTitleLocator.isDisplayed());
        //Assert.assertEquals(comicsPage.getTitlePage(), pageTitleLocator.getText());
        System.out.println("vAMOS BIEN");
        wait.until(WebDriver::getTitle);
        Assert.assertTrue("No se direccinó a la página comics", comicsPage.isTitleComicsDisplayed());

        driver.quit();
    }
}
