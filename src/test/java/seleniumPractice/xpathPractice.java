package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class xpathPractice {

    public static final String BASE_URL = "https://www.hyrtutorials.com/p/add-padding-to-containers.html";
    public static WebDriver driver;

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        chapter1();
        chapter2();
        chapter3();

    }

    public static void highLight(WebElement element){
        JavascriptExecutor jsExecutor= (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
        jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
    }
    //xpath axes
    public static void chapter1(){
        driver.get(BASE_URL);
        //highLight(driver.findElement(By.xpath("//label[.='Repeat Password']//following-sibling::input")));
        driver.findElement(By.xpath("//td[.='Helen Bennett']/ancestor-or-self::*"));
    }
    public static void chapter2(){
        driver.get(BASE_URL);
        highLight(driver.findElement(By.xpath("//button[.='Register']")));
    }

    public static void chapter3(){
        driver.get(xpathPractice.BASE_URL);
        highLight(driver.findElement(By.xpath("//button[.='Register']")));
        highLight(driver.findElement(By.xpath("//table//..")));
        highLight(driver.findElement(By.xpath("//article")));
        highLight(driver.findElement(By.xpath("h1[.='Register']/..")));

        List<WebElement> elementList = driver.findElements(By.xpath("//table[id='contactList']//td"));
        for(WebElement element: elementList) {
            highLight(element);
        }
    }
}
