package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void inicializaNavegador(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void esperaElemento(WebElement element){

        Wait<WebDriver>wait = new WebDriverWait(driver,Duration.ofSeconds(3));
        wait.until(d->element.isDisplayed());
    }

    public static void mudarFrame(){

        driver.switchTo().frame(0);
    }

    public static void refresh(){

        driver.navigate().refresh();
    }



}
