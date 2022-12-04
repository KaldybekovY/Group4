package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class xpathPractice {
    public static final String BASE_URL = "https://www.hyrtutorials.com/p/add-padding-to-containers.html";
    private static WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        chapter2();

    }

    public static void highlight(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
        jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
    }

    //xpath Axes
    public static void chapter1(){
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
//        highlight(driver.findElement(By.xpath("//label[text() = 'Repeat Password']/following-sibling::input")));
        driver.findElement(By.xpath("//td[text()='Helen Bennett']/ancestor-or-self::*"));

    }
    public static void chapter2(){
        driver.get(BASE_URL);
        highlight(driver.findElement(By.xpath("//button[.='Register']")));
        highlight(driver.findElement(By.xpath("//div[@class='container']/h1")));
        List<WebElement>elements = driver.findElements(By.xpath("//table[@id = 'contactList']//td"));
        for (WebElement element: elements){
            highlight(element);
        }



    }







}
