package seleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
<<<<<<< HEAD
import org.testng.annotations.Test;
=======
>>>>>>> d1a70d19569c88aa9390c4c2c4986de0d28df671

import java.util.List;

public class xpathPractice {
<<<<<<< HEAD
    private static WebDriver driver;
    public static void main(String[] args) {
=======

    public static final String BASE_URL = "https://www.hyrtutorials.com/p/add-padding-to-containers.html";
    public static WebDriver driver;

    public static void main(String[] args) {

>>>>>>> d1a70d19569c88aa9390c4c2c4986de0d28df671
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        chapter1();
<<<<<<< HEAD
    }

    public static void highlight(WebElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
        jsExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
    }

    //XPath Axes
        public static void chapter1(){
            driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
            JavascriptExecutor jse = (JavascriptExecutor)driver;
            jse.executeScript("window.scrollBy(0,500)");
//            highlight(driver.findElement(By.xpath("//label[text()='Repeat Password']/following-sibling::input[@type='password']")));
            driver.findElement(By.xpath("//td[text()='Maria Anders']/preceding-sibling::td/child::input")).click();
//            highlight(driver.findElement(By.xpath("//label[text()='Password']/following::input")));
            //td[text()='Helen Bennett']/ancestor-or-self::*
            //table[@id='contactList']/descendant-or-self::*
            //label[text()='Password']/preceding::input[1]
        }

    //XPath Shortcuts
    public static void chapter2() {
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");

        // text() -> .
        highlight(driver.findElement(By.xpath("//h1[.='Register']")));
        highlight(driver.findElement(By.xpath("//a[contains(.,'account')]")));
        highlight(driver.findElement(By.xpath("//td[starts-with(.,'Maria')]")));
        highlight(driver.findElement(By.xpath("//label[normalize-space(.)='First Name']")));

        // child -> /
        highlight(driver.findElement(By.xpath("//div[@class='container']/h1")));

        //parent - > /..
        highlight(driver.findElement(By.xpath("//h1[.='Register']/..")));

        //descendant -> //
        List<WebElement> elements = driver.findElements(By.xpath("//table[@id='contactList']//td"));
        for (WebElement element : elements) {
            highlight(element);
        }
    }
}

=======
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
>>>>>>> d1a70d19569c88aa9390c4c2c4986de0d28df671
