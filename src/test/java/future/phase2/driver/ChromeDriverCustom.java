package future.phase2.driver;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverCustom implements DriverSource {
    @Override
    public WebDriver newDriver() {
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
        return chromeDriver;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
