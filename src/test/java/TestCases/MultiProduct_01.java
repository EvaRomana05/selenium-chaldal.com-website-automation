package TestCases;

import BasicPackage.ChromeDriverSetup;
import PageObject.MultiProductPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultiProduct_01 extends ChromeDriverSetup {

    public static String baseUrl = "https://chaldal.com";

    @Test(priority = 1)
    public static void soap() throws InterruptedException {

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);

//        driver.switchTo().alert().dismiss();
        MultiProductPageObject aMultiProductSelectPageObject = new MultiProductPageObject(driver);
        aMultiProductSelectPageObject.search.sendKeys("soap");
        Thread.sleep(5000);

        aMultiProductSelectPageObject.soap1.click();
//        aMultiProductSelectPageObject.soap1.click();
        Thread.sleep(4000);

        aMultiProductSelectPageObject.soadAddButton.click();
        aMultiProductSelectPageObject.soadAddButton.click();
        Thread.sleep(4000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(4000);

        aMultiProductSelectPageObject.soap2.click();
        Thread.sleep(3000);

        aMultiProductSelectPageObject.soap3.click();
        Thread.sleep(2000);

    }

    @Test(priority = 2)
    public static void oil() throws InterruptedException {

        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        MultiProductPageObject aMultiProductSelectPageObject = new MultiProductPageObject(driver);
        aMultiProductSelectPageObject.oilsearch.sendKeys("oil");
        Thread.sleep(6000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
        Thread.sleep(3000);

        aMultiProductSelectPageObject.oil1.click();
        Thread.sleep(4000);

        aMultiProductSelectPageObject.oil2.click();
        aMultiProductSelectPageObject.oil2.click();
        Thread.sleep(4000);

    }
}
