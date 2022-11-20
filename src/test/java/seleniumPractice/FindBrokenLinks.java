package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

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
        driver.get("https://target.com");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        for(WebElement e: links) {
            String url = e.getAttribute("href");

        }

    }
}
