package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.BrokenBarrierException;

public class FindDynamicElement {
      @Test
    public void WorldCupScores() throws InterruptedException {
          //Arrange is for setting up
          //AAA
          WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().deleteAllCookies();//deleteAll Cookies(useful at the start of the test)
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          driver.get("https://google.com");
          driver.findElement(By.name("q")).sendKeys("world cup");
          List<WebElement>list = driver.findElements(By.xpath("//ul//li"));
          for(WebElement e: list){
              System.out.println(e.getText());
          }
          for (int i = 0; i < list.size(); i++) {
              if(list.get(i).getText().contains("world cup scores")){
                  list.get(i).click();
                  break;
              }
          }
          Thread.sleep(3000);
          WebElement header = driver.findElement(By.xpath("//div[@class='LOaav']/descendant::div[@class='N0LMJe ellipsisize']"));
          Assert.assertEquals(header.getText().trim(), "FIFA World Cup 2022™");

      }


}
