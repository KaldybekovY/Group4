package pageObjectModel.nga.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.List;

public class collectionPage {
    public collectionPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h3[@class='promo-heading']")
    public List<WebElement> highlights;

    public void discoverOption(String option){
        String optionUpd=option.toLowerCase().trim();

        HashMap<String,WebElement> opts=new HashMap<>();

        for (WebElement opt:highlights){
            opts.put(opt.getText().toLowerCase(),opt);
        }

        if(opts.containsKey(optionUpd)){
            opts.get(optionUpd).click();
        }else {
            System.out.println("No such option");
        }
    }
}
