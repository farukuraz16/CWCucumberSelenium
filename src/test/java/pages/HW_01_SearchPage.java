package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HW_01_SearchPage {
    private WebDriver driver;

    public HW_01_SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(name = "q")
    public WebElement searchText;

    public void searchFor(String key){
        searchText.sendKeys(key+ Keys.ENTER);
    }
}
