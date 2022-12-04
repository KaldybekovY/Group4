package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;
import java.time.Duration;
import java.util.List;

public class findDynamicElement {

    @Test
    public void worldCubScores() throws InterruptedException {

        //Arrange is for setting up
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().deleteAllCookies(); // deletes all cookies, it is useful command to clean up at the start of the test
        driver.get("https://google.com");

        //Act is where we mimic the actions of users

        driver.findElement(By.name("q")).sendKeys("world cub");
        Thread.sleep(5000);
        List<WebElement> list = driver.findElements(By.xpath("//ul//li[@role='presentation']"));
        System.out.println("Total number of suggestions in search box: " + list.size());

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).getText().contains("world cup scores")) {
                list.get(i).click();
                Thread.sleep(2000);
                break;
            }
        }

        WebElement header = driver.findElement(By.xpath("//div[@class='LOaav']//div[contains(text(),'FIFA World Cup Qatar 2022™')]"));
        Assert.assertEquals(header.getText().trim(), "FIFA World Cup Qatar 2022™");

        //Xpath axes- is nothing but relationship between your current element to the target element

    }
}
