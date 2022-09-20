package seleniumgluecode;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

public class Hooks {

    private static WebDriver driver;
    private static int numberOfCase = 0;

    private DriverManager driverManager;

    @Before()
    public void setUp(){
        numberOfCase++;
        System.out.println("Se está ejecutando el escenario número = " + numberOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.EDGE);
        driver = driverManager.getDriver();
        driver.get("https://imalittletester.com");
        driver.manage().window().maximize();
    }

    @After()
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)driverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
        }
        driverManager.quitDriver();
        System.out.println("Finalizó la ejecución del escenario número = " + numberOfCase);
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
