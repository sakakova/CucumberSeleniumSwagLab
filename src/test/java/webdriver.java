public class webdriver {
    package CucumberSeleniumSwagLab.webdriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

    public class WebDriver {

        public WebDriver driver;

        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\java\\resources\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com");
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @After
        public void close() {
            driver.quit();
        }
    }
}
