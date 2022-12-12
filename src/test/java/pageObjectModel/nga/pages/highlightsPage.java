package pageObjectModel.nga.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class highlightsPage {

    public highlightsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//dt[@class='title']")public List<WebElement> collectionHighlights;

    public void chooseHighlights(String option){
        String optionUpd=option.toLowerCase().trim();

        HashMap<String,WebElement> opts=new HashMap<>();

        for (WebElement opt:collectionHighlights){
            opts.put(opt.getText().toLowerCase(),opt);
        }

        if(opts.containsKey(optionUpd)){
            opts.get(optionUpd).click();
        }else {
            System.out.println("No such option");
        }
    }
}
