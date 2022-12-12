package pageObjectModel.nga.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjectModel.nga.pages.collectionPage;
import pageObjectModel.nga.pages.highlightsPage;
import pageObjectModel.nga.pages.homePage;
import pageObjectModel.nga.utils.BrowserUtils;
import pageObjectModel.nga.utils.DriverHelper;

public class ngaTest {

    @org.testng.annotations.Test
    public void test1() throws InterruptedException {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver=new ChromeDriver();

        WebDriver driver= DriverHelper.getDriver();
        driver.get("https://www.nga.gov/");
        driver.manage().window().maximize();
        homePage homePAge=new homePage(driver);

        homePAge.chooseOptionMenu("collection");
        Thread.sleep(5000);

        collectionPage collectionPage=new collectionPage(driver);
        BrowserUtils.scrollToElement(driver,collectionPage.highlights.get(0));
        collectionPage.discoverOption("highlights");
        Thread.sleep(5000);

        highlightsPage highlightsPage=new highlightsPage(driver);
        BrowserUtils.scrollToElement(driver,highlightsPage.collectionHighlights.get(40));
        highlightsPage.chooseHighlights("Classic Landscape");


//        homePAge.chooseOptionMenu("visit");
//
//        VisitPage visitPage=new VisitPage(driver);
//        scrollToElement(driver,visitPage.promoContent.get(0));
    }
}
