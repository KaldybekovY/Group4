package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

public class FindBrokenLinks {


    @Test
    public void MusicPlay() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://amazon.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("# of links are: " + links.size());

        for (WebElement e : links) {
            String url = e.getAttribute("href");
            verifyLinks(url);
        }

        driver.quit();

    }

    public static void verifyLinks(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.connect();

            if (httpURLConnection.getResponseCode() >= 400) {
                System.out.println(linkUrl + "--->" + httpURLConnection.getResponseCode() + " is a broken link");

            } else {
                System.out.println(linkUrl + "--->" + httpURLConnection.getResponseCode() + " is a good link");
            }

        } catch (Exception e) {
            System.out.println("Exception here - please check");
        }
    }
}
