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

public class playPiano {


    @Test
    public void MusicPlay() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.musicca.com/piano");

        List<WebElement> allKeys = driver.findElements(By.xpath("//span[@data-key]"));
        HashMap<String, WebElement> keyBoard = new HashMap<>();
        for (WebElement key : allKeys) {
            keyBoard.put(key.getAttribute("data-note"), key);
        }
        String [] surprise = {"1g","2g","2g","2d","2e","2e","2d","3b","3b","3a","3a","2g"};
        playNotes(surprise,keyBoard);
        Thread.sleep(1000);
        driver.quit();

    }

    public void playNotes(String[] notes, HashMap<String, WebElement> instrument) throws InterruptedException {
        for (String note : notes) {
            instrument.get(note).click();
            Thread.sleep(1000);
        }
    }

}
