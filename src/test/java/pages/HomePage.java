package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;
import util.SeleniumUtils;

public class HomePage {
    private static WebDriver driver = Driver.getDriver();

    public HomePage(){

        PageFactory.initElements(driver, this);
    }

//    @FindBy(id = "search_query_top")
//    public WebElement searchField;


}
