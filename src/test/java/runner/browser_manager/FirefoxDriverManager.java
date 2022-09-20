package runner.browser_manager;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager{
    protected void createdDriver() {
        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver/geckodriver.exe");
        driver = new FirefoxDriver();
    }
}
